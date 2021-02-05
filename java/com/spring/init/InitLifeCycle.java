package com.spring.init;

public class InitLifeCycle 
{
	private String name;

	@Override
	public String toString() {
		return "InitLifeCycle [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting name");
		this.name = name;
	}

	public InitLifeCycle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void init()
	{
		System.out.println("Calling init.....................");
	}
	public void destroy()
	{
		System.out.println("Calling destroy..................");
	}
}
