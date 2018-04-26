package demo;

public class Node {
	private Node left;
	private Node right;
	private Sort w;
	
	public Node(Sort work) {
		this.w=work;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public Sort getW() {
		return w;
	}
	public void setW(Sort w) {
		this.w = w;
	}
	
	
}
