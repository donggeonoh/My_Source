package com.dku.dmap.study.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtonEvent 
	implements ActionListener {

	private CustomButton button;
	
	public MyButtonEvent(CustomButton button) {
		this.button = button;
	}
	 
	@Override
	public void actionPerformed(ActionEvent e) {
		button.changeColor();
		
	}

}
