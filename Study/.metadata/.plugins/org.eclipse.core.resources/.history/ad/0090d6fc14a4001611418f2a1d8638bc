package Lotto.study;

import java.util.Random;

public class Lotto {
	
	Lotto(){				//매게변수 없을 때 7개 변수 반환
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
		
		System.out.println("로또 번호 7개 반환: ");
		for(int i = 0; i < 6; i++)
			System.out.println(lottoNum[i]);
		System.out.println("보너스 번호: " + lottoNum[6]);
	};
	
	Lotto(int n){			//n개 만큼의 변수 반환
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

		System.out.println("로또 번호 " + n +"개 반환: ");
		for(int i = 0; i < n; i++)
			System.out.println(lottoNum[i]);
	};
}




