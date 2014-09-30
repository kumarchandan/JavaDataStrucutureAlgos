package com.book.java.arrays;

public class TestGame {

	public static void main(String[] args) {
		
		GameEntry gameEntry = new GameEntry("John Cena", 56);
		String data = gameEntry.toString();
		System.out.println(data);
		
		Scores score1 = new Scores();
		
		
		GameEntry gameEntry2 = new GameEntry("Hugh Jackman", 87);
		GameEntry gameEntry3 = new GameEntry("Super Kings", 450);
		GameEntry gameEntry4 = new GameEntry("Lovely Professional", 129);
		GameEntry gameEntry5 = new GameEntry("Rahane Livan", 2089);
		GameEntry gameEntry6 = new GameEntry("Robert Jr", 870);
		GameEntry gameEntry7 = new GameEntry("Namo Ji", 9999);
		
		score1.add(gameEntry);
		score1.add(gameEntry2);
		score1.add(gameEntry3);
		score1.add(gameEntry4);
		score1.add(gameEntry5);
		score1.add(gameEntry6);
		score1.add(gameEntry7);
		String data2 = score1.toString();
		System.out.println(data2);
		
//		GameEntry gameEntryGone = score1.remove(5);
//		System.out.println(gameEntryGone);
	}

}
