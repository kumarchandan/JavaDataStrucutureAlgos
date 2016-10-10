package com.book.dogdoor;

public class InsertionSort {

	public int[] sort(int[] arr) {
		
		int current;
		
		for(int i = 1; i < arr.length; i++) {
			current = arr[i];
			int j = i-1;
			
			while( (j >= 0) && (arr[j] > current)) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = current;
		}
		
		return arr;
		
	}
	
	public static void main(String args[]) {
		
		int a[] = {23, 42, 1, 98, 77, 87, 22};
		InsertionSort sort = new InsertionSort();
		a = sort.sort(a);
		
		for (int i : a) {
			System.out.println(i);
		}
	}
}