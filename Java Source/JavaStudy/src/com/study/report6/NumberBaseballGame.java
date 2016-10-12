package com.study.report6;

import java.util.Scanner;

public class NumberBaseballGame {
	public int MAX_NUMBERS = 3;
	public int MAX_COUNT_LEFT = 10;

	private int randNumbers[];
	private int count;
	private boolean gameclose;

	public NumberBaseballGame() {
		count = MAX_COUNT_LEFT;
		gameclose = false;
		randomNumbers();
	}

	private void randomNumbers() {
		randNumbers = new int[MAX_NUMBERS];

		for (int i = 0; i < MAX_NUMBERS; i++) {
			randNumbers[i] = (int)(Math.random() * 10 + 1);

			for (int j = 0; j < i; j++) {
				if (randNumbers[i] == randNumbers[j])
					i--;
			}
		}

	}

	private void inputNumbers() {
		int inputNum[] = new int[MAX_NUMBERS];
		Scanner input = new Scanner(System.in);

		if (count == 0) {
			System.out.println("Ƚ�� ������ ������ ������ ���Ͽ����ϴ�.");
			gameclose = true;
		}

		else {
			System.out.print("���ڸ� �Է��ϼ��� (���� Ƚ�� " + count + ")" + " : ");

			for (int i = 0; i < MAX_NUMBERS; i++)
				inputNum[i] = input.nextInt();

			for (int i = 0; i < MAX_NUMBERS; i++) {
				if (inputNum[i] < 0) {
					System.out.println("�ٽ� �Է��ϼ���.");
				}

				if (inputNum[i] > 9) {
					System.out.println("�ٽ� �Է��ϼ���.");
				}

			}
			
			for (int i = 0; i < MAX_NUMBERS; i++) {

			}

			count--;
			compareNumbers(inputNum);
		}
	}

	private void compareNumbers(int[] baseballNum) {
		int strike = 0, ball = 0;

		for (int i = 0; i < MAX_NUMBERS; i++)
			for (int j = 0; j < MAX_NUMBERS; j++) {

				if (randNumbers[i] == baseballNum[j] && i == j)
					strike++;

				else if (randNumbers[i] == baseballNum[j] && i != j)
					ball++;
			}

		printNumbers(strike, ball);
	}

	private void printNumbers(int strike, int ball) {
		if (strike == MAX_NUMBERS) {
			System.out.println("������ϴ�!!!");
			gameclose = true;
		}

		else if (strike + ball == 0)
			System.out.println("�ƿ�!");

		else
			System.out.println(strike + "��Ʈ����ũ " + ball + "�� �Դϴ�.");
	}

	public void startGame() {

		for (int i = 0; i <= MAX_COUNT_LEFT; i++){

			if (gameclose == true)
				break;

			inputNumbers();
		}

	}
}