package com.ht;

/**
 * ʹ������ʵ��һ��ջ
 * */
public class LinkStrack {
	private Link link;
	private int top = -1;
	private int size;
	
	public LinkStrack(){
		link = new Link();
		size = 100;
	}
	
	public LinkStrack(int size){
		link = new Link();
		this.size = size;
	}
	
	/**
	 * ��ջ
	 * */
	public void push(Object o){
		/**
		 * �ж�ջ�������Ƿ�����
		 * ���˾Ͳ�����ջ
		 * */
		if(top==size-1){
			System.out.println("ջ�Ѿ�����");
			return;
		}
		top++;
		/**
		 * �������������һ������
		 * */
		Node n = new Node();
		n.setContent(o);
		link.addNode(n);
		 
	}
	/**
	 * ��ջ
	 * */
	public Object pop(){
		if(top==-1){
			System.out.println("ջΪ����");
			return null;
		}
		top--;  
		/**
		 * ���������淵�����һ���ڵ������
		 * ������β����ǰһ���ڵ�ĺ�һ���ڵ�����Ϊ��
		 * */
		Node p = this.link.getHead();
		/**
		 * ����ڵ����һ���ڵ����һ���ڵ�Ϊ��˵���ǵ����ڶ����ڵ�
		 * ����pһֱ����߱�������
		 * */
		while(p.getNext().getNext()!=null){
			p = p.getNext();
		}
		Object obj =  p.getNext().getContent();
		p.setNext(null);
		return obj;
		  
	}
	public Boolean isEmpty(){
		/**
		 * �ж�ջ�Ƿ�Ϊ��
		 * */
		if(this.top==-1){
			return true;
		}else{
			return false;
		}
	}
}
