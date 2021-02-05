package com.spring.init.intrface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ImplementingInit implements InitializingBean,DisposableBean
{
	private String name;

	public ImplementingInit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ImplementingInit [name=" + name + "]";
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("My name is Vishal and I am the destruction");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("My name is Vishal and I am the Creation");
	}
	
}
