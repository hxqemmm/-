package Order;

public class kuaisu2 {
	public static void main(String[] args) {
		int a[]={1,2,5,0,8,7};
		
		Order(0, a.length-1, a);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	
	static void Order(int left,int right,int a[]){
		int l,r,temp,t;
		temp=left;
		l=left;
		r=right;
		
		if(left>right){
			return;
			
		}
		while(l!=r){
			while(a[r]>a[temp]&&l<r){
				r--;
			}
			while(a[l]<a[temp]&&l<r){
				l++;
			}
			if(l<r){
				t=a[l];
				a[l]=a[r];
				a[r]=t;
			}
		}
		
		a[left]=a[l];
		a[l]=a[temp];
		
		Order(left, l-1, a);
		Order(l+1,right,a);
	}
	
}
