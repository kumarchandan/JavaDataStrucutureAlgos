package com.book.guitarapp;

public class GuitarSpec {
	
	private String builder, model, type, backWood, topWood;
	private int numStrings;
	
	public GuitarSpec(String builder, String model, String type,
			String backWood, String topWood, int numStrings) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.numStrings = numStrings;
	}
	
	// Matches Guitar Specifications
	public boolean matches(GuitarSpec otherSpecs){
		
		if(builder != otherSpecs.builder)
			return false;
		if((model != null) && (!model.equals("")) && (!model.equals(otherSpecs.model)))
			return false;
		if(type != otherSpecs.type)
			return false;
		if(backWood != otherSpecs.backWood)
			return false;
		if(topWood != otherSpecs.topWood)
			return false;
		return true;
	}

	public String getBuilder() {
		return builder;
	}

	public void setBuilder(String builder) {
		this.builder = builder;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBackWood() {
		return backWood;
	}

	public void setBackWood(String backWood) {
		this.backWood = backWood;
	}

	public String getTopWood() {
		return topWood;
	}

	public void setTopWood(String topWood) {
		this.topWood = topWood;
	}

	public int getNumStrings() {
		return numStrings;
	}

	public void setNumStrings(int numStrings) {
		this.numStrings = numStrings;
	}
}
