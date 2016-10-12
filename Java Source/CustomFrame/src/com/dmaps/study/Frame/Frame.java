package com.dmaps.study.Frame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Frame extends JFrame 
	implements ActionListener, MouseListener {

	private Button lineButton;
	private Button circleButton;
	private Button squareButton;
	private Panel panel;
	private Button backGroundButton;

	public Frame() {
		
		this.setSize(500, 700);
		this.setLocation(200, 100);
		this.setLayout(new BorderLayout());

		panel = new Panel();
		this.add(panel, BorderLayout.CENTER);
		
		lineButton = new Button("선");
		circleButton = new Button("원");
		squareButton = new Button("사각형");
		panel = new Panel();
		
		lineButton.addActionListener(this);
		circleButton.addActionListener(this);
		squareButton.addActionListener(this);
		
		lineButton.addMouseListener(this);
		circleButton.addMouseListener(this);
		squareButton.addMouseListener(this);

		panel.add(lineButton);
		panel.add(circleButton);
		panel.add(squareButton);
		
		this.add(panel, BorderLayout.NORTH);
		
		backGroundButton = new Button("배경 색깔");
		panel = new Panel();
		panel.setLayout(new FlowLayout());
		
		backGroundButton.addActionListener(this);
		
		backGroundButton.addMouseListener(this);
		
		panel.add(backGroundButton);
		
		this.add(panel, BorderLayout.SOUTH);
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(lineButton)) {
			new DrawFigure("line");
			
		} else if(e.getSource().equals(circleButton)) {
			new DrawFigure("circle");
			
		} else if(e.getSource().equals(squareButton)) {
			new DrawFigure("square");
			
		} else if(e.getSource().equals(backGroundButton)) {
			new DrawFigure("background");
			
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
