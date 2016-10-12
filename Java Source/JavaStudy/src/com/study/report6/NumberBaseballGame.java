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
			System.out.println("횟수 안으로 게임을 끝내지 못하였습니다.");
			gameclose = true;
		}

		else {
			System.out.print("숫자를 입력하세요 (남은 횟수 " + count + ")" + " : ");

			for (int i = 0; i < MAX_NUMBERS; i++)
				inputNum[i] = input.nextInt();

			for (int i = 0; i < MAX_NUMBERS; i++) {
				if (inputNum[i] < 0) {
					System.out.println("다시 입력하세요.");
				}

				if (inputNum[i] > 9) {
					System.out.println("다시 입력하세요.");
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
			System.out.println("맞췄습니다!!!");
			gameclose = true;
		}

		else if (strike + ball == 0)
			System.out.println("아웃!");

		else
			System.out.println(strike + "스트라이크 " + ball + "볼 입니다.");
	}

	public void startGame() {

		for (int i = 0; i <= MAX_COUNT_LEFT; i++){

			if (gameclose == true)
				break;

			inputNumbers();
		}

	}
}