package com.dmaps.study.launcher;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;

import com.dmaps.study.Frame.ButtonFrame;
import com.dmaps.study.Frame.ColorFrame;

public class ColorChangeProgram {
	
	private ColorFrame colorFrame;
	private ButtonFrame buttonFrame;

	public ColorChangeProgram() {
		colorFrame = new ColorFrame();
		buttonFrame = new ButtonFrame(colorFrame);
	}
}
