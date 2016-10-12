package com.study.report4;
import java.util.Scanner;

public class User extends Unit{
	
	private Scanner scanner;

	public int inputNumber() {
		int input;
		scanner = new Scanner(System.in);
		
		System.out.print("1. 공격 2. 스킬사용 : ");
		input = scanner.nextInt();
		
		return input;
	}
	
}
