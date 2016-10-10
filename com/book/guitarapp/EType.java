package com.book.guitarapp;

public enum EType {
	ACOUSTIC, ELECTRIC;
	
	public String toString(){
		switch (this) {
		case ACOUSTIC:
			return "acoustic";
		case ELECTRIC:
			return "electric";
		default:
			return null;
		}
	}
}