package demo;

public class LinkTree {
	private Node root;
	
	public LinkTree() {
	}
	public LinkTree(Node n) {
		this.root=n;
	}
	/**
	 * ���ɷ���
	 * */
	public void addtree(Node n,Sort s){
		/**
		 * �жϽڵ��Ƿ���ڸ��ڵ�
		 * */
		if(s.getWork()>n.getW().getWork()){
			/**
			 *������ڵ㻹���ӽڵ㣬�����ĵݹ����,�������ýڵ�
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
	 * �ȸ�����
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
	 *�������ֵ 
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
	 * ����һ���ڵ�
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
