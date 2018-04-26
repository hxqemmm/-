package test2;

public class Ball {
	private ArrayQueue aq;		//男员工队列
	private ArrayQueue2 aq2;	//男员工队列
	private int size;	//一共进行多少场
	
	
	public Ball() {
		aq=new ArrayQueue(30);
		aq2=new ArrayQueue2(20);
		size=60;
	}
	
	public void party(Object m,Object w){	//组队
		aq.inQueue(m);
		aq2.inQueue(w);
	}
	
	public void show(){		//一队开始表演
		System.out.println(aq.outQueue()+"-"+aq2.outQueue());
		size--;
		if(size==0){
			System.out.println("演出结束");
		}
	}
}
