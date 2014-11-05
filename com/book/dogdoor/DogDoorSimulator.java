package com.book.dogdoor;

public class DogDoorSimulator {

	public static void main(String[] args) {
		
		DogDoor door = new DogDoor();
		
		door.addAllowedBarkList(new Bark("Woof"));
		door.addAllowedBarkList(new Bark("Rowlf"));
		
		BarkRecognizer bark = new BarkRecognizer(door);
		
		System.out.println("Barks to go outside.");
//		remote.pressButton();
		
		boolean allowed = bark.recognize(new Bark("Woof"));
		
		if(allowed){
			System.out.println("Fido has gone outside.");
			System.out.println("Fido's all done");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("But Fido's stuck outside.");
			System.out.println("Fido starts barking.");
//			remote.pressButton();
			allowed = bark.recognize(new Bark("Rowlf"));
			if(allowed)
				System.out.println("Fido's back inside.");
			else
				System.out.println("Its not Fido's bark, Door won't be open!");
		}else{
			System.out.print("Its not Fido's bark, Door won't be open!");
		}
		
	}

}
