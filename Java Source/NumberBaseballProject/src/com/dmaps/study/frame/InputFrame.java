package com.dmaps.study.frame;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import com.dmaps.study.listener.RepetitionRemovalListener;
import com.dmaps.study.listener.ResetButtonListener;
import com.dmaps.study.listener.StartButtonListener;
import com.dmaps.study.listener.SubmitButtonListener;

public class InputFrame extends JFrame {

	private Panel panel;
	
	private JButton buttons[];
	private JTextArea pickNumbers[];

	public static final int BUTTON_LENGTH = 10;
	public static final int PICKNUMBER_LENGTH = 3;
	
	public static final String[] buttonNumbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};

	private JButton submitButton;
	private JButton startButton;
	private JButton resetButton;

	PrintFrame printFrame;
	
	public InputFrame(PrintFrame printFrame) {
		
		this.printFrame = printFrame;
		
		this.setSize(200, 350);
		this.setResizable(false);
		this.setLayout(new BorderLayout());
		
		pickNumbers = new JTextArea[PICKNUMBER_LENGTH];
		Font font = new Font("arian", Font.ITALIC, 70);

		panel = new Panel();
		
		for(int i = 0; i < PICKNUMBER_LENGTH; i++) {
			pickNumbers[i] = new JTextArea(1, 1);
			pickNumbers[i].setEditable(false);
			pickNumbers[i].setFont(font);
			
			panel.add(pickNumbers[i]);
		}

		this.add(panel, BorderLayout.NORTH);

		panel = new Panel();
		panel.setLayout(new GridLayout(4, 1));

		buttons = new JButton[BUTTON_LENGTH];
		
		for (int i = 1; i < BUTTON_LENGTH; i++) {
			buttons[i - 1] = new JButton(buttonNumbers[i - 1]);
			buttons[i - 1].setEnabled(false);
			
			panel.add(buttons[i - 1]);
			
			if (i % 3 == 0)
				this.add(panel, BorderLayout.CENTER);
		} 
		
		startButton = new JButton("START");
		buttons[9] = new JButton(buttonNumbers[9]);
		resetButton = new JButton("RESET");
		
		buttons[9].setEnabled(false);
		resetButton.setEnabled(false);
		
		panel.add(startButton);
		panel.add(buttons[9]);
		panel.add(resetButton);
		
		this.add(panel, BorderLayout.CENTER);

		submitButton = new JButton("submit");
		submitButton.setEnabled(false);
		this.add(submitButton, BorderLayout.SOUTH);
		
		setActionListener();

		this.setVisible(true);
	}
	
	public void disableButton() {
		for (int i = 0; i < BUTTON_LENGTH; i++)
			buttons[i].setEnabled(false);
		
		resetButton.setEnabled(false);
		submitButton.setEnabled(false);
	}
	
	public void Reset() {
		for(int i = 0; i < BUTTON_LENGTH; i++) {
			buttons[i].setEnabled(true);
		}
		
		submitButton.setEnabled(true);
		resetButton.setEnabled(true);
		
		for(int i = 0; i < PICKNUMBER_LENGTH; i++) {
			pickNumbers[i].setText("");
		}
	}

	private void setActionListener() {
		for (int i = 0; i < BUTTON_LENGTH; i++)
			buttons[i].addActionListener(new RepetitionRemovalListener(buttons, pickNumbers));
		
		startButton.addActionListener(new StartButtonListener(buttons, resetButton, submitButton));
		resetButton.addActionListener(new ResetButtonListener(this));
		submitButton.addActionListener(new SubmitButtonListener(this, printFrame, pickNumbers));
	}

}
