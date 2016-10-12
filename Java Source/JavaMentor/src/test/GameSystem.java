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
	
	
	public void randomNumberMake(){ // 1~9까지 랜덤으로 TheNumber개의 숫자를 뽑는 함수 (중복 안됨)
	
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
		
		System.out.println("램덤하게 나온 숫자 : ");
	
		for(int random : randomNumber){
			System.out.print(random+" ");
		}
		System.out.println(" ");
	}
	
	//세자리 숫자를 입력해서 정답과 같은 세자리 숫자가 있으면 ball, 자릿수까지 맞으면 strike,세자릿수 모두 맞으면 정답

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
		System.out.println("결과는 "+ball+"ball "+strike+"strike 입니다.");
  
        if(strike==3){
    	     rightNumber=3;
    	
        }
	
	}
}

	
	
	
	
	
	
