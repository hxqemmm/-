package com.ht;

public class ArrayQueue {		//队列
	private Object[] obj;
	private int rear;	//尾部
	private int front;	//头部
	private int size;
	
	
	
	public ArrayQueue(int size){
		this.size=size;
		obj=new Object[size];
		rear=0;
		front=0;
	}
	
	/**
	 * 入队
	 * */
	public void inQueue(Object o){
		
		if(rear<size){
			obj[rear]=o;
			rear++;
		}else{
			System.out.println("队列已经满了");
		}	
	}
	
	/**
	 * 出队
	 * */
	public void outQueue(){
		if(rear!=front){
			obj[front]=null;
			front++;
		}else{
			System.out.println("队列已经空了");
		}
	}
	
	/**
	 * 遍历
	 * */
	public void ergodic(){
		for(int i=front;i<rear;i++){
			System.out.println(obj[i]);
		}
	}
	
	
}
