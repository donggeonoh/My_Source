package com.study.practice;
import java.util.Random;

public class FindNum {

	public static void main(String[] args) {
		int [] num = new int[100];
		int randNum, sumNum = 0, findNum;
		Random rand = new Random();
		
		for(int i = 0; i < 100; i++)
			num[i] = i + 1;
		
		randNum = rand.nextInt(100 + 1);
		System.out.println("ºüÁø ¼ö : " + num[randNum]);
		
		num[randNum] = 0;
		
		for(int i = 0; i < 100; i++)
			sumNum += i;
		
		findNum = 5050 - sumNum;
		
		System.out.println(findNum);
	}
}
