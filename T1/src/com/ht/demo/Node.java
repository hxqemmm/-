package com.ht.demo;

public class Node {
	private Object name;
	private Node next;
	
	public Node(Object name) {
		this.name=name;
	}
	
	public Object getName() {
		return name;
	}
	public void setName(Object name) {
		this.name = name;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	

}
