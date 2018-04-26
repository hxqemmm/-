package demo.Link;

public class Node {
	/**
	 * 节点内容
	 * */
	private Object content;
	/**
	 * 下一个节点
	 * */
	private Node next;
	
	public Node() {
	}
	public Node(Object content) {
		this.content=content;
	}
	public Object getContent() {
		return content;
	}
	public void setContent(Object content) {
		this.content = content;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
}
