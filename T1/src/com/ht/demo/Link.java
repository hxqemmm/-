package com.ht.demo;

/**
 * ����
 * */
public class Link {
	private Node head;

	public Link() {
		head=new Node(head);
	}
	//����һ���ڵ�
	public void addNode(Node n){
		Node d=head;
		while(true){
			if(d.getNext()==null){
				d.setNext(n);
				break;
			}
			d=d.getNext();
		}
	}
	
	//�鿴�ڵ�
	public void seeNode(){
		Node d=head.getNext();
		while(d!=null){
			System.out.println(d.getName());
			d=d.getNext();
			
		}
	}
	
	
	//ɾ���ڵ�
	public void deleteNode(Node n){
		Node d=head;
		while(d.getNext()!=null){
			if(d.getNext().getName().equals(n.getName())){
				d.setNext(n.getNext());
				//d.setNext(d.getNext().getNext());
				break;
			}
			d=d.getNext();
		}
		
	}
	
	
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	
}
