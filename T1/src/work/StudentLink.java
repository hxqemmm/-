package work;

public class StudentLink {
	private StudentNode head;

	//添加学生
	public void addStudentNode(StudentNode n){
		StudentNode d=head;
		while(true){
			if(d.getNext()==null){
				d.setNext(n);
				break;
			}
			d=d.getNext();
			
		}
	}
	//查看节点
	public void seeStudentNode(){
		StudentNode d=head.getNext();
		while(d!=null){
			System.out.println(d.getNo()+" "+d.getName()+"  "+d.getAge()+" "+d.getClasses());
			d=d.getNext();
		}
	}
	
	//按学号查找
	public void StudentNo(int no){
		StudentNode d=head.getNext();
		while(d!=null){
			if(d.getNo()==no){
				System.out.println(d.getNo()+" "+d.getName()+"  "+d.getAge()+" "+d.getClasses());
			}
			d=d.getNext();
		}
	}
	
	//按姓名查找
		public void StudentName(String name){
			StudentNode d=head.getNext();
			while(d!=null){
				if(d.getName().equals(name)){
					System.out.println(d.getNo()+" "+d.getName()+"  "+d.getAge()+" "+d.getClasses());
				}
				d=d.getNext();
			}
		}
	
	//查出年龄最小的学生
	public void MinAgeStudent(){
		
		
	}
	
	//按学号删除节点
	public void deleteStudentNo(int no){
		StudentNode d=head;
		while(d.getNext()!=null){
		if(d.getNext().getNo()==no){
			d.setNext(d.getNext().getNext());
			break;
		}
		d=d.getNext();
	}		
		
	}
	
	
		
		
	
		
	public StudentNode getHead() {
		return head;
	}

	public void setHead(StudentNode head) {
		this.head = head;
	}
	
	
	

}
