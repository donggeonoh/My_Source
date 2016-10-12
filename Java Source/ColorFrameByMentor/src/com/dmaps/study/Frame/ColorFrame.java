package com.dmaps.study.Frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;
import java.util.Random;

import javax.swing.JFrame;

import com.dmaps.study.button.ColorButton;

public class ColorFrame extends JFrame {

	private Button colorbutton;

	public ColorFrame() {
		colorbutton = new Button();
		
		this.setLayout(new GridLayout(2, 1));
		this.add(colorbutton);
		this.add(new Button());
		this.setSize(500, 500);
		this.setLocation(500, 0);
		
		this.setVisible(true);
	}

	public void changeColor(String colorName) {
		switch (colorName) {
		case ColorButton.RED:
			colorbutton.setBackground(Color.RED);
			break;
		case ColorButton.BLUE:
			colorbutton.setBackground(Color.BLUE);
			break;

		default:
			break;
		}
	}

	public void changeColor() {
		Random random = new Random();
		
		colorbutton.setBackground(new Color(random.nextInt(256)
											, random.nextInt(256)
											, random.nextInt(256)));
		
	}
}
