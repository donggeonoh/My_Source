package com.dmaps.study.numberBaseball;

import com.dmaps.study.frame.InputFrame;
import com.dmaps.study.frame.PrintFrame;

public class NumberBaseballGame {
	public int MAX_NUMBERS = 3;
	public int MAX_COUNT_LEFT = 10;

	private int randNumbers[];
	private int count;
	private boolean gameclose;
	
	PrintFrame printFrame;
	
	public NumberBaseballGame(PrintFrame printFrame) {
		this.printFrame = printFrame;
		
		count = MAX_COUNT_LEFT;
		gameclose = false;
		
		getNumberOfTimes();
		
		randomNumbers();
	}

	private void randomNumbers() {
		randNumbers = new int[MAX_NUMBERS];

		for (int i = 0; i < MAX_NUMBERS; i++) {
			randNumbers[i] = (int)(Math.random() * 10);

			for (int j = 0; j < i; j++) {
				if (randNumbers[i] == randNumbers[j])
					i--;
			}
		}

	}

	public void getNumbers(int[] numbers) {
		startGame(numbers);
	}
	
	private void getNumberOfTimes() {
		printFrame.setDisplayArea("���� Ƚ�� : " + count +"��");
	}
	
	private void inputNumbers(int[] numbers) {

		if (count == 1) {
			printFrame.setDisplayArea("Ƚ�� ������ ������ ������ ���Ͽ����ϴ�.");
			gameclose = true;
		}

		
		else {
			printFrame.setDisplayArea(numbers[0] + " " + numbers[1] + " " + numbers[2]);
			
			/*
			for (int i = 0; i < MAX_NUMBERS; i++) {
				if (inputNum[i] < 0) {
					System.out.println("�ٽ� �Է��ϼ���.");
				}

				if (inputNum[i] > 9) {
					System.out.println("�ٽ� �Է��ϼ���.");
				}

			}
			*/

			count--;
			compareNumbers(numbers);
		}
	}

	private void compareNumbers(int[] numbers) {
		int strike = 0, ball = 0;

		for (int i = 0; i < InputFrame.PICKNUMBER_LENGTH; i++)
			for (int j = 0; j < InputFrame.PICKNUMBER_LENGTH; j++) {

				if (randNumbers[i] == numbers[j] && i == j)
					strike++;

				else if (randNumbers[i] == numbers[j] && i != j)
					ball++;
			}

		printNumbers(strike, ball);
	}

	private void printNumbers(int strike, int ball) {
		if (strike == MAX_NUMBERS) {
			printFrame.setDisplayArea("������ϴ�!!!\n");
			gameclose = true;
		}

		else if (strike + ball == 0) {
			printFrame.setDisplayArea("�ƿ�!\n");
			getNumberOfTimes();
		}
		
		else {
			printFrame.setDisplayArea(strike + "��Ʈ����ũ " + ball + "�� �Դϴ�.\n");
			getNumberOfTimes();
		}
	}

	public void startGame(int[] numbers) {
			inputNumbers(numbers);
			
			if (gameclose == true) {
				
			}
	}
}