package locating;

public class LineSearch {
	public static void main(String[] args) {
		int a[]={1,4,6,7,3,0,5};
		find(3, a);
	}
	
	static void find(int key,int a[]){
		for(int i=0;i<a.length-1;i++){
			if(a[i]==key){
				System.out.println("�ҵ���"+key+",�ڵ�"+(i+1)+"��λ��");
			}
		}
	}
}
