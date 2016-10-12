package com.study.report5;

public class Main {

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		
		while(true) {
			LottoSystem lottoSystem = new LottoSystem();
			lotto.numbers = lottoSystem.getNumbers();
			
			lotto.show();
			lottoSystem.show();
			
			if (lottoSystem.checkWin(lotto)) break;
		}
	}

}
