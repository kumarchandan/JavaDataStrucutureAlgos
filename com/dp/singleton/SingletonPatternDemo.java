package com.dp.singleton;

import java.util.Scanner;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		
		int i = 0;
		// Get the only object available
		SingleObject object = SingleObject.getsingleinstance();
		
		// show message
		object.showMessage();
		
		Scanner inputTaker = new Scanner(System.in);
		System.out.println("Is he/she male of female: F or M");
		String gender = inputTaker.nextLine();
		
		if(gender.equalsIgnoreCase("M")){
			System.out.println("Enter his name..");
		}else if(gender.equalsIgnoreCase("F")){
			System.out.println("Enter her name..");
		}else{
			System.out.println("Invalid Gender");
		}
		
		
		String gfName = inputTaker.nextLine();
		inputTaker.close();
		while(i<999999){
			System.out.println(gfName+" loves you so much!");
			i++;
		}
		System.out.println("Yes, she does..");
	}

}
