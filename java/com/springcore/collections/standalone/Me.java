package com.springcore.collections.standalone;
import java.util.*;

public class Me 
{
	private List<String> friends;
	private Map<String,String> fees;

	public Map<String, String> getFees() {
		return fees;
	}

	public void setFees(Map<String, String> fees) {
		this.fees = fees;
	}

	public Me() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Me [friends=" + friends + ", fees=" + fees + "]";
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
}
