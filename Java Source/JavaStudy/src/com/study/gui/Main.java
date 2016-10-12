package com.study.gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Main");
		
		frame.setSize(500, 500);
		Button button = new Button("Hi");
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("test");
				button.setBackground(Color.black);
				
			}
		});
		frame.add(button);
		
		
		frame.show();
	}

}
