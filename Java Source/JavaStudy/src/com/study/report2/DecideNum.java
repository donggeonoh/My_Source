package com.study.report2;

public class DecideNum {

	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		int num3 = 30, num4 = 40;
	
		// num1 / num2 = 0.5
		// num3 / num4 = 0.75
		System.out.println("반환 값 : " + decisionFunc(division(num1, num2), division(num3, num4)));
	
		// 1.0
		num1 = 30; num2 = 30; num3 = 20; num4 = 20;
		System.out.println("반환 값 : " + decisionFunc(division(num1, num2), division(num3, num4)));

		// num1 / num2 = 0.75
		// num3 / num4 = 0.5
		num1 = 30; num2 = 40; num3 = 10; num2 = 20;
		System.out.println("반환 값 : " + decisionFunc(division(num1, num2), division(num3, num4)));
	}

	static double division(double a, double b)
	{
		if(b != 0) 
			return a / b;
		
		else {
			System.out.println("분모가 0 입니다.");
			return 0;
		}
	}
	
	
	static int decisionFunc(double a, double b)
	{
		if(a > b) return 1;
		else if(a < b) return -1;
		else return 0;
	}
}
