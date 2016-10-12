package com.study.frame;

import java.awt.Button;

import com.dmaps.study.Frame.ColorFrame;
import com.study.listener.ColorListener;

public class InputColorButton extends Button {
	
	public static final String RED = "RED";
	public static final String BLUE = "BLUE";
	public static final String RANDOM = "RANDOM";
	
	private InputButtonFrame inputButtonFrame;
	
	public InputColorButton(String colorString, InputButtonFrame inputColorFrame) {
		
		this.inputColorFrame = inputColorFrame;
		
		switch (colorString) {
		
		case RED:
			this.addActionListener(new ColorListener(RED, backgroundFrame));
			break;
		case BLUE:
			this.addActionListener(new ColorListener(BLUE, backgroundFrame));
			break;
		case RANDOM:
			this.addActionListener(new ColorListener(RANDOM, backgroundFrame));
			break;

		default:
			break;
		}
	}
	
}
