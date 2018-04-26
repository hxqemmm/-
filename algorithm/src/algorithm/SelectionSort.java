package algorithm;

import util.SortUtil;
import util.SortUtil.Sort;

public class SelectionSort implements Sort{

	@Override
	public void sort(int[] data) {
		/**
		 * ѡ������
		 * ����˼�룺��һ�����֣�ѡ����С��һλ�����һλ�õ���������
		 * Ȼ����ʣ�µ�����ѡ��С�����͵ڶ�λ����������
		 * ��˷�����ֱ�������ڶ����������һ�����Ƚ�λ��
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
