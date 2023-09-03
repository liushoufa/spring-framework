package org.springframework.shoufa.test;

import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

public class SingleThreadExecutorTest {

//	Integer count = 1000000;

	public static final int SLEEP_GAP = 500;

	static class TargetTask implements Runnable{
		static AtomicInteger taskNo = new AtomicInteger(1);
		private String taskName;
		public TargetTask() {
			taskName = "task-" + taskNo.get();
			taskNo.incrementAndGet();
		}

		public void run() {
			System.out.println("任务：" + taskName + " doing");
			// 线程睡一会
			try {
				Thread.sleep(SLEEP_GAP);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			System.out.println(taskName + " 运行结束");
		}
	}

	@Test
	public void testSingleThreadException() {
		ExecutorService pool = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 5; i++) {
			pool.execute(new TargetTask());
			pool.submit(new TargetTask());
		}
		try {
			Thread.sleep(1000 * 1000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		// 关闭线程池
		pool.shutdown();
	}
}
