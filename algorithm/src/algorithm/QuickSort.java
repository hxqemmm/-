package algorithm;

import util.SortUtil.Sort;
import util.SortUtils;

public class QuickSort implements Sort{

	@Override
	public void sort(int[] data) {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) {
		SortUtils su=new SortUtils();
		int[] data= {1,7,2,6,4};
		su.BubbleSort(data);
		
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
	}
	

	
}
