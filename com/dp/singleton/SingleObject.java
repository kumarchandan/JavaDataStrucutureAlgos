package com.dp.singleton;

public class SingleObject {
	
	// Create an object of SingleObject
	private static SingleObject singleinstance = new SingleObject();
	
	// Make a private constructor so that this class can not be instantiated
	
	private SingleObject(){
		
	}
	// Get the only object available
	
	public static SingleObject getsingleinstance(){
		return singleinstance;
	}
	
	public void showMessage(){
		System.out.println("Hello World!");
	}
	
	public static void main(String args[]) {
		SingleObject abc = new SingleObject();
		System.out.println(abc);
	}
}
