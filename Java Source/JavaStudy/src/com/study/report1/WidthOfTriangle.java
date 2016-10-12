package com.study.report1;
import java.text.DecimalFormat;
import java.util.Scanner;

public class WidthOfTriangle {

	private static Scanner sc;

	public static void main(String[] args) {
		int base, height;
		float extent;
		sc = new Scanner(System.in);
		DecimalFormat form = new DecimalFormat("#.##");
		
		System.out.print("�غ��� ���̸� �Է��ϼ��� : ");
		base = sc.nextInt();
		height = sc.nextInt();
		
		extent = (float) (base * height / 2.0);
		
		System.out.println("���̴� " + form.format(extent) + "�Դϴ�.");
	}
}
