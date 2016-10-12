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
	      System.out.println(name + "는 공사중 입니다.");

	   }
	   
	   void locate(){
	      System.out.println(name + "는 " + location +"에 위치해있습니다.");
	   }
	   
	   void extent(){
	      System.out.println(name + "의 총 면적은 " + area +"m^2 입니다.");
	   }
	   
	   public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      School Dankook = new School("단국대학교", "죽전", 614155);
	      Dankook.name = "단국대학교";
	      Dankook.repair();
	      Dankook.locate();
	      Dankook.extent();

	   }

	}