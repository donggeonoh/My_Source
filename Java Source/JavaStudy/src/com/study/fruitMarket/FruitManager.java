package com.study.fruitMarket;

import java.util.Scanner;

public class FruitManager {
	String apple = "���";
	int applePrice = 2000;
	int appleCount;
	
	String pear = "��";
	int pearPrice = 1500;
	int pearCount;
	
	String orange = "������";
	int orangePrice = 1700;
	int orangeCount;
	
	public void selectMenu(int selectMenu) {
		switch(selectMenu) {
		case 1:
			chooseFruit();
			break;
		case 2:
			displayFruit();
			break;
		case 3:
			payFruit();
			break;
		default:
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
		}
	}

	private void payFruit() {
		// TODO Auto-generated method stub
		
	}

	private void displayFruit() {
		showFruit(apple, appleCount);
		showFruit(pear, pearCount);
		showFruit(orange, orangeCount);
	}
	
	private void showFruit(String fruit, int count) {
		System.out.println(fruit + " : " + count + "��");
	}
	
	private void showFruitPrice(String fruit, int price) {
		System.out.println(fruit + " : " + price + "��");
	}

	private void chooseFruit() {
		Scanner selectFruit = new Scanner(System.in);
		
		showFruitPrice(apple, applePrice);
		showFruitPrice(pear, pearPrice);
		showFruitPrice(orange, orangePrice);
		
		String fruit;
		int fruitCount;
		
		while(true) {
			System.out.print("���� ������ : ");
			
			fruit = selectFruit.next();
			fruitCount = selectFruit.nextInt();
			
			if(fruitCount < 0) {
				System.out.println("�ٽ� �Է��ϼ���");
				continue;
			}
			
			if(fruit.equals(apple)) {
				appleCount += fruitCount;
				break;
			}
			else if(fruit.equals(pear)) {
				pearCount += fruitCount;
				break;
			}
			else if(fruit.equals(orange)) {
				orangeCount += fruitCount;
				break;
			}			
			else
				System.out.println("�ٽ� �Է��ϼ���");
		}
		
		selectFruit.close();
	}
}