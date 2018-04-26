package com.ht;

/**
 * 使用数组来实现一个栈
 * 栈要使用数组来实现,包含一个数组
 * 数组在这个java里面作为一个属性
 * */
public class ArrayStrack {
	private Object[] obj;
	/**
	 * 定义一个指针,表示栈里面存储多少数据
	 * */
	private int top =-1;
	/**
	 * 定义一个栈的大小
	 * */
	private int size;
	
	public ArrayStrack(){
		this.size = 100;
		this.obj = new Object[this.size];
	}
	
	public ArrayStrack(int size){
		this.size = size;  
		this.obj = new Object[size];
	}
	/**
	 * 入栈
	 * */
	public void push(Object o){
		/**
		 * 判断栈的内容是否满了
		 * 满了就不能入栈
		 * */
		if(top==size){
			System.out.println("栈已经满了");
			return;
		}
		top++;
		obj[top]=o;  
	}
	/**
	 * 出栈
	 * */
	public Object pop(){
		if(top==-1){
			System.out.println("栈为空了");
			return null;
		}
		int t = top;
		top--;  
		return obj[t];
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
