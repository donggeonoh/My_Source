package com.study.frame;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

import javax.swing.JFrame;

public class BackgroundFrame extends JFrame {

    private Panel panel;
	
	public BackgroundFrame() {

		panel = new Panel();

		this.setSize(300, 500);
		
		this.add(panel);
		
		this.setVisible(true);

	}



    public void setColor(Color color) {
		panel.setBackground(color);
	}

	public void setRandomColor() {
		Color[] color = {Color.BLACK, Color.CYAN, Color.DARK_GRAY, Color.GREEN, Color.PINK};
		
		int randColor = (int)(Math.random() * 5);
		
		panel.setBackground(color[randColor]);

	}
		
}