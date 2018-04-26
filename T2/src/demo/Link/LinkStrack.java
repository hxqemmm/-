package demo.Link;

public class LinkStrack {
	private Link link;
	/**
	 * 定义一个堆栈的指针
	 * */
	private int top=-1;
	/**
	 * 定义堆栈的大小
	 * */
	private int size;
	
	public LinkStrack() {
		link=new Link();
		size=10;
	}
	public LinkStrack(int size) {
		link=new Link();
		this.size=size;
	}
	
	/**
	 * 入栈方法
	 * */
	public void push(Object o){
		if(top==size-1){
			System.out.println("栈已经满了");
			return;	
		}
		top++;
		/**
		 * 向链表里添加一条数据
		 * */
		Node n=new Node(o);	
		link.addLink(n);
	}
	
	/**
	 * 查看栈方法
	 * */
	public void seeStrack(){
		/**
		 * 遍历整个链表
		* */
		link.seeNode();
	}
	
	/**
	 * 出栈方法
	 * */
	public Object pull(){
		if(top==-1){
			System.out.println("栈已经空了");
			return null;
		}
		top--;
		/**
		 * 把链表最后一条记录的前一个节点的指向设为null
		 * */
		Node d =this.link.getHead();
		while(d.getNext().getNext()!=null){
			d=d.getNext();
		}
		Object obj=d.getNext().getContent();
		d.setNext(null);
		return obj;
	}
	
	/**
	 * 清空栈方法
	 * */
	public void clearStrark(){
		while(top!=-1){
			Node d =this.link.getHead();
			while(d.getNext().getNext()!=null){
				d=d.getNext();
			}
			d.setNext(null);
			top--;
		}
	}
	
	/**
	 * 判断栈是否为空
	 * */
	public Boolean isEmpty(){
		/**
		 * 判断栈是否为空
		 * */
		if(this.top==-1){
			return true;
		}else{
			return false;
		}
	}
		
}
