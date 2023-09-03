package org.springframework.cdpay;

import org.springframework.cdpay.config.CDPlayConfig;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = CDPlayConfig.class)
public class Main {

	public static void main(String[] args) {
		System.out.println("abcde");
	}
}
