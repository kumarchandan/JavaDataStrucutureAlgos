package org.com.book.java.linkedlists;

public class SLinkedList {
	
	protected Node head;		// head node of list
	protected Node tail;		// tail node of list
	protected long size;		// no of nodes in list
	
	public SLinkedList() {
		head = null;
		size = 0;
	}
	
	// ... Update and Search method will go here
	
	public void addFirst(Node n){
		n.setNext(head);			// make n point to the old head node
		head = n;					// make variable head point to new node
		size++;
	}
	
	public void addLast(Node n){
		n.setNext(null);
		tail = n;
		size++;
	}
}
