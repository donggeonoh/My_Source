package com.dku.dmap.study;

public class School {
	   String name;
	   String location;
	   int area;
	   
	   public School(String _name, String _location, int _area){
	      name = _name;
	      location = _location;
	      area = _area;
	   }
	   
	   void repair(){
	      System.out.println(name + "�� ������ �Դϴ�.");

	   }
	   
	   void locate(){
	      System.out.println(name + "�� " + location +"�� ��ġ���ֽ��ϴ�.");
	   }
	   
	   void extent(){
	      System.out.println(name + "�� �� ������ " + area +"m^2 �Դϴ�.");
	   }
	   
	   public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      School Dankook = new School("�ܱ����б�", "����", 614155);
	      Dankook.name = "�ܱ����б�";
	      Dankook.repair();
	      Dankook.locate();
	      Dankook.extent();

	   }

	}