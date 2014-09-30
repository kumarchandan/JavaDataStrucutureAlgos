/**
 * This class gives the geometric progression of a number
 */
package com.book.oops.inheritance;

/**
 * @author I077564
 *
 */
public class GeomProgression extends Progression {
	
	protected long base;
	
	public GeomProgression() {
		this(2);
	}
	
	protected GeomProgression(long base){
		this.base = base;
		first = 1;
		current = first;
	}
	
	protected long nextValue(){
		current *= base;
		return current;
	}
}
