package com.book.dogdoor;

public class Remote {

	DogDoor door = new DogDoor();
	
	public Remote(DogDoor door){
		this.door = door;
	}
	
	public void pressButton(){
		
		System.out.println("Pressing remote control button...");
		
		if(door.isOpen()){
			door.close();
		}else{
			door.open();
		}
	}
}
