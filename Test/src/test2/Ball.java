package test2;

public class Ball {
	private ArrayQueue aq;		//��Ա������
	private ArrayQueue2 aq2;	//��Ա������
	private int size;	//һ�����ж��ٳ�
	
	
	public Ball() {
		aq=new ArrayQueue(30);
		aq2=new ArrayQueue2(20);
		size=60;
	}
	
	public void party(Object m,Object w){	//���
		aq.inQueue(m);
		aq2.inQueue(w);
	}
	
	public void show(){		//һ�ӿ�ʼ����
		System.out.println(aq.outQueue()+"-"+aq2.outQueue());
		size--;
		if(size==0){
			System.out.println("�ݳ�����");
		}
	}
}
