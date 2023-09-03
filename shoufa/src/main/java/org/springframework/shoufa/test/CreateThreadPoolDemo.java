package org.springframework.shoufa.test;

import org.junit.Test;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CreateThreadPoolDemo {

	@Test
	public void testThreadPoolExecutor() {
		ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 100, 100,
				TimeUnit.SECONDS, new LinkedBlockingDeque<>(100));
		for (int i = 0; i < 5; i++) {
			final int taskIndex = i;
			executor.execute(() -> {
				System.out.println("taskIndex = " + taskIndex);
				try {
					Thread.sleep(Long.MAX_VALUE);
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			});
		}
		while(true) {
			// 每隔一秒，输出线程池的工作任务数量、总计的任务数量
			System.out.println("-activeCount:" + executor.getActiveCount() + " - taskCount:" + executor.getTaskCount());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}
}
