package com.spring.init;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/init/config.xml");
		InitLifeCycle ic = (InitLifeCycle)context.getBean("sample1");
		context.registerShutdownHook();
		System.out.println(ic);
	}
}
