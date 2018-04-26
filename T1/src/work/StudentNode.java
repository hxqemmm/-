package work;

public class StudentNode {
	private int no;		
	private String name;
	private int age;
	private String classes;
	private StudentNode next;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	public StudentNode getNext() {
		return next;
	}
	public void setNext(StudentNode next) {
		this.next = next;
	}
	
	
}
