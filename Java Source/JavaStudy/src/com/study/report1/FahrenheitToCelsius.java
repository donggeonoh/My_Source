package com.study.report1;

import java.util.Scanner;

public class FahrenheitToCelsius {
	
	private static Scanner sc;

	public static void main(String[] args) {
		int celsius;
		float fahrenheit;
		sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		celsius = sc.nextInt();
		
		fahrenheit = (float) (9.0 / 5.0 * celsius + 32.0);
		System.out.print("ȭ���� ");
		System.out.printf("%.2f", fahrenheit);
		System.out.print("�Դϴ�.");
	}

}
