package com.study.practice;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Watch {
	String watchType;
	int hour, minute, second;
	Date time;
	Timer w_timer;
	TimerTask w_timerTask;
	
	public Watch(String _watchType) {
		watchType = _watchType;
		hour = 0;
		minute = 0;
		second = 0;
		time = new Date();
	}
	
	void typeOfWatch() {
		System.out.println("�� �ð�� " + watchType + "�Դϴ�.");
	}
	
	@SuppressWarnings("deprecation")
	void time() {
		hour = time.getHours();
		minute = time.getMinutes();
		second = time.getSeconds();
		
		System.out.println("���� �ð��� " + hour + "�� " + minute + "�� " + second + "�� �Դϴ�.");
	}
	
	void timer(int seconds) {
		System.out.println("����");
		
		w_timer = new Timer();
		w_timerTask = new TimerTask() {
			@Override
			public void run() {
				System.out.println("��");
			}
		};
		
		w_timer.schedule(w_timerTask, seconds * 1000);
	}
	
	public static void main(String[] args) {
		Watch w = new Watch("��Ż");

		w.typeOfWatch();
		w.time();
		//5�� �� Ÿ�̸� ��
		w.timer(5);
	}
}
