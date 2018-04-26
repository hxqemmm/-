package link;

public class LinkTest {
	public static void main(String[] arg){
		Node n1=new Node("Ò»");
		Node n2=new Node("¶þ");
		Node n3=new Node("Èý");
		
		Link l=new Link();
		l.addLink(n1);
		l.addLink(n2);
		l.addLink(n3);
		
		//l.deleteLink(n2);
		l.seeLink();
		
		
	}

}
