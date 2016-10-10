package com.book.oops.inheritance;

public class FibonacciProgression extends Progression {

	protected long previous;
	Number n;
	Integer i;
	int j;
	
	public FibonacciProgression() {
		this(0,1);
	}
	
	public FibonacciProgression(long value1, long value2) throws ArrayIndexOutOfBoundsException{

		first = value1;
		previous = value2 - value1;		// Fictitious value precedes the first
	}
	
	// Advances the progression by adding the previous value to the current value
	public long nextValue(){
		long temp = previous;
		previous = current;
		current += temp;
		return current;
	}
}
