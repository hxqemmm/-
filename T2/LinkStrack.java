package com.ht;

/**
 * 使用链表实现一个栈
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
	 * 入栈
	 * */
	public void push(Object o){
		/**
		 * 判断栈的内容是否满了
		 * 满了就不能入栈
		 * */
		if(top==size-1){
			System.out.println("栈已经满了");
			return;
		}
		top++;
		/**
		 * 向链表里面添加一个数据
		 * */
		Node n = new Node();
		n.setContent(o);
		link.addNode(n);
		 
	}
	/**
	 * 出栈
	 * */
	public Object pop(){
		if(top==-1){
			System.out.println("栈为空了");
			return null;
		}
		top--;  
		/**
		 * 从链表里面返回最后一个节点的数据
		 * 把链表尾部的前一个节点的后一个节点设置为空
		 * */
		Node p = this.link.getHead();
		/**
		 * 如果节点的下一个节点的下一个节点为空说明是倒数第二个节点
		 * 否则p一直向后走遍历链表
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
		 * 判断栈是否为空
		 * */
		if(this.top==-1){
			return true;
		}else{
			return false;
		}
	}
}
