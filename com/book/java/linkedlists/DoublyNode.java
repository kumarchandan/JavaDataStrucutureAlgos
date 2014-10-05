package com.book.java.linkedlists;

public class DoublyNode {
	
	protected String element;
	protected DoublyNode next, previous;
	
	public DoublyNode(String element, DoublyNode next, DoublyNode previous) {
		super();
		this.element = element;
		this.next = next;
		this.previous = previous;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public DoublyNode getNext() {
		return next;
	}

	public void setNext(DoublyNode next) {
		this.next = next;
	}

	public DoublyNode getPrevious() {
		return previous;
	}

	public void setPrevious(DoublyNode previous) {
		this.previous = previous;
	}
}
