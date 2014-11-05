/** 
 * 	Interface for a stack: a collection of object that are inserted and
 *  removed according to last-in first-out principle. This method includes
 *  the main method of java.util.Stack
 */
package com.book.java.stacks;

/**
 * @author I077564
 *
 */
public interface IStack<E> {
	
	
	public int size();
	public boolean isEmpty();
	public E top() throws EmptyStackException;
	public void push(E element);
	public E pop() throws EmptyStackException;
	
}
