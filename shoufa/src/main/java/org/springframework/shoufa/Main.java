package org.springframework.shoufa;

import org.springframework.shoufa.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.shoufa.service.Service2;

public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		applicationContext.getBean("user", User.class);
		applicationContext.getBean(Service2.class);
		System.out.println("Hello world!");
	}
}