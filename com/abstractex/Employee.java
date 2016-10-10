package com.abstractex;

public abstract class Employee {
	
	private String name;
	private String address;
	
	public abstract String displayName(String name);
	
	public void displayAddress(String address) {
		System.out.println("Address in employee is : " + address);
	}
}
