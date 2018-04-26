package Order;

public class maopao {		//ц╟ещеепР
	public static void main(String[] args) {
		int[] a={1,3,4,7,0,9};
		int b;
		for(int i=0;i<a.length-1;i++){
			for(int j=i;j<a.length-1;j++){
				if(a[i]>a[j+1]){
					b=a[i];
					a[i]=a[j+1];
					a[j+1]=b;
				}
			}
		}
		
		for(int k=0;k<a.length;k++){
			System.out.println(a[k]);
		}
	}
}
