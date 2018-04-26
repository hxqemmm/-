package test1;


public class ArrayQueue {
	private int rear;	//β��
	private int front;	//ͷ��
	private int size;
	private ArrayStrack as;
	private ArrayStrack2 as2;
	
	public ArrayQueue(int size){
		as=new ArrayStrack(size);
		as2=new ArrayStrack2(size);
		this.size=size;
		rear=0;
		front=0;
	}
	
	/**
	 * ���
	 * */
	public void inQueue(Object o){
		if(rear<size){
			as.push(o);		//�Ե�һ��ջ������ջ
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
			while(!as.isEmpty()){	//�жϵ�һ��ջ�Ƿ�Ϊ�գ���Ϊ�ս��г�ջ
				Object o=as.pull();		//�Ե�һ��ջ��ջ
				as2.push(o);		//�ѵ�һ��ջ����Ķ�������ڶ���ջ
			}
			as2.pull();  //�ѵڶ���ջ��һ�����ݳ�ջ
			while(!as2.isEmpty()){	
				Object o=as2.pull();		
				as.push(o);		
				}
			front++;
		}else{
			System.out.println("�����Ѿ�����");
		}
	}
	
	/**
	 * ����
	 * */
	public void ergodic(){
		as.seeStrack();
		as2.seeStrack();
	}
}
