package com.ht;

public class Demo {
	public static void main(String[] args) {
		/**
		 * ջ���ص�,�Ƚ����,�ȼ��� ����ȳ�
		 * */
		ArrayStrack as = new ArrayStrack(100);
		as.push("����");
		as.push("����");
		as.push("ë��");
		as.push("����");
		
		//while(!as.isEmpty()){
			//System.out.println(as.pop());
		//}
		
		LinkStrack ls = new LinkStrack();
		ls.push("����");
		ls.push("����");
		ls.push("ë��");
		ls.push("����");
		while(!ls.isEmpty()){
			System.out.println(ls.pop());
		}
		
		
	
	}
}
