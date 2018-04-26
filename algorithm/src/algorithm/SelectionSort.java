package algorithm;

import util.SortUtil;
import util.SortUtil.Sort;

public class SelectionSort implements Sort{

	@Override
	public void sort(int[] data) {
		/**
		 * 选择排序
		 * 基本思想：在一组数种，选择最小的一位数与第一位置的数交换，
		 * 然后在剩下的数中选最小的数和第二位置数交换，
		 * 如此反复，直到倒数第二个数和最后一个数比较位置
		 * */
		
		for(int i=0;i<data.length;i++) {
			int Index=i;
			for(int j=data.length-1;j>i;j--) {
				if(data[j]<data[Index]) {
					Index=j;
				}
			}
			SortUtil.swap(data, Index, i);
			System.out.println(data[i]);
		}
		
	}
	
	public static void main(String[] args) {
		int[] data= {1,4,3,6,5};
		SelectionSort ss=new SelectionSort();
		ss.sort(data);
	}
	
}
