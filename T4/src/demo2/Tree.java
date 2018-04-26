package demo2;

public class Tree {
	private Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	public void add(int i){
		if(root==null){
			root=new Node(i);
			this.add(i, root);
		}else{
			this.add(i, root);
		}
		
	}
	//Ìí¼Ó
	public void add(int i,Node n){
		if(i>n.getI()){
			if(n.getRight()!=null){
				add(i, n.getRight());
			}else{
				n.setRight(new Node(i));
			}
		}
		if(i<n.getI()){
			if(n.getLeft()!=null){
				add(i, n.getLeft());
			}else{
				n.setLeft(new Node(i));
			}
		}
	}
	
	public void display(){
		display(root);
	}
	public void display(Node n){
		System.out.println(n.getI());
		if(n.getLeft()!=null){
			display(n.getLeft());
		}
		if(n.getRight()!=null){
			display(n.getRight());
		}
	}
}
