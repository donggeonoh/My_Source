package com.study.report1;
import java.util.Scanner;

public class SecondsToMinutes {

	private static Scanner sc;

	public static void main(String[] args) {
		int minutes;
		sc = new Scanner(System.in);
	
		System.out.print("���� �Է��ϼ��� : ");
		minutes = sc.nextInt();
		
		minutes *= minutes * 60;
		
		System.out.println(minutes + "�� �Դϴ�.");
	}
}
