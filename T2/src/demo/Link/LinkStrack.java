package demo.Link;

public class LinkStrack {
	private Link link;
	/**
	 * ����һ����ջ��ָ��
	 * */
	private int top=-1;
	/**
	 * �����ջ�Ĵ�С
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
	 * ��ջ����
	 * */
	public void push(Object o){
		if(top==size-1){
			System.out.println("ջ�Ѿ�����");
			return;	
		}
		top++;
		/**
		 * �����������һ������
		 * */
		Node n=new Node(o);	
		link.addLink(n);
	}
	
	/**
	 * �鿴ջ����
	 * */
	public void seeStrack(){
		/**
		 * ������������
		* */
		link.seeNode();
	}
	
	/**
	 * ��ջ����
	 * */
	public Object pull(){
		if(top==-1){
			System.out.println("ջ�Ѿ�����");
			return null;
		}
		top--;
		/**
		 * ���������һ����¼��ǰһ���ڵ��ָ����Ϊnull
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
	 * ���ջ����
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
	 * �ж�ջ�Ƿ�Ϊ��
	 * */
	public Boolean isEmpty(){
		/**
		 * �ж�ջ�Ƿ�Ϊ��
		 * */
		if(this.top==-1){
			return true;
		}else{
			return false;
		}
	}
		
}
