package com.study.gui2;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowEvent;

public class Calculator extends Frame
	implements SetWindowListener{

	Frame frame;
	BorderLayout layout;
	Panel panel;
	
	public Calculator() {
		frame = new Frame();
		layout = new BorderLayout();
		panel = new Panel();
		
		frame.setVisible(true);
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	
	
}
