package com.dmaps.study.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

import com.dmaps.study.frame.InputFrame;
import com.dmaps.study.frame.PrintFrame;

public class SubmitButtonListener
	implements ActionListener {
	
	InputFrame inputFrame;
	JTextArea[] pickNumbers;
	
	PrintFrame printFrame;
	
	public SubmitButtonListener(InputFrame inputFrame, PrintFrame printFrame, JTextArea[] pickNumbers) {
		this.inputFrame = inputFrame;
		this.printFrame = printFrame;
		this.pickNumbers = pickNumbers;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int[] numbers = new int[InputFrame.PICKNUMBER_LENGTH];
		
		for(int i = 0; i < InputFrame.PICKNUMBER_LENGTH; i++) {
			if(pickNumbers[i].equals(""))
				return;
			
			else
				numbers[i] = Integer.parseInt(pickNumbers[i].getText());
		}
		
		printFrame.printNumbers(numbers);
		inputFrame.Reset();
	}

}