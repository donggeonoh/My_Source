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
         System.out.println("�ٶ������ 3���� �ֽ��ϴ�.");
      else
         onOff = true;
         System.out.println("�ٶ����� : " + windPower);
   }
   
   void onOff(boolean onOff) {
      if(onOff == true)
         System.out.println("��ǳ�Ⱑ �۵����Դϴ�.");
      else
         System.out.println("��ǳ�Ⱑ �������ϴ�.");
   }
   
   void turn(boolean turning) {
      if(turning == true)
         System.out.println("��ǳ�Ⱑ ȸ�����Դϴ�.");
      else
         System.out.println("��ǳ�Ⱑ ȸ������ �ʽ��ϴ�.");
   }
   
   void timer(int timer) {
      System.out.println(timer + "�� �Ŀ� �����ϴ�.");
   }
   
   void hight(int hight) {
      System.out.println("���̰� " + hight + "cm�� ����Ǿ����ϴ�.");
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