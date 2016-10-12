package com.study.listener;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.study.frame.BackgroundFrame;
import com.study.frame.InputColorButton;

public class ColorListener 
	implements ActionListener {
	
	String colorButton;
	Button button;
	
	private BackgroundFrame backgroundFrame;
	
	public ColorListener(String colorButton, BackgroundFrame backgroundFrame) {
		this.colorButton = colorButton;
		this.backgroundFrame = backgroundFrame;
		
			this.button = button;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(button)) {
			backgroundFrame.setColor();

		}
		
	}

}
