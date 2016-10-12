package com.dku.dmaps.listener;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class DragLine extends JFrame
	implements MouseListener {
	
	int x1, y1;
	int x2, y2;
	
	public DragLine() {
		
		this.setName("선 그리기");
		this.setSize(500, 500);
		
		this.addMouseListener(this);
		
		this.setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawLine(x1, y1, x2, y2);
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
		x1 = e.getX();
		y1 = e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		x2 = e.getX();
		y2 = e.getY();
		
		repaint();
	}
	
}
