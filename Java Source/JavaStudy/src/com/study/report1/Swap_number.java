package com.study.report1;
import java.util.Scanner;

public class Swap_number {

	private static Scanner input;

	public static void main(String[] args) {
		int num1, num2;
		int temp;
		input = new Scanner(System.in);
		
		System.out.print("두 숫자를 입력하세요 : ");
		num1 = input.nextInt();
		num2 = input.nextInt();
	
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("출력 값 : " + num1 + " " + num2);
	}

}
