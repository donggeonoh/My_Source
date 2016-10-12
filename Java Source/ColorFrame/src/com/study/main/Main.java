package com.study.main;

import com.study.frame.BackgroundFrame;
import com.study.frame.InputButtonFrame;

public class Main {
	public static void main(String[] args) {
		
		BackgroundFrame backgroundFrame = new BackgroundFrame();
		new InputButtonFrame(backgroundFrame);
		
	}
}
