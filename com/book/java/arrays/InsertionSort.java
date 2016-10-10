package com.book.java.arrays;

import java.util.Arrays;

public class InsertionSort {

	public static char[] insertionSort(char[] a){
		
		int n = a.length;
		for(int i=1; i<n; i++){
			char cur = a[i];
			int j = i-1;
			
			while((j >= 0) && (a[j]) > cur){
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = cur;
		}
		
		return a;
	}
	
	public static int[] insertionSort(int[] a){
		
		int n = a.length;
		for(int i=1; i<n; i++){
			int cur = a[i];
			int j = i-1;
			
			while((j >= 0) && (a[j]) > cur){
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = cur;
		}
		return a;
	}
	
	public static void main(String[] args){
		
		int[] arr2 = {123,4,567,34,23,12,98,9};
		arr2 = InsertionSort.insertionSort(arr2);
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(" "+arr2[i]);
		}
		
		char[] arr = {'Z','C','X','U','B','W'};
		String strArr = new String(arr);
		System.out.println("CharArray to String: "+strArr);
		char demo[] = strArr.toCharArray();
		System.out.println("String to CharArray: "+Arrays.toString(demo));
		
		arr = InsertionSort.insertionSort(arr);
		System.out.println(arr);
		

		Arrays.binarySearch(arr2, 23);
		
	}
}
