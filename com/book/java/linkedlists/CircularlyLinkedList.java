package com.book.java.linkedlists;

public class CircularlyLinkedList {
	
	Node cursor;
	int size;

	public CircularlyLinkedList(){
		cursor = null;
		size = 0;
	}
	
	public int size(){
		return size;
	}
	
	public Node getCursor(){
		return cursor;
	}
	
	public void add(Node node){
		if(cursor == null){
			cursor = node;
			cursor.setNext(cursor);
		}else{
			Node temp = cursor.getNext();
			cursor.setNext(node);
			node.setNext(temp);
		}
		size++;
	}
	
	public Node remove(){
		Node temp = cursor.getNext();
		
		if(temp == cursor){
			cursor = null;
			System.out.println("List is becoming empty");
		}else{
			cursor.setNext(temp.getNext());
			temp.setNext(null);
		}
		size--;
		return temp;
	}
	
	public void advance(){
		cursor = cursor.getNext();
	}

	public String toString(){
		if(cursor == null)
			return "[ ]";
		String s = "[.."+cursor.getElement();
		Node temp = cursor;
		
		for(advance(); temp != cursor; advance()){
			s += ", "+cursor.getElement();
		}
		return s+"..]";
	}
}
