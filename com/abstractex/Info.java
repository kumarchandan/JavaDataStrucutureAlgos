package com.abstractex;

public class Info extends Employee {

	public Info() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayName(String name) {
		System.out.println("Name in Info : "+ name);
		return null;
	}
	
	public void displayAddress(String address) {
		System.out.println("Address in Info : "+address);
	}
	

}
