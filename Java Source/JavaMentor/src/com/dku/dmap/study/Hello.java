package com.dku.dmap.study;

import java.util.Random;

public class Hello {
	
	public static void main(String [] agrs){
		Random random = new Random();
		
		Persen choi = new Persen("��", true);
		
		int num = random.nextInt(10);
		System.out.println("������ ���� �� : "  + num);
	}
	
}
 