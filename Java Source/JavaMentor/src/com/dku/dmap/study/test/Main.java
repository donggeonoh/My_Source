package com.dku.dmap.study.test;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Main {
	public static void main(String [] args) {
		JFrame frame = new JFrame("Main");
		frame.setSize(500, 500);
		
		CustomButton button = new CustomButton("Hi");
		
		button.addActionListener(new MyButtonEvent(button));
		frame.add(button);
		
		frame.show();
		
	}
}
