package com.ht;

/**
 * Node用来表示一个节点
 * Node也有一些属性
 * Node也有一些方法
 * */
public class Node {
	/**
	 * 节点内容
	 * */
	private Object content;
	
	/**
	 * 下一个节点
	 * */
	private Node next;

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
}
