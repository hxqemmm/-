package com.ht;

public class Demo {
	public static void main(String[] args) {
		/**
		 * 栈的特点,先进后出,等价于 后进先出
		 * */
		ArrayStrack as = new ArrayStrack(100);
		as.push("内衣");
		as.push("秋衣");
		as.push("毛衣");
		as.push("外套");
		
		//while(!as.isEmpty()){
			//System.out.println(as.pop());
		//}
		
		LinkStrack ls = new LinkStrack();
		ls.push("内衣");
		ls.push("秋衣");
		ls.push("毛衣");
		ls.push("外套");
		while(!ls.isEmpty()){
			System.out.println(ls.pop());
		}
		
		
	
	}
}
