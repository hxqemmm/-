package link;

public class Node {
	private Object content;		//�ڵ������
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
