package Lotto.study;

import java.util.Random;

public class Lotto {
	
	Lotto(){				//�ŰԺ��� ���� �� 7�� ���� ��ȯ
		int[] lottoNum =  new int[7];
		Random r =  new Random();
		
		for(int i = 0; i <= 6; i++){
			lottoNum[i] = r.nextInt(45) + 1;
			for(int j = 0; j < i; j++){
				if(lottoNum[i] == lottoNum[j]){
					i--;
					break;         
				}
			}
		}
		
		System.out.println("�ζ� ��ȣ 7�� ��ȯ: ");
		for(int i = 0; i < 6; i++)
			System.out.println(lottoNum[i]);
		System.out.println("���ʽ� ��ȣ: " + lottoNum[6]);
	};
	
	Lotto(int n){			//n�� ��ŭ�� ���� ��ȯ
		int[] lottoNum = new int[n];
		Random r = new Random();
		
		for(int i = 0; i < n; i++){
			lottoNum[i] =r.nextInt(45) + 1;
			for(int j = 0; j < i; j++){
				if(lottoNum[i] == lottoNum[j]){
					i--;
					break;
				}
			}
		}

		System.out.println("�ζ� ��ȣ " + n +"�� ��ȯ: ");
		for(int i = 0; i < n; i++)
			System.out.println(lottoNum[i]);
	};
}




