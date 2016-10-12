package com.dku.dmap.study;

import java.util.Random;

public class Hello {
	
	public static void main(String [] agrs){
		Random random = new Random();
		
		Persen choi = new Persen("최", true);
		
		int num = random.nextInt(10);
		System.out.println("생성된 랜덤 값 : "  + num);
	}
	
}
 