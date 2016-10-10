package com.book.dogdoor;

public class Remote {

	DogDoor door = new DogDoor();
	
	// Constructor
	public Remote(DogDoor door){
		this.door = door;
	}
	
	// Press Button - to Open or Close the Door
	public void pressButton(){
		
		System.out.println("Pressing remote control button...");
		if(door.isOpen()){
			door.close();
		}else{
			door.open();
		}
	}
}
