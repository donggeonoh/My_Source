package com.study.fruitMarket;

import java.util.Scanner;

public class FruitMarketLauncher {
	FruitManager fruitManager;
	Scanner input = new Scanner(System.in);

	public FruitMarketLauncher() {
		fruitManager = new FruitManager();
		menu();
	}

	private void menu() {
		while(true) {
			System.out.println();
			System.out.println("메뉴를 고르세요");
			System.out.println("1. 과일 고르기");
			System.out.println("2. 선택한 과일 보기");
			System.out.println("3. 과일 결제하기");
			System.out.println("4. 끝내기");
			System.out.print("입력하세요 : ");
			
			int selectMenu = input.nextInt();
			
			fruitManager.selectMenu(selectMenu);
		}
	}

}
