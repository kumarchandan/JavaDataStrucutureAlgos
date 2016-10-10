package com.book.guitarapp;

public enum EWood {
	INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHAGONY, MAPLE,
	COCOBOLO, CEDAR, ALDER, SITKA;
	
	public String toString(){
		switch (this) {
		case INDIAN_ROSEWOOD:
			return "Indian Rosewood";
		case BRAZILIAN_ROSEWOOD:
			return "Brazilian Rosewood";
		case MAHAGONY:
			return "Mahagony";
		case MAPLE:
			return "Maple";
		case COCOBOLO:
			return "Cocobolo";
		case CEDAR:
			return "Cedar";
		case ALDER:
			return "Alder";
		case SITKA:
			return "Sitka";
		default:
			return null;
		}
	}
}
