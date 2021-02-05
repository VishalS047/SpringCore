package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student std = (Student)context.getBean("student1");
        Student std2 = (Student)context.getBean("student2");
        Student std3 = (Student)context.getBean("student3");
       System.out.println(std);
       System.out.println(std2);
       System.out.println(std3);
    }
}
 