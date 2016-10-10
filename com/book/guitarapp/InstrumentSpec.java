package com.book.guitarapp;

public abstract class InstrumentSpec {
	
	private EBuilder builder;
	private String model;
	private EType type;
	private EWood topWood;
	private EWood backWood;
	
	public InstrumentSpec(EBuilder builder, String model, EType type,
			EWood topWood, EWood backWood) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.topWood = topWood;
		this.backWood = backWood;
	}
	
	public EBuilder getBuilder() {
		return builder;
	}

	public void setBuilder(EBuilder builder) {
		this.builder = builder;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public EType getType() {
		return type;
	}

	public void setType(EType type) {
		this.type = type;
	}

	public EWood getTopWood() {
		return topWood;
	}

	public void setTopWood(EWood topWood) {
		this.topWood = topWood;
	}

	public EWood getBackWood() {
		return backWood;
	}

	public void setBackWood(EWood backWood) {
		this.backWood = backWood;
	}

	public boolean matches(InstrumentSpec otherSpec){
		
		if(builder != otherSpec.builder)
			return false;
		if((model != null) && (!model.equals("")) && (!model.equals(otherSpec.model)))
			return false;
		if(type != otherSpec.type)
			return false;
		if(backWood != otherSpec.backWood)
			return false;
		if(topWood != otherSpec.topWood)
			return false;
		return true;
	}
	
}
