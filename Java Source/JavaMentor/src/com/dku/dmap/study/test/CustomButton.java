package com.dku.dmap.study.test;

import java.awt.Button;
import java.awt.Color;

public class CustomButton extends Button
	implements ActionInterface {
	
	public CustomButton(String name) {
		super(name);
	}
	
	private void changeGreen() {
		this.setBackground(Color.GREEN);
	}

	private void changeBlue() {
		this.setBackground(Color.BLUE);
		
	}
	
	public void changeColor() {
		if(this.getBackground() == Color.GREEN){
			this.changeBlue();
		}
		else {
			this.changeGreen();
		}
	}
}
