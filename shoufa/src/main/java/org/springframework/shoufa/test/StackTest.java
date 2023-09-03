package org.springframework.shoufa.test;

import org.junit.Test;

public class StackTest {

	int i = 0;

	@Test
	public void maxStack() {
		stack();
	}

	private void stack() {
		i++;
		System.err.println(i);
		if (i < 1000) {
			stack();
		}
	}
}
