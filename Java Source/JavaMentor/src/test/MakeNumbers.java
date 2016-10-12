package test;

import java.util.Scanner;

public class MakeNumbers {
	
	public static int TheNumber = 3;
	protected int[] myNumber= new int[TheNumber]; //3개의 값을 받는 배열 number
	
	
	public void makeMyNumbers(){
		
	Scanner sc= new Scanner(System.in);
	
	System.out.println( TheNumber+"개 의 숫자를 입력하세요 (단 1~9까지숫자만 입력) : ");
	
	for(int i =0;i<TheNumber;i++){
		myNumber[i]= sc.nextInt();
		 if(myNumber[i]<0 || myNumber[i]>9){
			System.out.println("잘못된 숫자를 입력하셨습니다. 다시 입력하세요");
			
		}
	}

	for(int numbers : myNumber){
		System.out.print(numbers +" ");
	}
	System.out.println();
  }
	
}