package test1;

public class test {
	public static void main(String[] args) {
		ArrayQueue aq=new ArrayQueue(4);
		aq.inQueue("��һ");
	    aq.inQueue("�ڶ�");
		aq.inQueue("����");
		aq.inQueue("����");
		aq.outQueue();
		//aq.outQueue();
		//aq.outQueue();
		aq.ergodic();
	}
}
