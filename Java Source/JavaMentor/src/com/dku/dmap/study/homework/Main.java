package com.dku.dmap.study.homework;

public class Main {
	public static void main(String [] args) {
		m1 m1 = new m1();
		m2 m2 = new m2();
		
		while(true) {
			m1.attacker(m2);
			if(m2.getHp() < 0) {
				break;
			}
		}
		
	}
}
