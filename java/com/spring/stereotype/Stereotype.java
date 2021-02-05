package com.spring.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton") // to give same object whenever called
//@Scope("prototype") to five different hasCode when called
public class Stereotype {
	@Value("Vishal Sharma")
	private String name;
	@Value("West Bengal")
	private String Address;
	@Value("Siliguri")
	private String City;
	
	
	@Value("#{phone_numbers}")
	private List<String> phoneNo;
	
	
	
	public List<String> getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(List<String> phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	
	@Override
	public String toString() {
		return "Stereotype [name=" + name + ", Address=" + Address + ", City=" + City + ", phoneNo=" + phoneNo + "]";
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	public Stereotype() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
}
