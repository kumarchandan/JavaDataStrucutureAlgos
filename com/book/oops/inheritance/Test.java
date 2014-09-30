package com.book.oops.inheritance;

public class Test {
	public static void main(String[] args){
		
		ArithProgression AP1 = new ArithProgression();
		AP1.printProgression(10);
		ArithProgression AP2 = new ArithProgression(5);
		AP2.printProgression(10);
		
		GeomProgression GP1 = new GeomProgression();
		GP1.printProgression(10);
		GeomProgression GP2 = new GeomProgression(3);
		GP2.printProgression(10);
		
		FibonacciProgression FP1 = new FibonacciProgression();
		FP1.printProgression(10);
		FibonacciProgression FP2 = new FibonacciProgression(4, 6);
		FP2.printProgression(10);
	}
}
