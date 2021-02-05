package com.springcore.practicecollections;

import java.util.*;

public class Employee 
{
	private String name;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String,String> course;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, List<String> phones, Set<String> addresses, Map<String, String> course) {
		super();
		this.name = name;
		this.phones = phones;
		this.addresses = addresses;
		this.course = course;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", phones=" + phones + ", addresses=" + addresses + ", course=" + course
				+ "]";
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	
}
