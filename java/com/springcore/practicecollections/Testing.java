package com.springcore.practicecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testing 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.collection.config2.xml");
		Employee e = (Employee)context.getBean("Employee1");
		System.out.println(e);
		System.out.println(e.getName());
		System.out.println(e.getPhones());
		System.out.println(e.getAddresses());
		System.out.println(e.getCourse());
		System.out.println(e.getClass().getName());
	}
}
