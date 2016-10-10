package com.google;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StandingOvation {

	public static void main(String args[]) {
		
		try(BufferedReader br = new BufferedReader(new FileReader("C:/Users/I077564/Documents/everyone/sample.txt"))) {
			
			String currentLine;
			int counter = 0;
			int noOfTestCases = 0;
			int testCaseNo = 0;
			int sMax = 0;
			int s0, s1, s2, s3, s4, s5, s6, s7, s8, s9;
			
			while((currentLine = br.readLine()) != null) {
				
				String[] valuesArray = currentLine.split("");
				counter++;
				testCaseNo = counter - 1;
				
				if(counter == 1) {
					noOfTestCases = Integer.parseInt(currentLine);
				}
				if(counter != 1) {
					for (int i = 0; i < valuesArray.length; i++) {
						sMax = Integer.parseInt(valuesArray[0]);
						
					}
					
				}
				
				System.out.println(currentLine);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
