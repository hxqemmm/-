package demo;

public class LinkTree {
	private Node root;
	
	public LinkTree() {
	}
	public LinkTree(Node n) {
		this.root=n;
	}
	/**
	 * 生成方法
	 * */
	public void addtree(Node n,Sort s){
		/**
		 * 判断节点是否大于父节点
		 * */
		if(s.getWork()>n.getW().getWork()){
			/**
			 *如果根节点还有子节点，方法的递归调用,否则设置节点
			 * */
			if(n.getRight()!=null){
				addtree(n.getRight(), s);
			}else{
				n.setRight(new Node(s));
			}
		}else{
			if(n.getLeft()!=null){
				addtree(n.getLeft(), s);
			}else{
				n.setLeft(new Node(s));
			}
		}
	}
	
	/**
	 * 先根遍历
	 * */
	public void display(Node n){
		System.out.println(n.getW().getName());
		if(n.getLeft()!=null){
			display(n.getLeft());
		}
		if(n.getRight()!=null){
			display(n.getRight());
		}
	}
	
	/**
	 *返回最大值 
	 * */
	public int getMax(Node n){
		int max=0;
		if(max<n.getW().getWork()){
			max=n.getW().getWork();
		}
		if(n.getLeft()!=null){
			getMax(n.getLeft());
		}
		if(n.getRight()!=null){
			getMax(n.getRight());
		}
		return max;
	}
	
	/**
	 * 返回一个节点
	 * */
	public Node getNode(Node n,Sort s){
		Node node=n;
		if(n.getW().getWork()==s.getWork()){
			node=n;
			return node;
		}else{
			if(n.getW().getWork()>s.getWork()){
				getNode(n.getLeft(), s);
			}else{
				getNode(n.getRight(), s);
			}
		}

		return node;
	}
	
}
