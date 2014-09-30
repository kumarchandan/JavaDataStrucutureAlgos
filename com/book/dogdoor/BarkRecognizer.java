package com.book.dogdoor;

public class BarkRecognizer {
	
	DogDoor door = new DogDoor();
	
	public BarkRecognizer(DogDoor door){
		this.door = door;
	}
	
	public void recognize(String bark){
		System.out.println("Barkrecongnizer: Heard a '"+bark+"'");
		door.open();
	}
}
