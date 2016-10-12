package com.study.test;
import java.util.Random;

public class Monster {
	   Random random=new Random();
	   int health;
	   
	   public Monster() {
	      health=(random.nextInt(5)+1)*100;
	   }
	   
	   void attack(Monster m) {
	      if(m.health>=10)   m.health-=10;
	      else m.health=0;
	   }
	   
	   void healthCheck() {
	      System.out.println("Monster의 health는 "+health+"입니다");
	   }
}
