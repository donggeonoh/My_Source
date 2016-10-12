package com.study.lotto;

public class LottoPaper {
	public static int MAX_LOTTO_NUMBERS = 6;
	private int chooseLottoNumbers[] = new int[MAX_LOTTO_NUMBERS];
	
	public LottoPaper(int _chooselottoNumbers[]) {
		for(int i = 0; i < MAX_LOTTO_NUMBERS; i++)
			chooseLottoNumbers[i] = _chooselottoNumbers[i];
	}
	
	public LottoPaper() {
		LottoMachine lottoMachine = new LottoMachine();
		chooseLottoNumbers = lottoMachine.winLottoNumbers();
	}
	
	public void printChooseLottoNumbers() {
		System.out.print("내가 고른 번호 : ");
		
		for(int i = 0; i < MAX_LOTTO_NUMBERS; i++) 
			System.out.print(chooseLottoNumbers[i] + " ");
		
		System.out.println();
	}
	
	public int[] getchooseLottoNumbers() {
		return chooseLottoNumbers;
	}
}
