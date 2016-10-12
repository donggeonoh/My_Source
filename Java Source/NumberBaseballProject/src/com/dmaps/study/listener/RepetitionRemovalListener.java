package com.dmaps.study.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;

import com.dmaps.study.frame.InputFrame;

public class RepetitionRemovalListener implements ActionListener {

	JButton buttons[];
	JTextArea printNumbers[];
	
	public RepetitionRemovalListener(JButton[] buttons, JTextArea[] printNumbers) {
		this.buttons = buttons;
		this.printNumbers = printNumbers;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < InputFrame.BUTTON_LENGTH; i++) {
			if(e.getSource().equals(buttons[i])) {
				
				for(int j = 0; j < InputFrame.PICKNUMBER_LENGTH; j++) {
					if(printNumbers[j].getText().isEmpty()) {
								printNumbers[j].setText((buttons[i].getText()));
								buttons[i].setEnabled(false);
								break;
					}
				}
				
			}
		}
		
	}

}
