package com.study.thread;

public class Threadd
	implements Runnable {
	
	@Override
	public void run() {

		for(int i = 0; i < 10; i++) {
			System.out.println(i + 1 + "");
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		run();
		
	}
		
}
	
