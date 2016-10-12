package com.study.report2;

public class PrintDecimal {

	public static void main(String[] args) {
		double realNum1 = 1.47;
		double realNum2 = 3.48;
		
		System.out.println("1. 정수 : " + integer(realNum1) + " 소수 : " + decimal(realNum1));
		System.out.println("1. 정수 : " + integer(realNum2) + " 소수 : " + decimal(realNum2));
	}
	
	static int integer(double realNum) {
		return (int) (realNum % 10);
		}
	
	static double decimal(double realNum) {
		return realNum - integer(realNum);
	}
}