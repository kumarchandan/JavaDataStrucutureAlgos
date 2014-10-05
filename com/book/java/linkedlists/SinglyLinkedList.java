package com.book.java.linkedlists;

public class SinglyLinkedList {
	
	protected Node head;		// head node of list
	protected Node tail;		// tail node of list
	protected long size;		// no of nodes in list
	
	public SinglyLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}
	
	// ... Update and Search method will go here
	
	public void addFirst(Node node){
		node.setNext(head);
		head = node;
		size++;
	}
	
	public void removeFirst(){
		if(head == null){
			System.out.println("List is empty");
			return;
		}
		Node temp = head;
		head = head.getNext();
		temp.setNext(null);
		size--;
	}
	
	public void addLast(Node node){
		
		node.setNext(null);
		if(tail != null){
			tail.setNext(node);
		}
		tail = node;
		size++;
	}
	
//	public void traverse(){
//		
//		Node current = head;
//		while(current.getNext() != null){
//			System.out.println("Node traversal -> Elments are: "+current.getElement());
//			current = current.getNext();
//		}
//	}
	
	public long getSize(){
		return size;
	}
	
	public String getFirstElement(){
		return head.getElement();
	}
	public String getLastElement(){
		return tail.getElement();
	}
}
