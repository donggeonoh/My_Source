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
	         System.out.println(name + "��ǻ�Ͱ� �������ϴ�.");
	      else
	         System.out.println(name + "��ǻ�Ͱ� �������ϴ�.");
	   }
	   
	   
	   public static void main(String []agrs){
	      Computer com1 = new Computer("�Ｚ","���簢��");
	      Computer com2 = new Computer("LG","���簢��");
	      com1.getonoff(true);
	      com2.getonoff(false);
	      
	      
	   }

	}