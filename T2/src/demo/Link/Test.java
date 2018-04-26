package demo.Link;

public class Test {
	public static void main(String arg[]){
		Node n1=new Node("ÄÚÒÂ");
		Node n2=new Node("ÇïÒÂ");
		Node n3=new Node("ÍâÌ×");
		
		Link l=new Link();
		l.addLink(n1);
		l.addLink(n2);
		l.addLink(n3);
		
		//l.deleteNode(n2);
		//System.out.println(l.getNodeById(2).getContent());;
		
		System.out.println(l.getIdByNode(n3));
		//l.seeNode();
		
	}

}
