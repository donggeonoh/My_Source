package com.study.test;

public class Test1Main {

	public static void main(String[] args) {
		//Test1 M1=new Test1();
		//Test1 M2=new Test1();     
	      /*
	      while(true) {
		      M1.healthCheck();
	      M1.attack(M2);
	      	M2.healthCheck();
	      M2.attack(M1);
	      if(M1.deadMonster() == 1)
	    	  break;
	      
	      else if(M2.deadMonster() == 1)
	    	  break;
	      } */
	
    Monster m1=new Monster();
    Monster m2=new Monster();
    
    while((m1.health!=0 && m2.health!=0) == true) {
       m1.healthCheck();
       m1.attack(m2);
       m2.healthCheck();
       m2.attack(m1);
    }
}
}