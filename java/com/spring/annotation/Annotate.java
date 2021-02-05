package com.spring.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Annotate {
	private String name;

	public Annotate() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Annotate [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@PostConstruct
	public void start()
	{
		System.out.println("INIT CALLED");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("INIT DESTROYED");
	}
}
