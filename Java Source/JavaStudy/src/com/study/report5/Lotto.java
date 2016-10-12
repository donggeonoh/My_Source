package com.study.report5;

public class Lotto {
	public static int LOTTO_LEN = 6;
	public int[] numbers = new int[LOTTO_LEN];
	
	void show() {
		System.out.print("선택 번호 : ");
		
		for(int i = 0; i < LOTTO_LEN; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
	}
	
	public int[] getNumbers() {
		return numbers;
	}
}