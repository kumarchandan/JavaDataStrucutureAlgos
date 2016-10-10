package com.book.java.arrays;

public class Scores {
	
	private static final int MAX_ENTRIES = 10;
	protected int numEntries;
	protected GameEntry[] entries;
	
	public Scores(){
		entries = new GameEntry[MAX_ENTRIES];
		numEntries = 0;
	}
	
	public String toString(){
		String s = "[";
		
		for(int i=0; i<numEntries; i++){
			if(i>0)
				s += ",";									// Separate entries by comma
			s += entries[i];
		}
		return s + "]";
	}
	
	// methods for updating the set of high scores go here
	
	public void add(GameEntry entry){
		int newScore = entry.getScore();
		
		// Check if the new entry entry is a high score
		if(numEntries == MAX_ENTRIES){							// Array is full
			if(newScore <= entries[numEntries-1].getScore())
				return;											
		}else													// Array is not full
			numEntries++;
		
		// Locate the place that the new (high score) entry e belongs
		int i = numEntries-1;
		
		for( ;(i >= 1) && (newScore > entries[i-1].getScore()); i--)
			entries[i] = entries[i-1];							// Move entry i one to the right
		
		entries[i] = entry;										// Add the new score to entries
	}
	
	public GameEntry remove(int i) throws IndexOutOfBoundsException{
		
		if((i<0) || (i>numEntries))
			throw new IndexOutOfBoundsException("Invalid index: "+i);
		GameEntry temp = entries[i];
		
		for(int j=i; j<numEntries-1; j++)
			entries[j] = entries[j+1];
		entries[numEntries-1] = null;
		numEntries--;
		return temp;											// return the removed object
	}
}
