package com.book.java.arrays;

public class TwoDArray {

	public static void main(String args[]) {
		
		int counter = 0;
		int[][] twoDArr = new int[8][10];
		
		for (int i = 0; i < twoDArr.length; i++) {
			for (int j = 0; j < twoDArr[0].length; j++) {
				twoDArr[i][j] = counter++;
			}
		}
		
		
	}
}
