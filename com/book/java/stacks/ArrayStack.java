/**
 *  Implementation of a Stack ADT using a fixed-length array. An
 *  exception is thrown on push operation if the size of the stack
 *  is equal to the size of the array. This class includes the main
 *  methods of built-in class java.util.Stack.
 */
package com.book.java.stacks;

import com.book.java.stacks.exception.EmptyStackException;
import com.book.java.stacks.exception.FullStackException;

/**
 * @author I077564
 *
 */
public class ArrayStack<E> implements IStack<E> {
	
	protected int capacity;
	public static final int CAPACITY = 1000;
	protected int top = -1;
	protected E[] S;
	
	
	public ArrayStack() {
		this(CAPACITY);
	}
	
	public ArrayStack(int cap) {
		super();
		capacity = cap;
		S = (E[]) new Object[capacity];
	}

	@Override
	public int size() {
		return (top + 1);
	}

	@Override
	public boolean isEmpty() {
		return (top < 0);
	}

	@Override
	public E top() throws EmptyStackException {
		return S[top];
	}

	@Override
	public void push(E element) throws FullStackException {
		if (size() == capacity) {
			throw new FullStackException("Stack is Full");
		}
		S[++top] = element;
	}

	@Override
	public E pop() throws EmptyStackException {
		E element;
		if(isEmpty()) {
			throw new EmptyStackException("Empty Stack");
		}
		element = S[top];
		S[top--] = null;
		return element;
	}
	
	public void toStr() {
		System.out.println("Elements in Array");
		for (E element : S) {
			System.out.println(element);
		}
	}
	
	public static void main(String args[]) {
		
		ArrayStack<Integer> arr = new ArrayStack<Integer>(8);
		arr.push(3);
		arr.push(23);
		arr.push(2);
		arr.push(12);
		arr.toStr();
		
		arr.pop();
		arr.toStr();
		arr.pop();
		arr.toStr();
		
	}
	
}
