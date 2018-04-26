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
	 * 入栈
	 * */
	public void push(Object o){
		if(top==size-1){
			System.out.println("栈已经满了");
			return;
		}
		top++;
		obj[top]=o;
	}
	
	/**
	 * 查看栈
	 * */
	public void seeStrack(){
		int i=0;
		while(i<=top){
			System.out.println(obj[i]);
			i++;
			
		}
	}
	
	/**
	 * 出栈
	 * */
	public Object pop(){
		if(top==-1){
			System.out.print("栈已经空了");
			return null;
		}
		int t=top;
		top--;
		return t;
	}
	
	/**
	 * 清空
	 * */
	public void clearStrack(){
		while(top!=-1){
			top--;
		}
	}

}
