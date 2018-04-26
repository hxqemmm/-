package test1;

public class test {
	public static void main(String[] args) {
		ArrayQueue aq=new ArrayQueue(4);
		aq.inQueue("第一");
	    aq.inQueue("第二");
		aq.inQueue("第三");
		aq.inQueue("第四");
		aq.outQueue();
		//aq.outQueue();
		//aq.outQueue();
		aq.ergodic();
	}
}
