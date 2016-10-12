package com.study.frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.dmaps.study.Frame.ColorFrame;
import com.dmaps.study.button.ColorButton;
import com.study.listener.ColorListener;

public class InputButtonFrame extends Frame {
	
	private Button [] buttons = new Button[3];
	private String [] btnNames = {ColorButton.RED, "BLUE", "RANDOM"};
	
	private BackgroundFrame backgroundFrame;
	
	public InputButtonFrame(BackgroundFrame backgroundFrame) {
		this.setSize(500, 500);
		this.setLayout(new GridLayout(3, 1));
		this.backgroundFrame = backgroundFrame;
		
		for(int i=0; i<3; i++) {
			buttons[i] = new ColorButton(btnNames[i], colorFrame);
			
			this.add(buttons[i]);
		}
		
		this.setVisible(true);
	}
	
}
