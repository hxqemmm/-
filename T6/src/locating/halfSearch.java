package locating;

public class halfSearch {
	public static void main(String[] args) {
		int a[]={1,2,4,6,7,9};
		//find(0, a.length-1, 7, a);
		finds(4, a);
	}
	
	static boolean finds(int key,int a[]){
		int left=0;
		int right=a.length-1;
		int m=(left+right)/2;
		while(left<=right){
			if(a[m]<key){
				left=m+1;
			}else if(a[m]>key){
				right=m-1;
			}else if(a[m]==key){
				System.out.println("找到了"+key+",在第"+(m+1)+"个位置");
				return true;
			}
		}
		return false;
		
	}
	
	static boolean find(int left,int right,int key,int a[]){
		int m=(left+right)/2;
		if(left>right){
			return false;
		}
		if(a[m]<key){
			find(m+1, right, key, a);
		}else if(a[m]>key){
			find(left, m-1, key, a);
		}else{
			System.out.println("找到了"+key+",在第"+(m+1)+"个位置");
			return true;
		}
		return false;
	}
}
