package test1;


public class ArrayQueue {
	private int rear;	//尾部
	private int front;	//头部
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
	 * 入队
	 * */
	public void inQueue(Object o){
		if(rear<size){
			as.push(o);		//对第一个栈进行入栈
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
			while(!as.isEmpty()){	//判断第一个栈是否为空，不为空进行出栈
				Object o=as.pull();		//对第一个栈出栈
				as2.push(o);		//把第一个栈输出的对象输入第二个栈
			}
			as2.pull();  //把第二个栈的一个数据出栈
			while(!as2.isEmpty()){	
				Object o=as2.pull();		
				as.push(o);		
				}
			front++;
		}else{
			System.out.println("队列已经空了");
		}
	}
	
	/**
	 * 遍历
	 * */
	public void ergodic(){
		as.seeStrack();
		as2.seeStrack();
	}
}
