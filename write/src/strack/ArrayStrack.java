package strack;

public class ArrayStrack {
	private Object[] obj;
	private int top=-1;
	private int size;
	
	public ArrayStrack(){
		size=10;
		obj=new Object[size];
	}
	public ArrayStrack(int size){
		this.size=size;
		obj=new Object[size];
	}
	
	
	/**
	 * ��ջ
	 * */
	public void push(Object o){
		if(top==size-1){
			System.out.println("ջ�Ѿ�����");
			return;
		}
		top++;
		obj[top]=o;
	}
	
	/**
	 * �鿴ջ
	 * */
	public void seeStrack(){
		int i=0;
		while(i<=top){
			System.out.println(obj[i]);
			i++;
			
		}
	}
	
	/**
	 * ��ջ
	 * */
	public Object pop(){
		if(top==-1){
			System.out.print("ջ�Ѿ�����");
			return null;
		}
		int t=top;
		top--;
		return t;
	}
	
	/**
	 * ���
	 * */
	public void clearStrack(){
		while(top!=-1){
			top--;
		}
	}

}
