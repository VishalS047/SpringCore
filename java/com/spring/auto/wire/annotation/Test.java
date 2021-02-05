package com.spring.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/auto/wire/annotation/config2.xml");
		Student st = context.getBean("Student1",Student.class);
		System.out.println(st);
		System.out.println(st.getAddress());
	}
}
