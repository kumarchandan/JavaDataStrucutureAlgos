package com.book.dogdoor;

import java.util.List;

public class BarkRecognizer {
	
	DogDoor door = new DogDoor();
	
	// Constructor : Set Door
	public BarkRecognizer(DogDoor door){
		this.door = door;
	}
	
	// Recognizes Dog's Bark
	public boolean recognize(Bark otherBark){
		
		boolean allowed = false;
		System.out.println("Barkrecongnizer: Heard a '"+otherBark.getSound()+"'");
		
		List<Bark> allowedBarkList = door.getAllowedBarkList();
		
		for (Bark item : allowedBarkList) {
			if(item.getSound().equals(otherBark.getSound())){
				allowed = true;
				door.open();
			}
		}
		return allowed;
	}
}
