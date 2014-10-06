package com.book.java.recursion;

public class Recursion {
	
	public static int recursiveFactorial(int n){
		if(n == 0) return 1;
		else
			return n * recursiveFactorial(n-1);
	}
	
	public static void main(String[] args){
		System.out.println("Factorial of 5 is: "+recursiveFactorial(5));
	}
}
