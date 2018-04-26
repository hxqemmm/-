package algorithm;


import util.SortUtil;
import util.SortUtil.Sort;

public class InsertSort implements Sort{

	@Override
	public void sort(int[] data) {
		/**
		 * ��������(ϣ������)
		 *����ԭ��Ĭ����һ������������в���һ�������Ӻ�����ǰɨ��
		 *  ������������Ԫ������ƣ�Ϊ����Ԫ���ṩ�ռ�
		 * */		
		
		for(int i=1;i<data.length;i++) {
			for(int j=i-1;j>=0;j--) {
				if(data[j+1]<data[j]) {
					SortUtil.swap(data, j, j+1);
				}	
			}	
		}
		
		//����ѭ����ӡ�����
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
