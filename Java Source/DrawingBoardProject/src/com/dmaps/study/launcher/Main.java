package com.dmaps.study.launcher;

import com.dmaps.study.frame.ButtonFrame;
import com.dmaps.study.frame.DrewFrame;

public class Main {
	public static void main(String[] args) {
		
		DrewFrame drawingFrame = new DrewFrame();
		new ButtonFrame(drawingFrame);
	}
}