package org.springframework.shoufa.test;

import org.junit.Test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OversoldTest {

	Integer count = 1000000;

	@Test
	public void reduceInventory() throws InterruptedException {
		List<String> user = Arrays.asList("shoufa", "qingyun", "blue", "red", "black");
		LocalDateTime startTime = LocalDateTime.now();
		Run run = new Run();
		int i = 100;
//		Thread thread;
		while (i > 0) {
			Thread thread = new Thread(run, "shoufa-" + i);
			thread.start();
//			thread.join();
			i--;
		}
//		Thread.sleep(10000);
		LocalDateTime endTime = LocalDateTime.now();
		Duration between = Duration.between(startTime, endTime);
		System.out.println(between.toMillis());
		System.out.println(count);
	}

	class Run implements Runnable {
		@Override
		public void run() {
			int i = 10000;
			while (i > 0) {
				synchronized (Run.class) {
					count -= 1;
					i--;
				}
			}
//			System.out.println(Thread.currentThread().getName());
		}
	}



	class User {
		private String name;
		private String thread;
	}
}
