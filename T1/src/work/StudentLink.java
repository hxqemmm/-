package work;

public class StudentLink {
	private StudentNode head;

	//���ѧ��
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
	//�鿴�ڵ�
	public void seeStudentNode(){
		StudentNode d=head.getNext();
		while(d!=null){
			System.out.println(d.getNo()+" "+d.getName()+"  "+d.getAge()+" "+d.getClasses());
			d=d.getNext();
		}
	}
	
	//��ѧ�Ų���
	public void StudentNo(int no){
		StudentNode d=head.getNext();
		while(d!=null){
			if(d.getNo()==no){
				System.out.println(d.getNo()+" "+d.getName()+"  "+d.getAge()+" "+d.getClasses());
			}
			d=d.getNext();
		}
	}
	
	//����������
		public void StudentName(String name){
			StudentNode d=head.getNext();
			while(d!=null){
				if(d.getName().equals(name)){
					System.out.println(d.getNo()+" "+d.getName()+"  "+d.getAge()+" "+d.getClasses());
				}
				d=d.getNext();
			}
		}
	
	//���������С��ѧ��
	public void MinAgeStudent(){
		
		
	}
	
	//��ѧ��ɾ���ڵ�
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
