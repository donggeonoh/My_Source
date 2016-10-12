package com.dmaps.study.listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import com.dmaps.study.view.InformFrame;
import com.dmaps.study.view.PhotoFrame;

public class MouseManagementListener implements MouseListener, MouseMotionListener {

	final int RED = 0xffed1c24;
	final int BLUE = 0xff00a2e8;
	final int WHITE = 0xffffffff;
	final int BLACK = 0xff000000;

	private int startRGB;
	private int width, height;

	private BufferedImage img;
	private PhotoFrame photoFrame;

	public MouseManagementListener(PhotoFrame photoFrame, BufferedImage img) {
		
		this.photoFrame = photoFrame;
		this.img = img;
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {

		width = e.getX() - 15;
		height = e.getY() - 5;

		if (img.getRGB(width, height) == BLACK) {

			photoFrame.setEnabled(false);
			new InformFrame(photoFrame);

		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {

		width = e.getX() - 17;
		height = e.getY() - 6;

		if (img.getRGB(width, height) == RED) {
			startRGB = RED;
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {

		width = e.getX() - 17;
		height = e.getY() - 6;

		if (img.getRGB(width, height) == BLUE && startRGB == RED) {
			photoFrame.createFrame();

		} else {
			photoFrame.setEnabled(false);
			new InformFrame(photoFrame);
		}
	}
}
