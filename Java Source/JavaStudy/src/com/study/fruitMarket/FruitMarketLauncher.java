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
			System.out.println("�޴��� ������");
			System.out.println("1. ���� ����");
			System.out.println("2. ������ ���� ����");
			System.out.println("3. ���� �����ϱ�");
			System.out.println("4. ������");
			System.out.print("�Է��ϼ��� : ");
			
			int selectMenu = input.nextInt();
			
			fruitManager.selectMenu(selectMenu);
		}
	}

}
