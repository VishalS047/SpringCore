package com.spring.auto.wire.annotation;

public class Address 
{
	private String street;
	private String colony;
	private String city;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getColony() {
		return colony;
	}
	public void setColony(String colony) {
		this.colony = colony;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", colony=" + colony + ", city=" + city + "]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
