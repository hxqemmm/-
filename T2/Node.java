package com.ht;

/**
 * Node������ʾһ���ڵ�
 * NodeҲ��һЩ����
 * NodeҲ��һЩ����
 * */
public class Node {
	/**
	 * �ڵ�����
	 * */
	private Object content;
	
	/**
	 * ��һ���ڵ�
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
