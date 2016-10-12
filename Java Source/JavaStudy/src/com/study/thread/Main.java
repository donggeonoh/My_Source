package com.study.thread;

public class Main {
	
	public static void main(String []args) {
		MyThread myThread = new MyThread(1000);
		
		myThread.start();
	}
		
}

