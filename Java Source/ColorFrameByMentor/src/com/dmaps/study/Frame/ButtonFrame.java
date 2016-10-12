package com.dmaps.study.Frame;

import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.JFrame;

import com.dmaps.study.button.ColorButton;

public class ButtonFrame extends JFrame{
	
	private Button [] buttons = new Button[3];
	private String [] btnNames = {ColorButton.RED, "BLUE", "RANDOM"};
	
	private ColorFrame colorFrame;
	
	public ButtonFrame(ColorFrame colorFrame) {
		this.setSize(500, 500);
		this.setLayout(new GridLayout(3, 1));
		this.colorFrame = colorFrame;
		
		for(int i=0; i<3; i++) {
			buttons[i] = new ColorButton(btnNames[i], colorFrame);
			
			this.add(buttons[i]);
		}
		
		this.setVisible(true);
	}
}
