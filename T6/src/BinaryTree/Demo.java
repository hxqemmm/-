package BinaryTree;

public class Demo {
	public static void main(String[] args) {
		Tree t=new Tree();
		t.add(4);
		t.add(5);
		t.add(2);
		t.add(1);
		t.add(7);
	
		t.display();
		t.find(7);
	}

}
