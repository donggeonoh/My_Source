package com.dku.dmap.study;

public class Phone {
	   private  String name;
	   int displaySize;
	   int howMuch;
	   int giga;
	    
	    
	    public Phone(String _name, int _displaysize, int _howMuch, int _giga){
	       name = _name;
	       displaySize = _displaysize;
	       howMuch = _howMuch;
	       giga = _giga;
	    }
	   
	    void showDisplaySize(){
	       
	       System.out.println(name + " �� " + displaySize + "��ġ �Դϴ�");
	    }
	   void show_howMuch(){
	      System.out.println(name + " �� " + howMuch + "�� �Դϴ�.");
	   }
	   void show_giga(){
	      System.out.println(name + " ��  " + giga + "�Ⱑ �Դϴ�");
	   }
	   

	   public static void main(String[] kim) {

	      Phone phone = new Phone("G3 Screen", 15, 200000, 16);
	      
	      phone.showDisplaySize();
	      phone.show_howMuch();
	      phone.show_giga();
	      
	      
	      
	   }
	}
	   
