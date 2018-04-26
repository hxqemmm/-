package demo.Array;

public class ArrayStrack {
	private Object[] obj;
	/**
	 * ����һ����ջ��ָ��
	 * */
	private int top=-1;
	/**
	 * �����ջ�Ĵ�С
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
	 * ��ջ����
	 * */
	public void push(Object o){
		if(top==size-1){	//�ж϶�ջ�ռ���û����
			System.out.print("ջ�Ѿ�����");
			return ;
		}
		top++;
		obj[top]=o;
	}
	
	/**
	 * �鿴ջ����
	 * */
	public void seeStrack(){
		int i=0;
		while(i<=top){
			System.out.println(obj[i]);
			i++;
		}
	}
	
	/**
	 * ��ջ����
	 * */
	public Object pull(){
		
		if(top==-1){
			System.out.println("ջΪ����");
			return null;	
		}
		int t=top;
		top--;
		return obj[t];
		
	}
	
	/**
	 * ���ջ����
	 * */
	public void clearStrack(){
		while(top!=-1){
			top--;
		}
	}
	
}
