package com.study.report2;

public class SumInteger {

	public static void main(String[] args) {
		int num[] = new int[9];
		
		randNum(num);
		sumNum(num);
	}
	
	//�����Լ�
	static void randNum(int num[])
	{
		int max = 9;
		int min = 1;
		
		System.out.print("���� : ");
		//�켱 �� �ڸ������� 3���� ���ڸ� �̴´�.
		for(int i = 0; i < 3; i++) {
			for(int j = i * 3; j < i * 3 + 3; j++) {
				// 1,10,100�� �ڸ��� ���� �ִ´�.
				num[j] = (int) (Math.random() * max + min);
				System.out.print(num[j] + " ");
			}
			
			//1~9, 10~99, 100~999�� �ִ��ּҸ� ����
			min = min * 10;
			max = min * 10 - min - 1;
		}
		
		System.out.println();
		
		//���� ���� �����ϰ� �Ѵ�.
		System.out.print("���� : ");
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
	
	//�� �ڸ����� ���Ѵ�.
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
		
		System.out.println("�� �ڸ����� �� (1, 10, 100 ��) : " + pstnum1 + " " + pstnum2 + " " + pstnum3);
	}
}
