package com.dku.dmap.study;

public class Fen {
   
   boolean onOff;
   boolean turning;
   int windPower;
   int hight;
   int timer;
   
   Fen(int _hight, boolean _onOff) {
      hight = _hight;
      onOff = _onOff;
   }
   
   void run(int windPower) {
      if(windPower < 3)
         System.out.println("바람세기는 3까지 있습니다.");
      else
         onOff = true;
         System.out.println("바람세기 : " + windPower);
   }
   
   void onOff(boolean onOff) {
      if(onOff == true)
         System.out.println("선풍기가 작동중입니다.");
      else
         System.out.println("선풍기가 꺼졌습니다.");
   }
   
   void turn(boolean turning) {
      if(turning == true)
         System.out.println("선풍기가 회전중입니다.");
      else
         System.out.println("선풍기가 회전하지 않습니다.");
   }
   
   void timer(int timer) {
      System.out.println(timer + "분 후에 꺼집니다.");
   }
   
   void hight(int hight) {
      System.out.println("높이가 " + hight + "cm로 변경되었습니다.");
   }
   
   
   
   public static void main(String [] args) {
      Fen fen1 = new Fen(80, false);
      fen1.run(3);
      fen1.turn(true);
      fen1.hight(130);
      fen1.run(1);
      fen1.turn(false);
      fen1.onOff(false);
   }
}