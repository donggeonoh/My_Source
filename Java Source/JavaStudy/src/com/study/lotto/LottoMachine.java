package com.study.lotto;

import java.util.Arrays;

public class LottoMachine {
	public static int MAX_LOTTO_NUMBERS = 6;
	private int thisWeekLottoNumbers[] = new int[MAX_LOTTO_NUMBERS];
	
	public LottoMachine() {
		winLottoNumbers();
	}
	
	public int[] winLottoNumbers() {
		int lottoNumbers[] = new int[45];
		int tempInt, tempLottoNum1, tempLottoNum2;
		
		for(int i = 0; i < 45; i++) lottoNumbers[i] = i + 1;
		
		for(int i = 0; i < 1000; i++) {
			tempLottoNum1 = (int)(Math.random() * 45);
			tempLottoNum2 = (int)(Math.random() * 45);
			
			tempInt = lottoNumbers[tempLottoNum1];
			lottoNumbers[tempLottoNum1] = lottoNumbers[tempLottoNum2];
			lottoNumbers[tempLottoNum2] = tempInt;
		}
		
		for(int i = 0; i < MAX_LOTTO_NUMBERS; i++)
			thisWeekLottoNumbers[i] = lottoNumbers[i];
		
		Arrays.sort(thisWeekLottoNumbers);
		
		return thisWeekLottoNumbers;
	}
	
	public void collectLottoNumbers(int[] num) {
		int count;
		
		for(count = 0; count < MAX_LOTTO_NUMBERS; count++)
			if(num[count] != thisWeekLottoNumbers[count]) break;
		
		if(count == MAX_LOTTO_NUMBERS) {
			System.out.println(" 1µî ´çÃ· µÇ¾ú½À´Ï´Ù!!!");
		}
		
		else {
			System.out.println("²Î! " + count + " °³ ¸ÂÃã");
			System.out.println();
		}
	}
	
	public void printThisWeekLottoNumbers() {
		System.out.print("ÀÌ¹ø ÁÖ ·Î¶Ç ´çÃ·¹øÈ£ : ");
		
		for(int i = 0; i < MAX_LOTTO_NUMBERS; i++)
			System.out.print(thisWeekLottoNumbers[i] + " ");
		
		System.out.println();
	}
}
