package com.dmaps.study.main;

import com.dmaps.study.frame.InputFrame;
import com.dmaps.study.frame.PrintFrame;
import com.dmaps.study.numberBaseball.NumberBaseballGame;

public class Main {
	public static void main(String[] args) {
		PrintFrame printFrame = new PrintFrame();
		InputFrame inputFrame = new InputFrame(printFrame);
	}
}