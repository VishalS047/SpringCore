package com.spring.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("ambiguity.config.xml");
		Addition add = (Addition)context.getBean("add");
		add.doSum();
	}
}
