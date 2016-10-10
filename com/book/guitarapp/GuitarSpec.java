package com.book.guitarapp;

public class GuitarSpec extends InstrumentSpec {
	
	public GuitarSpec(EBuilder builder, String model, EType type, EWood topWood,
			EWood backWood, int numStrings) {
		super(builder, model, type, topWood, backWood);
		this.numStrings = numStrings;
	}

	private int numStrings;
	
	public int getNumStrings() {
		return numStrings;
	}

	public void setNumStrings(int numStrings) {
		this.numStrings = numStrings;
	}
}
