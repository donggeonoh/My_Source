package com.dmaps.study.listener;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import com.dmaps.study.Frame.ColorFrame;
import com.dmaps.study.button.ColorButton;

public class ColorListener
	implements ActionListener {
	
	private String colorNumber;
	private ColorFrame colorframe;
	
	public ColorListener(String colorNumber, ColorFrame colorframe) {
		this.colorNumber = colorNumber;
		this.colorframe = colorframe;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch (colorNumber) {
		case ColorButton.RED:
			colorframe.changeColor(ColorButton.RED);
			break;
		case ColorButton.BLUE:
			colorframe.changeColor(ColorButton.BLUE);
			break;
		case ColorButton.RANDOM:
			colorframe.changeColor();
			break;
			
		default:
			break;
		}
	}

}
