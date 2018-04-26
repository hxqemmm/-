package com.ht;

/**
 * Link用来表示一个链表
 * 链表具有一些属性
 * 链表具有以些方法
 * */
public class Link {
	private Node head;
	
	public Link(){
		head = new Node();
	}
	
	public Node getHead() {
		return head;
	}  

	public void setHead(Node head) {
		this.head = head;
	}

	public void addNode(Node n){
		/**
		 * 向链表里面插入一个元素
		 * 遍历整个链表,直到链表的尾部,再执行插入
		 * 把头节点赋值给一个变量
		 * 每次循环一次变量就会变化,节点向后移动
		 * 当节点的后一个节点为空的时候说明已经到了链表的尾部
		 * 设置最后一个接口的后一个节点为n
		 * */
		Node p = head;
		while(true){
			if(p.getNext()==null){
				p.setNext(n);  
				break;
			}
			p = p.getNext();  
		}
		p.setNext(n);
	}
	public void display(){
		/**
		 * 显示链表里面的所有的元素
		 * 遍历整个链表
		 * */
		Node p = head;
		while(p.getNext()!=null){
			System.out.println(p.getNext().getContent());
			p = p.getNext();
		}
	}
	public void deleteNode(Node n){
		/**
		 * 删除一个节点
		 * 遍历整个链表,找到节点n
		 * 把这个节点的前一个节点下一个节点设置为n3
		 * */
		Node p = head;
		while(p.getNext()!=null){
			if(p.getNext().getContent().equals( n.getContent())){
				p.setNext(p.getNext().getNext());
				break;   
			}  
			p = p.getNext();
		}
	}
	
	public Node getNodeByIndex(int i){
		/**
		 * 根据序号返回节点
		 * */
		Node p = head;
		while(i>0){
			p = p.getNext();
			i--;
		}
		return p;
	}
	
	public int getIndexByNode(Node d){
		int i = 1;
		Node p = head;
		while(p.getNext()!=null){
			if(p.getNext().getContent().equals(d.getContent())){
				break;
			}
			p = p.getNext();
			i++;
		}
		return i;  
	}
}
