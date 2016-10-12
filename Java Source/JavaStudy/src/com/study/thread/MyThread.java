package com.study.thread;

//상속을 이용한 쓰레드 구현방법
//쓰레드 시작할때는 start 구현할떄는 run

public class MyThread extends Thread{
	private int time;
	
	public MyThread(int time) {
		this.time = time;
	}
	
	@Override
	public void run() {

		for(int i = 0; i < 10; i++) {
			System.out.println(i + 1 + "");
		
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		super.run();
	}
	
}
