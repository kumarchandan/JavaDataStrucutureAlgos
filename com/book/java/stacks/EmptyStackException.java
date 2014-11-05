/**
 * 
 */
package com.book.java.stacks;

/**
 * @author I077564
 *
 */
public class EmptyStackException extends RuntimeException {

	/**
	 * Run time exception thrown when one tries to perform operation top or pop on an empty stack
	 */
	private static final long serialVersionUID = 1L;
	
	public EmptyStackException(String str){
		super(str);
	}
}
