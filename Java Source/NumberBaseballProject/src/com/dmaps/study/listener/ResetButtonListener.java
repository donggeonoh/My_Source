package com.dmaps.study.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.dmaps.study.frame.InputFrame;

public class ResetButtonListener
	implements ActionListener {

	InputFrame inputFrame;
	
	public ResetButtonListener(InputFrame inputFrame) {
		this.inputFrame = inputFrame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		inputFrame.Reset();
	}

}
