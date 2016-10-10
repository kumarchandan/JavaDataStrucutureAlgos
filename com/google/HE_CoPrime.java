package com.google;

import java.util.Scanner;

public class HE_CoPrime {
	
	public static boolean CoPrimeOrNot(int num1, int num2) {
		int temp = 0;
		while(num2 != 0) {
			temp = num2;
			num2 = num1 % temp;
			num1 = temp;
		}
		
		if(num1 == 1) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Max's Number");
		int maxNumber = sc.nextInt();
		
		System.out.println("Give number of kids");
		int noOfKids = sc.nextInt();

        int array[] = new int[noOfKids];

        System.out.println("Enter the " + noOfKids + " numbers now.");

        for (int i = 0 ; i < array.length; i++ ) {
           array[i] = sc.nextInt();
        }
        
        sc.close();
        System.out.println("Calculated no of kids");
        
        int count = 0;
        for (int i = 0; i < array.length; i++) {
			if(CoPrimeOrNot(maxNumber, array[i])) {
				count++;
			}
		}
        System.out.println("Friends he got is :"+count);
        
	}

}
