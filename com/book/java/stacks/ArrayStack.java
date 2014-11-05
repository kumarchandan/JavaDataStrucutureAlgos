/**
 *  Implementation of a Stack ADT using a fixed-length array. An
 *  exception is thrown on push operation if the size of the stack
 *  is equal to the size of the array. This class includes the main
 *  methods of built-in class java.util.Stack.
 */
package com.book.java.stacks;

import java.util.Arrays;

/**
 * @author I077564
 *
 */
public class ArrayStack<E> implements IStack<E> {
	
	protected int capacity;						// actual capacity of the array
	public static final int CAPACITY = 1000; 	// default capacity of the array
	protected E S[];							// Generic array used to implement stack
	protected int top = -1;						// index for the top of the stack
	
	public ArrayStack(){
		this(CAPACITY);
	}
	
	@SuppressWarnings("unchecked")
	public ArrayStack(int capacity){
		this.capacity = capacity;
		S = (E[]) new Object[capacity];
	}
	
	/* (non-Javadoc)
	 * @see com.book.java.stacks.IStack#size()
	 */
	public int size() {
		return top + 1;
	}

	/* (non-Javadoc)
	 * @see com.book.java.stacks.IStack#isEmpty()
	 */
	public boolean isEmpty() {
		return (size() > 0);
	}

	/* (non-Javadoc)
	 * @see com.book.java.stacks.IStack#top()
	 */
	public E top() throws EmptyStackException {
		if(isEmpty()) throw new EmptyStackException("Stack is Empty.");
		return S[top];
	}

	/* (non-Javadoc)
	 * @see com.book.java.stacks.IStack#push(java.lang.Object)
	 */
	public void push(E element) {
		if(size() == capacity) throw new FullStackException("Stack is full.");
		S[++top] = element;
	}

	/* (non-Javadoc)
	 * @see com.book.java.stacks.IStack#pop()
	 */
	public E pop() throws EmptyStackException {
		
		E element;
		if(isEmpty()) throw new EmptyStackException("Stack is Empty");
		
		element = S[top];
		S[top--] = null;			// dereference S[top] for garbage collection
		return element;
	}

	@Override
	public String toString() {
		return "ArrayStack [capacity=" + capacity + ", S=" + Arrays.toString(S)
				+ ", top=" + top + "]";
	}
	
	public void status(String op, Object element){
		System.out.print("----> "+ op);
	}
	
	public static void main(String[] args){
		Object o; 
		ArrayStack<Integer> A = new ArrayStack<Integer>(); 
		A.status( "new ArrayStack<Integer> A", null); 
		A.push(7); 
		A.status("A. push (7) ", null); 
		o = A.pop(); 

		A.push(9); 
		o = A.pop(); 
		A.status(" A. pope) ", 0); 
		ArrayStack<String> B =  new ArrayStack<String>();
		B.push("Alice"); 
		B.push("Eve"); 
	}
}
