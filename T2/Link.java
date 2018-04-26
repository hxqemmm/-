package com.ht;

/**
 * Link������ʾһ������
 * �������һЩ����
 * ���������Щ����
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
		 * �������������һ��Ԫ��
		 * ������������,ֱ�������β��,��ִ�в���
		 * ��ͷ�ڵ㸳ֵ��һ������
		 * ÿ��ѭ��һ�α����ͻ�仯,�ڵ�����ƶ�
		 * ���ڵ�ĺ�һ���ڵ�Ϊ�յ�ʱ��˵���Ѿ����������β��
		 * �������һ���ӿڵĺ�һ���ڵ�Ϊn
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
		 * ��ʾ������������е�Ԫ��
		 * ������������
		 * */
		Node p = head;
		while(p.getNext()!=null){
			System.out.println(p.getNext().getContent());
			p = p.getNext();
		}
	}
	public void deleteNode(Node n){
		/**
		 * ɾ��һ���ڵ�
		 * ������������,�ҵ��ڵ�n
		 * ������ڵ��ǰһ���ڵ���һ���ڵ�����Ϊn3
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
		 * ������ŷ��ؽڵ�
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
