package demo.Link;

public class Link {
	private Node head;
	
	public Link() {
		head=new Node(head);
	}
	
	/**
	 * ���ӽڵ�
	 * */
	public void addLink(Node n){
		Node d=head;
		while(true){
			if(d.getNext()==null){
				d.setNext(n);
				break;
			}
			d=d.getNext();
		}
		//d.setNext(n);
	}
	
	/**
	 * �鿴�ڵ�
	 * */
	public void seeNode(){
		Node d=head.getNext();
		while(d!=null){
			System.out.println(d.getContent());
			d=d.getNext();
		}
	}
	
	/**
	 * ɾ���ڵ�
	 * */
	public void deleteNode(Node n){
		Node d=head;
		while(d.getNext()!=null){
			if(d.getNext().getContent().equals(n.getContent())){
				d.setNext(d.getNext().getNext());
				break;
			}
			d=d.getNext();
		}
	}
	
	/**
	 * ������ŷ��ؽڵ�
	 * */
	public Node getNodeById(int i){
		Node d=head;
		while(i>0){
			d=d.getNext();
			i--;
		}
		return d;
	} 
	
	/**
	 * ��λ�����ݽڵ㷵����ţ�
	 * */
	public int getIdByNode(Node n){
		Node d=head.getNext();
		int i=1;
		while(d!=null){
			if(d.getContent().equals(n.getContent())){
				break;
			}
			d=d.getNext();
			i++;
		}
		return i;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	
}
