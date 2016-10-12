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
		
		System.out.print("밑변과 높이를 입력하세요 : ");
		base = sc.nextInt();
		height = sc.nextInt();
		
		extent = (float) (base * height / 2.0);
		
		System.out.println("넓이는 " + form.format(extent) + "입니다.");
	}
}
