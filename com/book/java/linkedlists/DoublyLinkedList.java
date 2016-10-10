package com.book.java.linkedlists;

public class DoublyLinkedList {
	
	protected DoublyNode header;
	protected DoublyNode trailor;
	
	protected int size;
	
	public DoublyLinkedList(){
		size = 0;
		
		header = new DoublyNode(null, trailor, null);
		trailor = new DoublyNode(null, null, header);
		
	}
	
	public int getSize(){
		return size;
	}
	
	public boolean isEmpty(){
		return (size == 0);
	}
	
	public DoublyNode getFirst(){
		if(isEmpty()){
			System.out.println("List is empty!");
			return null;
		}
		return header.getNext();
	}
	
	public DoublyNode getLast(){
		if(isEmpty()){
			System.out.println("List is empty!");
			return null;
		}
		return trailor.getPrevious();
	}
	
	public DoublyNode getPrev(DoublyNode node){
		if(node == header){
			return null;
		}
		return node.getPrevious();
	}
	
	public DoublyNode getNext(DoublyNode node){
		if(node == trailor)
			return null;
		return node.getNext();
	}
	
	public void addBefore(DoublyNode existingNode, DoublyNode newNode){
		DoublyNode prevOfeNode = existingNode.getPrevious();
		
		prevOfeNode.setNext(newNode);
		newNode.setPrevious(prevOfeNode);
		
		newNode.setNext(existingNode);
		existingNode.setPrevious(newNode);
		size++;
		
	}
	public void addAfter(DoublyNode existingNode, DoublyNode newNode){
		DoublyNode nextOfeNode = existingNode.getNext();
		
		newNode.setNext(nextOfeNode);
		nextOfeNode.setPrevious(newNode);
		
		newNode.setPrevious(existingNode);
		existingNode.setNext(newNode);
		size++;
	}
	
	public void addFirst(DoublyNode dnode){
		if(size == 0){
			header.setNext(dnode);
			dnode.setPrevious(header);
			
			dnode.setNext(trailor);
			trailor.setPrevious(dnode);
			size++;
		}else{
			DoublyNode temp = header.getNext();
			
			header.setNext(dnode);
			dnode.setPrevious(header);
			
			dnode.setNext(temp);
			temp.setPrevious(dnode);
			size++;
		}
	}
	
	public void addLast(DoublyNode dnode){
		if(size == 0){
			trailor.setPrevious(dnode);
			dnode.setNext(trailor);
			
			dnode.setPrevious(header);
			header.setNext(dnode);
			size++;
		}else{
			
			DoublyNode temp = trailor.getPrevious();
			
			dnode.setNext(trailor);
			trailor.setPrevious(dnode);
			
			dnode.setPrevious(temp);
			temp.setNext(dnode);
			size++;
		}
	}
	
	public void removeNode(DoublyNode node){
		DoublyNode prevNode = node.getPrevious();
		DoublyNode nextNode = node.getNext();
		
		if(prevNode != null && nextNode != null){
			node.setNext(null);
			node.setPrevious(null);
			
			prevNode.setNext(nextNode);
			nextNode.setPrevious(prevNode);
		}
	}
	
	public boolean hasNext(DoublyNode node){
		return node != trailor;
	}
	public boolean hasPrev(DoublyNode node){
		return node != header;
	}
	
	public void traverse(){
		System.out.println("Printing all elements of the doubly linked list...");
		
		DoublyNode currentNode = header.getNext();
		
		while(currentNode != trailor){
			System.out.println(currentNode.getElement());
			currentNode = currentNode.getNext();
		}
	}
	
	public void sort(DoublyNode dnode){
		
	}
	

}
