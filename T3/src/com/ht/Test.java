package com.ht;

public class Test {
	public static void main(String[] args) {
		LoopQueue aq=new LoopQueue(4);
		aq.inQueue("第一");
		aq.inQueue("第二");
		aq.inQueue("关上前三的大门");
		aq.inQueue("3评论0回复惨案");
		aq.outQueue();
		aq.outQueue();
		//aq.outQueue();
		aq.inQueue("4评论1赞惨案");
		//aq.inQueue("关上前五的大门");
		aq.ergodic();
	}
}
