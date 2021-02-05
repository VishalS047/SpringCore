package com.spring.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/annotation/config.xml");
		context.registerShutdownHook();
		Annotate at = (Annotate)context.getBean("Name1");
		System.out.println(at);
	}
}
 