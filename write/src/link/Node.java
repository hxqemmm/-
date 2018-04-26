package link;

public class Node {
	private Object content;		//节点的内容
	private Node next;
	
	public Node(){
		
	}
	public Node(Object content) {
		this.content=content;
	}

	public Object getContent(){
		return content;
	}
	public void setContent(String content){
		this.content=content;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
}
