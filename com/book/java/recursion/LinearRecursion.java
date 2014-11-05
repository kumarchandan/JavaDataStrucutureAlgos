package com.book.java.recursion;

public class LinearRecursion {
	
	// Linear Recursion to get Sum of array
	public static int LinearSum(int[] A, int n){
		if( n > A.length || n <= 0)
			return 0;
		
		if(n == 1)
			return A[0];
		else
			return LinearSum(A, n-1) + A[n-1];
	}
	
	// Binary Recursion to get Sum of Array
	public static int BinarySum(int[] A, int i, int n){
		
		if(n == 1)
			return A[0];
		else
			return BinarySum(A, i, n/2) + BinarySum(A, i+n/2, n/2);
	}
	
	
	// Helping class to Swap values in Array
	public static int[] swap(int[] A, int i, int j){
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
		return A;
	}
	
	public static int[] LinearReverseArray(int[] A, int i, int j){
		if(i < j){
			swap(A, i, j);
			LinearReverseArray(A, i+1, j-1);
		}
		return A;
	}
	
	
	// Main Thread
	public static void main(String[] args){
		
		// Test for LinearSum
		int[] A = {10,9,3,44,7,5,11};
		System.out.print("Original Array is: ");
		for(int i : A){
			System.out.print(" "+i);
		}
		int a = LinearSum(A, 6);
		System.out.println(" and Its Sum is: "+a);
		
		// Test for LinearReverse
		int[] R = LinearReverseArray(A, 0, A.length-1);
		System.out.print("Reversed Array is: ");
		for (int i : R) {
			System.out.print(" "+i);
		}
	}
}
