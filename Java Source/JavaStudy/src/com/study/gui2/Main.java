package com.study.gui2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		BorderLayout layout = new BorderLayout();
		Panel panel = new Panel();
		TextField textField = new TextField();
		
		frame.setSize(500, 500);
		frame.setLayout(layout);
		
		panel.setLayout(new GridLayout(5, 4));
		
		for(int i = 0; i < 20; i++) {
			Button button = new Button("" + i);
			button.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Button button = (Button) e.getSource();
					textField.setText(textField.getText() + button.getLabel());
				}
			});
			
			panel.add(button);
		}
		
		frame.add(panel, BorderLayout.CENTER);
		frame.add(textField, BorderLayout.NORTH);
		
		frame.setVisible(true);
	}

}
