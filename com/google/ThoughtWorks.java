package com.google;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThoughtWorks {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any string with numbers");
		String line = br.readLine();
		
		for (int i = 0; i < line.length(); i++) {
			int N = Character.getNumericValue(line.charAt(i));
			System.out.println(line);
		}
	}

}
