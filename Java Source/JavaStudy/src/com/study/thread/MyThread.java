package com.study.thread;

//����� �̿��� ������ �������
//������ �����Ҷ��� start �����ҋ��� run

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
