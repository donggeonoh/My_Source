package com.dku.dmap.study;

public class Computer {
	   String name;
	   String shape;
	   int size;
	   boolean OnOff;
	   int capacity;
	   
	   public Computer(String _name,String _shape){
	      name = _name;
	      shape = _shape;
	   }
	   
	   void getonoff(boolean getonoff){
	      OnOff = getonoff;
	      if(OnOff)
	         System.out.println(name + "컴퓨터가 켜졌습니다.");
	      else
	         System.out.println(name + "컴퓨터가 꺼졌습니다.");
	   }
	   
	   
	   public static void main(String []agrs){
	      Computer com1 = new Computer("삼성","정사각형");
	      Computer com2 = new Computer("LG","직사각형");
	      com1.getonoff(true);
	      com2.getonoff(false);
	      
	      
	   }

	}