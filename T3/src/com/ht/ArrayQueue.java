package com.ht;

public class ArrayQueue {		//����
	private Object[] obj;
	private int rear;	//β��
	private int front;	//ͷ��
	private int size;
	
	
	
	public ArrayQueue(int size){
		this.size=size;
		obj=new Object[size];
		rear=0;
		front=0;
	}
	
	/**
	 * ���
	 * */
	public void inQueue(Object o){
		
		if(rear<size){
			obj[rear]=o;
			rear++;
		}else{
			System.out.println("�����Ѿ�����");
		}	
	}
	
	/**
	 * ����
	 * */
	public void outQueue(){
		if(rear!=front){
			obj[front]=null;
			front++;
		}else{
			System.out.println("�����Ѿ�����");
		}
	}
	
	/**
	 * ����
	 * */
	public void ergodic(){
		for(int i=front;i<rear;i++){
			System.out.println(obj[i]);
		}
	}
	
	
}
