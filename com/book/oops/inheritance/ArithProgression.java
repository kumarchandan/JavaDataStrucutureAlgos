package com.book.oops.inheritance;

public class ArithProgression extends Progression {
	
	protected long increment;
	
//	Default constructor setting a unit increment
	public ArithProgression() {
		this(1);
	}

//	Parametric constructor providing the increment
	public ArithProgression(long increment) {
		this.increment = increment;
	}
	
	protected long nextValue(){
		current += increment;
		return current;
	}
}
