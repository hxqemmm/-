package demo;

public class Test {
	public static void main(String[] args) {
		Sort s=new Sort("20",20);
		Node n=new Node(s);
		
		LinkTree lt=new LinkTree(n);
		lt.addtree(n, new Sort("25 ",25));
		lt.addtree(n, new Sort("10 ",10));
		lt.addtree(n, new Sort("19 ",19));
		
		lt.display(n);
		//Node node=lt.getNode(n,new Sort("yu ",21));
		//System.out.println(node.getW().getName());
	}
}
