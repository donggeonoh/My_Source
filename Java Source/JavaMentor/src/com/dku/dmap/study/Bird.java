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
	      System.out.println("ũ��� "+size+"cm�Դϴ�");
	   }
	   void SayKind() {
	      System.out.println("������ "+kind+"�Դϴ�");
	   }
	   void SayFood() {
	      System.out.println(food+"�Դϴ�");
	   }
	   
	   void feed(String food, Persen choiGunhee) {
		   
		   if(!choiGunhee.name.equals("�ְ���")) {
			   System.out.println("�ȸԾ�");
		   } else {
			   if(kind.equals("����")) {
				   System.out.println("�߸Ծ���");
			   } else {
				   System.out.println("�ȸԾ�");
			   }
		   }
		   
		   
		  
	   }
	   
	   
	   public static void main(String []agrs) {
	      Bird sparrow=new Bird(8,"���","����");
	      sparrow.SaySize();
	      sparrow.SayKind();
	      sparrow.SayFood();
	      
	      Persen choiGunhee = new Persen("�ְ���", true);
	      
	      Bird eagle=new Bird(200,"����","������");
	      eagle.SayKind();
	      eagle.SaySize();
	      eagle.SayFood();
	      eagle.feed("���", choiGunhee);
	   }
	}