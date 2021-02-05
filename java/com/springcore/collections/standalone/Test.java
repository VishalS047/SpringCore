package com.springcore.collections.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/standalone/config.xml");
		Me m = context.getBean("person1",Me.class);
		System.out.println(m);
		System.out.println(m.getFriends().getClass().getName());
		System.out.println(m.getFees());
	}
}
