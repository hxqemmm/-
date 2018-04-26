package BinaryTree;

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
	//添加的方法
	public void add(int i,Node n){
		if(i>n.getI()){
			if(n.getRight()!=null){
				add(i, n.getRight());
			}else{
				n.setRight(new Node(i));
			}
		}else if(i<n.getI()){
			if(n.getLeft()!=null){
				add(i, n.getLeft());
			}else{
				n.setLeft(new Node(i));
			}
		}
	}
	
	public void display(){
		this.display(root);
	}
	//遍历二叉树
	public void display(Node n){
		System.out.println(n.getI());
		if(n.getLeft()!=null){
			this.display(n.getLeft());
		}
		if(n.getRight()!=null){
			this.display(n.getRight());
		}
	}

	public void find(int key){
		find(key, root);
	}
	public boolean find(int key,Node n){
		if(key<n.getI()){
			find(key, n.getLeft());
		}else if(key>n.getI()){
			find(key, n.getRight());
		}else{
			System.out.println("找到了"+key);
			return true;
		}
		return false;
	}
}
