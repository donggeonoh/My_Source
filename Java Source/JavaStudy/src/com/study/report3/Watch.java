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
		System.out.println("이 시계는 " + watchType + " 타입 입니다.");
	}
	
	public void indicatePresentTime() {
		System.out.println("현재 시간은 " + presentTime.toString() + "입니다.");
	}
	
	public int setTimer(int _seconds) {
		if(existTimer == false)
			System.out.println("이 시계는 타이머를 지원하지 않습니다.");
		
		else if(_seconds <= 0)
			System.out.println("타이머를 다시 설정해주세요");
		
		else {
			System.out.println(_seconds + "초 만큼 타이머를 설정합니다.");
			return seconds = _seconds;
		}
		
		return -1;
	}
	
	public void startTimer() {
		if(existTimer == false)
			System.out.println("이 시계는 타이머를 지원하지 않습니다.");
		
		else {
			System.out.println("타이머를 시작합니다.");
			
			//구현하는데 있어 Sleep 함수나 timer, tiemrtask등 모두 쓰레드여서 구현하지 않았습니다.
			for(int i = 0; i < seconds; i++)
				System.out.print("똑딱 똑딱.. ");
			
			System.out.println();
			System.out.println("타이머를 종료합니다.");
		}
	}

	public static void main(String[] args) {
		Watch w1 = new Watch("메탈", true);
		Watch w2 = new Watch("가죽", false);
		
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
