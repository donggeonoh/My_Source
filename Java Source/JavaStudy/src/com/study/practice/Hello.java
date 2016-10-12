package com.study.practice;

public class Hello {
	public static void main(String args[]) {
		int num = 7;
		String str = " ";
		
		System.out.println(num + num);
		System.out.println(num + "" + num);
		System.out.println(num);
		System.out.println(str + num);
		System.out.println(str + num + num);
		System.out.println(str + (num + num));
	}
}