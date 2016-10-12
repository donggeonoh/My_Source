package com.dku.dmap.study;

public class Bird {
	   String food,kind;
	   int size;
	   
	   public Bird(int _size,String _food,String _kind) {
	      size=_size;
	      food=_food;
	      kind=_kind;
	   }
	   void SaySize() {
	      System.out.println("크기는 "+size+"cm입니다");
	   }
	   void SayKind() {
	      System.out.println("종류는 "+kind+"입니다");
	   }
	   void SayFood() {
	      System.out.println(food+"입니다");
	   }
	   
	   void feed(String food, Persen choiGunhee) {
		   
		   if(!choiGunhee.name.equals("최건희")) {
			   System.out.println("안먹어");
		   } else {
			   if(kind.equals("육식")) {
				   System.out.println("잘먹었어");
			   } else {
				   System.out.println("안먹어");
			   }
		   }
		   
		   
		  
	   }
	   
	   
	   public static void main(String []agrs) {
	      Bird sparrow=new Bird(8,"잡식","참새");
	      sparrow.SaySize();
	      sparrow.SayKind();
	      sparrow.SayFood();
	      
	      Persen choiGunhee = new Persen("최건희", true);
	      
	      Bird eagle=new Bird(200,"육식","독수리");
	      eagle.SayKind();
	      eagle.SaySize();
	      eagle.SayFood();
	      eagle.feed("사과", choiGunhee);
	   }
	}