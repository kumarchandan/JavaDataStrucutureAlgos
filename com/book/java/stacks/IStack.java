/** 
 * 	Interface for a stack: a collection of object that are inserted and
 *  removed according to last-in first-out principle. This method includes
 *  the main method of java.util.Stack
 */
package com.book.java.stacks;

import com.book.java.stacks.exception.EmptyStackException;

/**
 * @author I077564
 *
 */
public interface IStack<E> {
	
	// Return the number of elements in Stack
	public int size();
	
	// Return whether the Stack is empty
	public boolean isEmpty();
	
	// Inspect element at the top of the Stack
	public E top() throws EmptyStackException;
	
	// Insert element at the top of the Stack
	public void push(E element);
	
	// Remove element from the top of the Stack
	public E pop() throws EmptyStackException;
	
}
