package link;

public class Link {
	private Node head;
	
	public Link(){
		head=new Node(head);
	}
	
	//��ӽڵ�
	public void addLink(Node n){
		Node d=head;
		while(true){
			if(d.getNext()==null){
				d.setNext(n);
				break;
			}
			d=d.getNext();
		}
	}
	
	//�鿴�ڵ�
	public void seeLink(){
		Node d=head.getNext();
		while(d!=null){
			System.out.println(d.getContent());
			d=d.getNext();
		}
	}
	
	//ɾ���ڵ�
	public void deleteLink(Node n){
		Node d=head;
		while(d.getNext()!=null){
			if(d.getNext().getContent().equals(n.getContent())){
				d.setNext(d.getNext().getNext());
			}
			d=d.getNext();
		}
		
	}
	
	public Node getHead(){
		return head; 
	}
	
	public void setHead(Node head){
		this.head=head;
	}

}
