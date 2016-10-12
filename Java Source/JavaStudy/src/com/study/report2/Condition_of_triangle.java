package com.study.report2;

public class Condition_of_triangle {

	public static void main(String[] args) {
		int num[] = new int[3];
		
		randNum(num);
		cdt_of_triangle(num);
	}
	
	//3개의 변을 랜덤함수로 초기화
	static void randNum(int num[]) {
		System.out.print("변의 길이 : ");
		for(int i = 0; i < num.length; i++) {
			//5에서 20 사이의 숫자 랜덤하게 초기화
			num[i] = (int) (Math.random() * 20 + 5);
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
	
	//삼각형 조건 확인
	static void cdt_of_triangle(int num[]) {
		int maxBase = num[0];
		int index = 0, base = 0;
		int i;
		
		//가장 큰 변을 찾는다.
		for(i = 1; i < num.length; i++)
			if(maxBase < num[i]) {
				maxBase = num[i];
				index = i;
			}
		
		//큰 변을 뺀 나머지를 더한다.
		for(i = 0; i < num.length; i++) {
			if(i == index) continue;
			else base += num[i];
		}
		
		//나머지 두 변의 길이의 합이 가장 큰변보다 클 경우 Yes 아니면 No 출력
		if(maxBase < base) System.out.println("Yes");
		else System.out.println("No");
	}
}