package test;

import java.util.Scanner;

public class MakeNumbers {
	
	public static int TheNumber = 3;
	protected int[] myNumber= new int[TheNumber]; //3���� ���� �޴� �迭 number
	
	
	public void makeMyNumbers(){
		
	Scanner sc= new Scanner(System.in);
	
	System.out.println( TheNumber+"�� �� ���ڸ� �Է��ϼ��� (�� 1~9�������ڸ� �Է�) : ");
	
	for(int i =0;i<TheNumber;i++){
		myNumber[i]= sc.nextInt();
		 if(myNumber[i]<0 || myNumber[i]>9){
			System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���");
			
		}
	}

	for(int numbers : myNumber){
		System.out.print(numbers +" ");
	}
	System.out.println();
  }
	
}