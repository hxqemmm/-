package com.ht;

public class Test {
	public static void main(String[] args) {
		LoopQueue aq=new LoopQueue(4);
		aq.inQueue("��һ");
		aq.inQueue("�ڶ�");
		aq.inQueue("����ǰ���Ĵ���");
		aq.inQueue("3����0�ظ��Ұ�");
		aq.outQueue();
		aq.outQueue();
		//aq.outQueue();
		aq.inQueue("4����1�޲Ұ�");
		//aq.inQueue("����ǰ��Ĵ���");
		aq.ergodic();
	}
}
