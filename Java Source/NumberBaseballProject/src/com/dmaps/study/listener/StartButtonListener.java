package com.dmaps.study.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.dmaps.study.frame.InputFrame;

public class StartButtonListener
	implements ActionListener {

	JButton numberButtons[];
	JButton resetButton;
	JButton submitbutton;
	
	public StartButtonListener(JButton[] numberButtons, JButton resetButton, JButton submitbutton) {
		this.numberButtons = numberButtons;
		this.resetButton = resetButton;
		this.submitbutton = submitbutton;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i = 0; i < InputFrame.BUTTON_LENGTH; i++) {
			numberButtons[i].setEnabled(true);
		}
		
		resetButton.setEnabled(true);
		submitbutton.setEnabled(true);
	}

}
