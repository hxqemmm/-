package com.ht;

/**
 * ʹ��������ʵ��һ��ջ
 * ջҪʹ��������ʵ��,����һ������
 * ���������java������Ϊһ������
 * */
public class ArrayStrack {
	private Object[] obj;
	/**
	 * ����һ��ָ��,��ʾջ����洢��������
	 * */
	private int top =-1;
	/**
	 * ����һ��ջ�Ĵ�С
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
	 * ��ջ
	 * */
	public void push(Object o){
		/**
		 * �ж�ջ�������Ƿ�����
		 * ���˾Ͳ�����ջ
		 * */
		if(top==size){
			System.out.println("ջ�Ѿ�����");
			return;
		}
		top++;
		obj[top]=o;  
	}
	/**
	 * ��ջ
	 * */
	public Object pop(){
		if(top==-1){
			System.out.println("ջΪ����");
			return null;
		}
		int t = top;
		top--;  
		return obj[t];
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
