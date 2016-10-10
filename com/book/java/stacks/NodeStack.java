package com.book.java.stacks;

import com.book.java.stacks.exception.EmptyStackException;

public class NodeStack<E> implements IStack<E> {

	protected int size;
	protected Node<E> top;
	
	public NodeStack() {
		this.size = 0;
		this.top = null;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		if(top == null) {
			return true;
		}
		return false;
	}

	@Override
	public E top() throws EmptyStackException {
		if(isEmpty()) {
			throw new EmptyStackException("Stack is Empty!");
		}
		return top.getElement();
	}

	@Override
	public void push(E element) {
		Node<E> v = new Node<E>(element, top);
		top = v;
		size++;
		
	}

	@Override
	public E pop() throws EmptyStackException {
		
		if(isEmpty()) {
			throw new EmptyStackException("Stack is Empty");
		}
		E temp = top.getElement();
		top = top.getNext();
		size--;
		return temp;
	}
	
	// Reverse Array
	public void reverseArray(E[] arr) {
		
		IStack<E> iStack = new NodeStack<E>();
		
	}
	
	// Main Class
	public static void main(String args[]) {
		
		NodeStack<String> nodeStack = new NodeStack<String>();
		
		nodeStack.push("first");
		nodeStack.push("second");
		nodeStack.push("third");
		nodeStack.push("fourth");
		nodeStack.push("fifth");
		
		
		nodeStack.pop();
		nodeStack.size();
		nodeStack.isEmpty();
		
		
		
	}
	
}
