package com.spring.constructor;

public class Person 
{
	private int personAge;
	private String personName;
	private String personMobile;
	private Certificate certi;
	public Person(int personAge, String personName, String personMobile,Certificate certi) {
		super();
		this.personAge = personAge;
		this.personName = personName;
		this.personMobile = personMobile;
		this.certi = certi;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "person's age is: "+this.personAge+", person's name is: "+this.personName+", "
				+ "person's phone number is: "+this.personMobile+", Cetrificate issued is: "+this.certi.name;
	}
}
