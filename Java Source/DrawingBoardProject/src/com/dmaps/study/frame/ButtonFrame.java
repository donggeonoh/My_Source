package com.dmaps.study.frame;

import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.dmaps.study.button.BackgroundButton;
import com.dmaps.study.button.DrawingButton;

public class ButtonFrame extends JFrame {
	
	DrewFrame drawingFrame;
	
	public ButtonFrame(DrewFrame drawingFrame) {
		
		this.drawingFrame = drawingFrame;
		
		Panel panel;
		JLabel label;
		
		this.setSize(420, 500);
		this.setLocation(50, 50);
		this.setLayout(new GridLayout(12, 1));
		
		panel = new Panel();
		label = new JLabel("배경");
		
		panel.add(label);
		this.add(panel);
		
		BackgroundButton backgroundButton = new BackgroundButton(this, drawingFrame);
		
		this.add(new Panel());
		this.add(new Panel());
		this.add(new Panel());
		
		panel = new Panel();
		label = new JLabel("색상");
		
		panel.add(label);
		this.add(panel);
		
		DrawingButton drawingButton = new DrawingButton(this, drawingFrame);
		
		this.setVisible(true);
	}
	
}
