package com.study.report5;

import java.util.Arrays;

public class LottoSystem {
	
	public static int MAX_WIN_NUMBER = 7;
	private int[] winLottoNumbers;
	
	public LottoSystem() {
		createWinNumbers();
	}
	
	private int[] createRandomLottoNumbers(int len) {
		int randomLottoNumbers[] = new int[45];
		int results[] = new int[len];
	
		for(int i = 0; i < 45; i++)
			randomLottoNumbers[i] = i + 1;
	
		for(int count = 0; count < 1000; count++) {
			int tempLottoNum1 = (int)(Math.random() * 45);
			int tempLottoNum2 = (int)(Math.random() * 45);
			
			int tempInt = randomLottoNumbers[tempLottoNum1];
			randomLottoNumbers[tempLottoNum1] = randomLottoNumbers[tempLottoNum2];
			randomLottoNumbers[tempLottoNum2] = tempInt;
		}
		
		for(int i = 0; i < len; i++)
			results[i] = randomLottoNumbers[i + 1];
		
		Arrays.sort(results);
		
		return results;
	}
	
	private void createWinNumbers() {
		winLottoNumbers = createRandomLottoNumbers(MAX_WIN_NUMBER);
	}
	
	public int[] getNumbers() {
		return createRandomLottoNumbers(Lotto.LOTTO_LEN);
	}
	
	public boolean checkWin(Lotto lotto) {
		int[] chooseLottoNumbers = lotto.getNumbers();
		int count = 0;
		
		for(int i = 0; i < Lotto.LOTTO_LEN; i++) {
			if(winLottoNumbers[i] == chooseLottoNumbers[i])
				count++;
			
			else
				break;
		}
		
		if(count == Lotto.LOTTO_LEN) {
			System.out.println("1등에 당첨되었습니다!");
			System.out.println();
			return true;
		}
		
		else {
			System.out.println(count + "개 맞췄습니다.");
			System.out.println();
			return false;
		}
	}
	
	void show() {
		System.out.print("이번 주 당첨번호 : ");
		
		for(int i = 0; i < MAX_WIN_NUMBER; i++)
			System.out.print(winLottoNumbers[i] + " ");
		
		System.out.println();
	}
	
}
