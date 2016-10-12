package com.study.report2;

public class Factorial {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 12 + 2);
		System.out.println("정수 : " + num + "\n팩토리얼 값 : " + facNum(num));
	}

	static int facNum(int num) {
		if(num == 1)
			return num;
		else
			return num = num * facNum(num - 1);
	}
}