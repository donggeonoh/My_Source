package com.dmaps.study.button;

import java.awt.Button;
import java.awt.Panel;

import com.dmaps.study.Frame.ColorFrame;
import com.dmaps.study.listener.ColorListener;

public class ColorButton extends Button {

	public static final String RED = "RED";
	public static final String BLUE = "BLUE";
	public static final String RANDOM = "RANDOM";
	
	private ColorFrame colorFrame;
	
	public ColorButton(String colorString, ColorFrame colorFrame) {
		
		this.colorFrame = colorFrame;
		
		switch (colorString) {
		
		case RED:
			this.addActionListener(new ColorListener(RED, colorFrame));
			break;
		case BLUE:
			this.addActionListener(new ColorListener(BLUE, colorFrame));
			break;
		case RANDOM:
			this.addActionListener(new ColorListener(RANDOM, colorFrame));
			break;

		default:
			break;
		}
	}
	
	
}
