package link;

public class LinkTest {
	public static void main(String[] arg){
		Node n1=new Node("һ");
		Node n2=new Node("��");
		Node n3=new Node("��");
		
		Link l=new Link();
		l.addLink(n1);
		l.addLink(n2);
		l.addLink(n3);
		
		//l.deleteLink(n2);
		l.seeLink();
		
		
	}

}
