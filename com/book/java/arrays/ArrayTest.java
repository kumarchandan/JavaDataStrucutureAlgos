package com.book.java.arrays;

import java.util.Arrays;
import java.util.Random;

//	A simple test for some built-in methods
//	in java.util.Arrays

public class ArrayTest {
	
	public static int countVowel(String str){
		if(str == null){
			return 0;
		}
		int count = 0;
		char[] data = str.toCharArray();
		int N = data.length;
		for(int i=0; i<N; i++){
			if(data[i] == 'a' || data[i] == 'e' || data[i] == 'i' || data[i] == 'o' || data[i] == 'u'){
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		
		String str = "What are you doing? ta da";
		int result = ArrayTest.countVowel(str);
		System.out.println("Number of vowels in this string is: "+result);
		
		
		int num[] = new int[10];
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		
		// fill the array with pseudo-random numbers from 0 to 99
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(100);				// next pseudo random number
		}
		
		int[] old = num.clone();
		
		System.out.println("Arrays before sorting: "+Arrays.equals(num, old));
		Arrays.sort(num);
		System.out.println("Arrays after sorting: "+Arrays.equals(num, old));
		System.out.println("Old Array: "+Arrays.toString(old));
		System.out.println("New Array: "+Arrays.toString(num));
		
	}

}
