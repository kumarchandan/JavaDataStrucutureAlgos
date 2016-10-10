package com.book.guitarapp;

public class MandolinSpec extends InstrumentSpec {

	public MandolinSpec(EBuilder builder, String model, EType type,
			EWood topWood, EWood backWood, EStyle style) {
		super(builder, model, type, topWood, backWood);
		this.style = style;
	}
	
	private EStyle style;

	public EStyle getStyle() {
		return style;
	}

	public void setStyle(EStyle style) {
		this.style = style;
	}
	
	public boolean matches(MandolinSpec otherSpec) {
		
		if(!super.matches(otherSpec)) {
			return false;
		}
		if(!(otherSpec instanceof MandolinSpec)) {
			return false;
		}
		
		if(style.equals(otherSpec.style)) {
			return false;
		}
		return true;
	}
	
}
