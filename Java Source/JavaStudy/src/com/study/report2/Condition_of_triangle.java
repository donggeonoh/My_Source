package com.study.report2;

public class Condition_of_triangle {

	public static void main(String[] args) {
		int num[] = new int[3];
		
		randNum(num);
		cdt_of_triangle(num);
	}
	
	//3���� ���� �����Լ��� �ʱ�ȭ
	static void randNum(int num[]) {
		System.out.print("���� ���� : ");
		for(int i = 0; i < num.length; i++) {
			//5���� 20 ������ ���� �����ϰ� �ʱ�ȭ
			num[i] = (int) (Math.random() * 20 + 5);
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
	
	//�ﰢ�� ���� Ȯ��
	static void cdt_of_triangle(int num[]) {
		int maxBase = num[0];
		int index = 0, base = 0;
		int i;
		
		//���� ū ���� ã�´�.
		for(i = 1; i < num.length; i++)
			if(maxBase < num[i]) {
				maxBase = num[i];
				index = i;
			}
		
		//ū ���� �� �������� ���Ѵ�.
		for(i = 0; i < num.length; i++) {
			if(i == index) continue;
			else base += num[i];
		}
		
		//������ �� ���� ������ ���� ���� ū������ Ŭ ��� Yes �ƴϸ� No ���
		if(maxBase < base) System.out.println("Yes");
		else System.out.println("No");
	}
}