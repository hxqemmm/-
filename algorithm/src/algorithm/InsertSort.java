package algorithm;


import util.SortUtil;
import util.SortUtil.Sort;

public class InsertSort implements Sort{

	@Override
	public void sort(int[] data) {
		/**
		 * 插入排序(希尔排序)
		 *基本原理：默认在一个有序的数组中插入一个数，从后面往前扫描
		 *  反复把已排序元素向后移，为插入元素提供空间
		 * */		
		
		for(int i=1;i<data.length;i++) {
			for(int j=i-1;j>=0;j--) {
				if(data[j+1]<data[j]) {
					SortUtil.swap(data, j, j+1);
				}	
			}	
		}
		
		//用于循环打印除结果
		for(int a=0;a<data.length;a++) {
			System.out.println(data[a]);
		}
		
		 
		
	}
	
	public static void main(String[] args) {
		int[] data= {8,3,6,5,4};
		InsertSort is=new InsertSort();
		is.sort(data);
		
	}

}
