package com.spring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/stereotype/stereo.config.xml");
		Stereotype st = context.getBean("stereotype",Stereotype.class);
//		System.out.println(st);
//		System.out.println(st.getPhoneNo());
		System.out.println(st.hashCode());
		Stereotype st1 = context.getBean("stereotype",Stereotype.class);
		System.out.println(st1.hashCode());
	}
}
