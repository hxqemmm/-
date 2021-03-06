package algorithm;

import util.SortUtil;
import util.SortUtil.Sort;

public class BubbleSort implements Sort{

	@Override
	public void sort(int[] data) {
		// TODO Auto-generated method stub
		/**
		 * 冒泡排序
		 * 基本原理：相邻的两个数进行比较，大的玩下沉（后推），小的玩上冒（推前）
		 * 即相邻两个数与排序规律相反时，两个数交换
		 * */
		
		for(int i=0;i<data.length;i++) {
			for(int j=data.length-1;j>i;j--) {
				if(data[j-1]>data[j]) {
					//SortUtil.swap(data, j,j-1 );
					
					  int temp=data[j];
					   data[j]=data[j-1];
					  data[j-1]=temp;
					 
				}
			}
			System.out.println(data[i]);
		}
		
		
	}
	
	public static void main(String[] args) {
		int[] data= {1,4,3,6,5};
		BubbleSort bs=new BubbleSort();
		bs.sort(data);
	}

	
}
