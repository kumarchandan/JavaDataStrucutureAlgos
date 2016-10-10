package com.book.java.recursion;

public class Recursion {
	
	// Factorial : Recursion
	private static int recursiveFactorial(int n) {
		if(n < 0)
			return 0;
		if(n == 0) {
			return 1;
		}else {
			return n * recursiveFactorial(n - 1);
		}
	}
	
	// Add Array Elems : Recursion
	public static int addArrElems(int[] arr, int n) {
		
		if(n == 1) {
			return arr[0];
		} else {
			return addArrElems(arr, n-1) + arr[n - 1];
		}
	}
	
	// Main Class
	public static void main(String[] args){
		
		System.out.println("Factorial of 5 is: "+ recursiveFactorial(89));
		
		int[] arr = {1,2,3,4};
		System.out.println("Sum is: "+addArrElems(arr, 4));
		
	}
}
