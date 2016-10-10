package com.book.dogdoor;

public class Bark {
	
	private String sound;
	
	// Constructor Sound
	public Bark(String sound) {
		this.sound = sound;
	}
	
	// Return Sound
	public String getSound(){
		return sound;
	}
	
	// Check Sound
	public boolean equals(Object bark){
		
		if(bark instanceof Bark){
			Bark otherBark = (Bark) bark;
			if(this.sound.equalsIgnoreCase(otherBark.sound)){
				return true;
			}
		}
		return false;
	}
}
