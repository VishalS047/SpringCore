package com.spring.init.intrface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.init.InitLifeCycle;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/init/intrface/config.xml");
		ImplementingInit lc =(ImplementingInit) context.getBean("Value1");
		context.registerShutdownHook();
		System.out.println(lc);
	}
}
