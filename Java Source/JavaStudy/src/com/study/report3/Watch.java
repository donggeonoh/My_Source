package com.study.report3;
import java.util.Date;

public class Watch {
	String watchType;
	boolean existTimer;
	int seconds;
	Date presentTime;
	
	public Watch(String _watchType, boolean _existTimer) {
		watchType = _watchType;
		existTimer = _existTimer;
		presentTime = new Date();
	}
	
	public void showTypeOfWatch() {
		System.out.println("�� �ð�� " + watchType + " Ÿ�� �Դϴ�.");
	}
	
	public void indicatePresentTime() {
		System.out.println("���� �ð��� " + presentTime.toString() + "�Դϴ�.");
	}
	
	public int setTimer(int _seconds) {
		if(existTimer == false)
			System.out.println("�� �ð�� Ÿ�̸Ӹ� �������� �ʽ��ϴ�.");
		
		else if(_seconds <= 0)
			System.out.println("Ÿ�̸Ӹ� �ٽ� �������ּ���");
		
		else {
			System.out.println(_seconds + "�� ��ŭ Ÿ�̸Ӹ� �����մϴ�.");
			return seconds = _seconds;
		}
		
		return -1;
	}
	
	public void startTimer() {
		if(existTimer == false)
			System.out.println("�� �ð�� Ÿ�̸Ӹ� �������� �ʽ��ϴ�.");
		
		else {
			System.out.println("Ÿ�̸Ӹ� �����մϴ�.");
			
			//�����ϴµ� �־� Sleep �Լ��� timer, tiemrtask�� ��� �����忩�� �������� �ʾҽ��ϴ�.
			for(int i = 0; i < seconds; i++)
				System.out.print("�ȵ� �ȵ�.. ");
			
			System.out.println();
			System.out.println("Ÿ�̸Ӹ� �����մϴ�.");
		}
	}

	public static void main(String[] args) {
		Watch w1 = new Watch("��Ż", true);
		Watch w2 = new Watch("����", false);
		
		w1.showTypeOfWatch();
		w1.indicatePresentTime();
		w1.setTimer(-1);
		w1.setTimer(5);
		w1.startTimer();
		
		w2.showTypeOfWatch();
		w2.indicatePresentTime();
		w2.setTimer(5);
	}
}
