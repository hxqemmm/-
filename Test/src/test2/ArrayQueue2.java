package test2;

public class ArrayQueue2 {
	private Object[] obj;
	private int rear;	//β��
	private int front;	//ͷ��
	private int size;
	
	
	
	public ArrayQueue2(int size){
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
	public Object outQueue(){
		Object o = null;
		if(front!=rear){
			o = obj[front];
			obj[front] = null;
			front++;
		}else{
			System.out.println("����Ϊ��,���ܳ���");
		}
		return o;
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