package com.study.lotto;

import java.util.Arrays;

public class LottoSystem {
	private int winNumber[] = new int[7];
	
	public LottoSystem() {
		winNumberCreate();
	}

	public void winNumberCreate() {
		int randomNumbers[] = new int[45];
		
		for(int i = 0; i < 45; i++) {
			randomNumbers[i] = i + 1;
		}
		
		for(int count = 0; count < 1000; count++) {
		int tempNumber1 = (int)(Math.random() * 45);
		int tempNumber2 = (int)(Math.random() * 45);
		
		int tempint = randomNumbers[tempNumber1];
		randomNumbers[tempNumber1] = randomNumbers[tempNumber2];
		randomNumbers[tempNumber2] = tempint;
		}
		
		printLotto(randomNumbers);
		
		for(int i = 0; i < winNumber.length; i++) {
			System.out.print(randomNumbers[i] + " ");
		}
	}
	
	public void printLotto(int randomNumbers[]) {
		for(int i = 0; i < 45; i++) {
			System.out.print(randomNumbers[i] + " ");
		}
		
		System.out.println();
	}
}
