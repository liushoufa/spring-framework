package org.springframework.shoufa.test;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ProxyTest {
	@Test
	public void instance() {
		try {
			MockedTest.class.newInstance();
			Constructor<?>[] constructors = MockedTest.class.getConstructors();
			for (Constructor<?> constructor : constructors) {
				constructor.newInstance();
			}
		} catch (InstantiationException e) {
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			throw new RuntimeException(e);
		}
//		Constructor
	}
}
