package test;

import java.util.Random;

public class GameSystem extends MakeNumbers {

	public int[] randomNumber = new int[TheNumber];
	public int rightNumber=0;
	public GameSystem(){  
		
		randomNumberMake();
		System.out.println();
		while(rightNumber!=3){
		makeMyNumbers();
		judgment();
		System.out.println();
		}
		
	
	}
	
	
	public void randomNumberMake(){ // 1~9���� �������� TheNumber���� ���ڸ� �̴� �Լ� (�ߺ� �ȵ�)
	
		for(int i=0;i<TheNumber;i++){
			randomNumber[i]=(int)(Math.random()*9+1);	
           for(int j=0;j<i;j++){
        	   if(randomNumber[i]==randomNumber[j]){
        		   randomNumber[i]=(int)(Math.random()*9+1);	
        		   i-=1;
        		   break;
        	   }
           }
	     }
		
		System.out.println("�����ϰ� ���� ���� : ");
	
		for(int random : randomNumber){
			System.out.print(random+" ");
		}
		System.out.println(" ");
	}
	
	//���ڸ� ���ڸ� �Է��ؼ� ����� ���� ���ڸ� ���ڰ� ������ ball, �ڸ������� ������ strike,���ڸ��� ��� ������ ����

	public void judgment(){
		
		int strike=0;
		int ball=0;
		
		for(int i=0;i<TheNumber;i++){
			for(int j=0;j<TheNumber;j++){
			   if(myNumber[i]==randomNumber[j]){
				   ball+=1;
				  if(i==j){
					 strike+=1;
				  }
	       	   }
			}
	    }
		System.out.println("����� "+ball+"ball "+strike+"strike �Դϴ�.");
  
        if(strike==3){
    	     rightNumber=3;
    	
        }
	
	}
}

	
	
	
	
	
	
