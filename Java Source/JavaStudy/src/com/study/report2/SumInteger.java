package com.study.report2;

public class SumInteger {

	public static void main(String[] args) {
		int num[] = new int[9];
		
		randNum(num);
		sumNum(num);
	}
	
	//랜덤함수
	static void randNum(int num[])
	{
		int max = 9;
		int min = 1;
		
		System.out.print("숫자 : ");
		//우선 각 자릿수마다 3개씩 숫자를 뽑는다.
		for(int i = 0; i < 3; i++) {
			for(int j = i * 3; j < i * 3 + 3; j++) {
				// 1,10,100의 자릿수 값을 넣는다.
				num[j] = (int) (Math.random() * max + min);
				System.out.print(num[j] + " ");
			}
			
			//1~9, 10~99, 100~999의 최대최소를 결정
			min = min * 10;
			max = min * 10 - min - 1;
		}
		
		System.out.println();
		
		//뽑은 수를 랜덤하게 한다.
		System.out.print("숫자 : ");
		for(int i = 0; i < 100; i++) {
			int rand1, rand2;
			int temp;
			
			rand1 = (int) (Math.random() * 9);
			rand2 = (int) (Math.random() * 9);
			
			temp = num[rand1];
			num[rand1] = num[rand2];
			num[rand2] = temp;
		}
		
		for(int i = 0; i < 9; i++)
			System.out.print(num[i] + " ");
		
		System.out.println();
	}
	
	//각 자릿수를 더한다.
	static void sumNum(int num[])
	{
		int pstnum1 = 0, pstnum2 = 0, pstnum3 = 0;
		
		for(int i = 0; i < 9; i++) {
			if(0 < num[i] && 10 > num[i])
				pstnum1 += num[i];
			
			else if(10 <= num[i] && 100 > num[i])
				pstnum2 += num[i];
			
			else if(100 <= num[i] && 1000 > num[i])
				pstnum3 += num[i];
		}
		
		System.out.println("각 자릿수의 합 (1, 10, 100 순) : " + pstnum1 + " " + pstnum2 + " " + pstnum3);
	}
}
