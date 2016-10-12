package com.dku.dmap.study.test.lotto;

import java.util.Arrays;
import java.util.Random;

public class LottoSystem {
	
	private int [] winNumber;
	public static int MAX_WIN_NUMBER  = 7;
	
	public LottoSystem() {
		winNumverCreate();
		
	}

	private int [] randomNumberCreate(int len) {
		Random random = new Random();
		int [] randomNumbers = new int[45];
		int [] results = new int[len];
		
		for(int i=0; i<45; i++) {
			randomNumbers[i] = i + 1;
		}

		for(int count = 0; count<500; count++) {
			int tempNum1 = random.nextInt(45);
			int tempNum2 = random.nextInt(45);
			
			int tempint = randomNumbers[tempNum1];
			randomNumbers[tempNum1] = randomNumbers[tempNum2];
			randomNumbers[tempNum2] = tempint;
		}
		
		for(int i = 0; i<len; i++) {
			results[i] = randomNumbers[i + 1];
		}
		
		Arrays.sort(results);
		
		return results;
	}
	
	public void winNumverCreate() {
		winNumber = randomNumberCreate(MAX_WIN_NUMBER);
	}

	public int [] getNumbers() {
		return randomNumberCreate(Lotto.LOTTO_LEN);
	}
	
	public int checkWin(Lotto lotto) {
		lotto.getNumbers();
		lotto.numbers[0] = 100;
		return 1;
	}
}
