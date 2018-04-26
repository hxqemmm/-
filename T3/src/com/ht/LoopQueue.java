package com.ht;

public class LoopQueue {
	private Object[] obj;
	private int rear;	//β��
	private int front;	//ͷ��
	private int size;
	
	public LoopQueue(int size){
		this.size=size;
		obj=new Object[size+1];
		rear=0;
		front=0;
	}
	
	/**
	 * ���
	 * */
	public void inQueue(Object o){
		if(!isFull()){
			this.rear=(rear+1)%(size+1);
			if(rear==0){
				rear=1;
			}
			obj[rear]=o;
		}else{
			System.out.println("�����Ѿ�����");
		}	
	}
	
	/**
	 * ����
	 * */
	public void outQueue(){
		if(!isNull()){
			this.front=(front+1)%size;
			obj[front]=null;
		}else{
			System.out.println("�����Ѿ�����");
		}
	}
	
	/**
	 * ����
	 * */
	public void ergodic(){
		for(int i=front+1;i<rear+1;i++){
			System.out.println(obj[i]);
		}
	}
	
	/**
	 * �ж��Ƿ�Ϊ��
	 * */
	public boolean isNull(){
		if(rear==front){
			return true;
		}else{
			return false;
		}
		
	} 
	
	/**
	 * �ж��Ƿ�����
	 * */
	public boolean isFull(){
		if((rear+1)%size==front){
			return true;
		}else{
			return false;
		}
	} 
}
