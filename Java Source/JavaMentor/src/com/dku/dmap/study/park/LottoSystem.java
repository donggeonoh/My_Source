package com.dku.dmap.study.park;

import java.util.Arrays;
//정렬에 대해서 공부 하자 . 삽입 ,병합,퀵 정렬
import java.util.Random;



public class LottoSystem extends Lotto{
	
	private int [] winNumber;
    public static int MAX_WIN_NUMBER  = 7;
	private int bonusNumber;   
	public int count=0;   
	public int tryNum=0;
	
	public LottoSystem() {
		   winNumberCreate();
		
	while(count!=6){
			   
	          makeMyNumbers();
	           checkWin();
	           tryNum ++;
	           System.out.println("시도 횟수는 "+tryNum);
	    }
	      
	}

	   private int [] randomNumberCreate(int len) {
	      Random random = new Random(); //랜덤함수 생성
	      int [] randomNumbers = new int[45]; // 45개의 수가 들어갈 배열 생성
	      int [] results = new int[len]; //숫자 len개의 배열 생성
	      
	      for(int i=0; i<45; i++) {
	         randomNumbers[i] = i + 1; //숫자 1~45를 randomNumber 배열에 순차적으로 집어넣음
	      }

	      for(int count = 0; count<500; count++) {
	         int tempNum1 = random.nextInt(45); //0~44까지 랜덤하게 수 하나 생성 후, tempNum1에 저장
	         int tempNum2 = random.nextInt(45); //0~44까지 랜덤하게 수 하나 생성 후, tempNum2에 저장
	         
	         int tempint = randomNumbers[tempNum1];
	         randomNumbers[tempNum1] = randomNumbers[tempNum2];
	         randomNumbers[tempNum2] = tempint;                     //순차적으로 값이 저장되어있는 randomNumbers배열에
	                                                                //순서를 뒤바꾸어 놓음
	      }
	      
	      for(int i = 0; i<len; i++) {
	         results[i] = randomNumbers[i + 1];    //다 섞어 놓은 radomNumbers의 배열에서 0~len-1의 인덱스까지의 값을뽑아서
	                                                   //reseult 배열에 각자 값을 집어넣음
	      }                                            //종이로또는 그저 정렬하면끝나지만 1등당첨번호는 보너스번호와 분리후 정렬을하여야함
	      
	      

	      return results;
	   }
	   
	   public void winNumberCreate() { //당첨번호를 보너스번호를 제외한 나머지 번호를 오름차순으로 정렬함
		   
	   
	      winNumber = randomNumberCreate(MAX_WIN_NUMBER);
	      
	      bonusNumber = winNumber[MAX_WIN_NUMBER-1];
	      
	     Arrays.sort(winNumber, 0, MAX_WIN_NUMBER-2);
	 
	//1등번호가 제대로 나왔는지 확인
	     System.out.println("이번주 당첨번호는 !");
	     for(int showNum: winNumber){ 
	      System.out.print(showNum +" ");
	     
	     }  
	      System.out.println();    
	   }

	   public int [] makeMyNumbers() {  //result에 6개의 숫자가 오름차순으로 정렬되어 저장되어잇음
	    
	  
	      numbers = randomNumberCreate(Lotto.LOTTO_LEN);
	      Arrays.sort(numbers); //로또 종이를 정렬하기 위해서 어쩔수없이 상속을 이용
	      System.out.println("랜덤하게 나온수는");
	      for(int number :numbers){
	    	  System.out.print(number+" ");
	      }
	      return numbers;
	     
	   }
	   
	   public int checkWin() {
		   
		   for(int i=0;i<MAX_WIN_NUMBER-1;i++){
		
			 for(int j=0;j<=i;j++){
				    	 if( winNumber[i]== numbers[j])
				    		 count++;
			     }
		               if(count==4 && bonusNumber == numbers[i]){
				    	 System.out.println("축하 축하 2등입니다.");
				          }
		 }
		      	if(count ==6)
		      		
				   System.out.println("축하축하 1등입니다.");
		      	
		      
				   
				  else if(count ==5){  
				    	 System.out.println("축축 3등입니다.");
				     }
				  
				   else if(count ==4){
				     	 System.out.println("축축 4등입니다.");
				   
				     }
				     else if(count ==3){
				    	 System.out.println("축축 5등입니다.");
				     }
				      else
				     	 System.out.println("아쉽네요 꽝입니다.");
				    	
			   
			   return count;
			 
		   }     
	   }  

