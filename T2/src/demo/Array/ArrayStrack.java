package demo.Array;

public class ArrayStrack {
	private Object[] obj;
	/**
	 * 定义一个堆栈的指针
	 * */
	private int top=-1;
	/**
	 * 定义堆栈的大小
	 * */
	private int size;
	
	public ArrayStrack() {
		this.size=10;
		obj=new Object[size];
	}
	
	public ArrayStrack(int size) {
		this.size=size;
		obj=new Object[size];
	}
	
	/**
	 * 入栈方法
	 * */
	public void push(Object o){
		if(top==size-1){	//判断堆栈空间有没有满
			System.out.print("栈已经满了");
			return ;
		}
		top++;
		obj[top]=o;
	}
	
	/**
	 * 查看栈内容
	 * */
	public void seeStrack(){
		int i=0;
		while(i<=top){
			System.out.println(obj[i]);
			i++;
		}
	}
	
	/**
	 * 出栈方法
	 * */
	public Object pull(){
		
		if(top==-1){
			System.out.println("栈为空了");
			return null;	
		}
		int t=top;
		top--;
		return obj[t];
		
	}
	
	/**
	 * 清空栈方法
	 * */
	public void clearStrack(){
		while(top!=-1){
			top--;
		}
	}
	
}
