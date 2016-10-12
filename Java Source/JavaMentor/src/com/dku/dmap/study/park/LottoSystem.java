package com.dku.dmap.study.park;

import java.util.Arrays;
//���Ŀ� ���ؼ� ���� ���� . ���� ,����,�� ����
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
	           System.out.println("�õ� Ƚ���� "+tryNum);
	    }
	      
	}

	   private int [] randomNumberCreate(int len) {
	      Random random = new Random(); //�����Լ� ����
	      int [] randomNumbers = new int[45]; // 45���� ���� �� �迭 ����
	      int [] results = new int[len]; //���� len���� �迭 ����
	      
	      for(int i=0; i<45; i++) {
	         randomNumbers[i] = i + 1; //���� 1~45�� randomNumber �迭�� ���������� �������
	      }

	      for(int count = 0; count<500; count++) {
	         int tempNum1 = random.nextInt(45); //0~44���� �����ϰ� �� �ϳ� ���� ��, tempNum1�� ����
	         int tempNum2 = random.nextInt(45); //0~44���� �����ϰ� �� �ϳ� ���� ��, tempNum2�� ����
	         
	         int tempint = randomNumbers[tempNum1];
	         randomNumbers[tempNum1] = randomNumbers[tempNum2];
	         randomNumbers[tempNum2] = tempint;                     //���������� ���� ����Ǿ��ִ� randomNumbers�迭��
	                                                                //������ �ڹٲپ� ����
	      }
	      
	      for(int i = 0; i<len; i++) {
	         results[i] = randomNumbers[i + 1];    //�� ���� ���� radomNumbers�� �迭���� 0~len-1�� �ε��������� �����̾Ƽ�
	                                                   //reseult �迭�� ���� ���� �������
	      }                                            //���̷ζǴ� ���� �����ϸ鳡������ 1���÷��ȣ�� ���ʽ���ȣ�� �и��� �������Ͽ�����
	      
	      

	      return results;
	   }
	   
	   public void winNumberCreate() { //��÷��ȣ�� ���ʽ���ȣ�� ������ ������ ��ȣ�� ������������ ������
		   
	   
	      winNumber = randomNumberCreate(MAX_WIN_NUMBER);
	      
	      bonusNumber = winNumber[MAX_WIN_NUMBER-1];
	      
	     Arrays.sort(winNumber, 0, MAX_WIN_NUMBER-2);
	 
	//1���ȣ�� ����� ���Դ��� Ȯ��
	     System.out.println("�̹��� ��÷��ȣ�� !");
	     for(int showNum: winNumber){ 
	      System.out.print(showNum +" ");
	     
	     }  
	      System.out.println();    
	   }

	   public int [] makeMyNumbers() {  //result�� 6���� ���ڰ� ������������ ���ĵǾ� ����Ǿ�����
	    
	  
	      numbers = randomNumberCreate(Lotto.LOTTO_LEN);
	      Arrays.sort(numbers); //�ζ� ���̸� �����ϱ� ���ؼ� ��¿������ ����� �̿�
	      System.out.println("�����ϰ� ���¼���");
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
				    	 System.out.println("���� ���� 2���Դϴ�.");
				          }
		 }
		      	if(count ==6)
		      		
				   System.out.println("�������� 1���Դϴ�.");
		      	
		      
				   
				  else if(count ==5){  
				    	 System.out.println("���� 3���Դϴ�.");
				     }
				  
				   else if(count ==4){
				     	 System.out.println("���� 4���Դϴ�.");
				   
				     }
				     else if(count ==3){
				    	 System.out.println("���� 5���Դϴ�.");
				     }
				      else
				     	 System.out.println("�ƽ��׿� ���Դϴ�.");
				    	
			   
			   return count;
			 
		   }     
	   }  

