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
		System.out.println("이 시계는 " + watchType + "입니다.");
	}
	
	@SuppressWarnings("deprecation")
	void time() {
		hour = time.getHours();
		minute = time.getMinutes();
		second = time.getSeconds();
		
		System.out.println("현재 시간은 " + hour + "시 " + minute + "분 " + second + "초 입니다.");
	}
	
	void timer(int seconds) {
		System.out.println("시작");
		
		w_timer = new Timer();
		w_timerTask = new TimerTask() {
			@Override
			public void run() {
				System.out.println("끝");
			}
		};
		
		w_timer.schedule(w_timerTask, seconds * 1000);
	}
	
	public static void main(String[] args) {
		Watch w = new Watch("메탈");

		w.typeOfWatch();
		w.time();
		//5초 후 타이머 끝
		w.timer(5);
	}
}
