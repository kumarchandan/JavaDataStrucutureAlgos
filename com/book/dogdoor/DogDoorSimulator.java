package com.book.dogdoor;

public class DogDoorSimulator {

	public static void main(String[] args) {
		
		DogDoor door = new DogDoor();
		
//		Remote remote = new Remote(door);
		BarkRecognizer bark = new BarkRecognizer(door);
		
		System.out.println("Fido barks to go outside.");
//		remote.pressButton();
		bark.recognize("Woof!");
		System.out.println("Fido has gone outside.");
		System.out.println("Fido's all done");
		try {
//			Thread.currentThread();
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		}
		System.out.println("But Fido's stuck outside.");
		System.out.println("Fido starts barking.");
//		remote.pressButton();
		bark.recognize("Woof!");
		System.out.println("Fido's back inside.");
	}

}
