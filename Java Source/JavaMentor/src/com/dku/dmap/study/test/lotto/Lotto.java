package com.dku.dmap.study.test.lotto;

public class Lotto {
	public static int LOTTO_LEN = 6;
	public int [] numbers = new int[LOTTO_LEN];

	void show() {
		for(int i=0; i<LOTTO_LEN; i++) {
			System.out.println(numbers[i]);
		}
	}

	public int[] getNumbers() {
		return numbers;
	}
}
