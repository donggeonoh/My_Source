package com.dmaps.study.frame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrewFrame extends JFrame 
	implements MouseListener, MouseMotionListener {

	JPanel panel;
	String figure;
	Color color;
	
	private int currentX;
	private int currentY;
	private int startPointX;
	private int startPointY;
	private int endPointX;
	private int endPointY;
	private Graphics g;

	public DrewFrame() {
		
		g = this.getGraphics();
		
		this.setName("그림판");
		this.setSize(500, 700);
		this.setLocation(400, 50);
		
		panel = new JPanel();
		panel.addMouseListener(this);
		panel.addMouseMotionListener(this);
		this.add(panel);
		
		this.setVisible(true);

	}

	public void PaintBackground(Color color) {
		panel.setBackground(color);
	}

	public void PaintBackground(int red, int green, int blue) {
		panel.setBackground(new Color(red, green, blue));
	}
	
	@Override
	public void paint(Graphics g) {
		switch(figure) {
		case "line":
			g.drawLine(startPointX, startPointY, endPointX, endPointY);
			break;
		}
		
	}
	
	public void Drawing() {
		g.drawLine(currentX, currentY, currentX, currentY);
		repaint();
	}
	
	public void DrawLine() {
		g.drawLine(startPointX, startPointY, endPointX, endPointY);
	}
	
	public void DrawOval() {
		g.setColor(color);
		g.drawOval(startPointX, startPointY, endPointX, endPointY);
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("프레스");
		startPointX = e.getX();
		startPointY = e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("릴리즈");
		endPointX = e.getX();
		endPointY = e.getY();
		
		repaint();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("드래그");
		currentX = e.getX();
		currentY = e.getY();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("클릭");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {

	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
	}
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void setFigure(String figure) {
		this.figure = figure; 
	}
	
}
