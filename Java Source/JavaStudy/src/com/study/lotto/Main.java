package com.study.lotto;

public class Main {

	public static void main(String[] args) {
		
		int count = 1;
		
		while(true) {
			LottoPaper lottoPaper = new LottoPaper();
			LottoMachine lottoMachine = new LottoMachine();
			
			System.out.println(count + " ��° �õ�");
			lottoPaper.printChooseLottoNumbers();
			lottoMachine.printThisWeekLottoNumbers();
			lottoMachine.collectLottoNumbers(lottoPaper.getchooseLottoNumbers());
			
			count++;
		}
	}

}
