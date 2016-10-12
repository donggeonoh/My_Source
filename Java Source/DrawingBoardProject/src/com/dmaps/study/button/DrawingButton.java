package com.dmaps.study.button;

import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import com.dmaps.study.frame.ButtonFrame;
import com.dmaps.study.frame.DrewFrame;

public class DrawingButton
	implements ActionListener {
	
	DrewFrame drawingFrame;

	private Button blackButton;
	private Button redButton;
	private Button greenButton;
	private Button blueButton;
	private Button randomButton;
	private Button customButton;

	private TextField redTextField;
	private TextField greenTextField;
	private TextField blueTextField;

	private JRadioButton brushButton;
	private JRadioButton lineButton;
	private JRadioButton circleButton;
	private JRadioButton squareButton;
	
	public DrawingButton(ButtonFrame buttonFrame, DrewFrame drawingFrame) {
		
		this.drawingFrame = drawingFrame;
		
		JPanel panel = new JPanel();

		blackButton = new Button("°ËÁ¤");
		redButton = new Button("»¡°­");
		greenButton = new Button("ÃÊ·Ï");
		blueButton = new Button("ÆÄ¶û");
		randomButton = new Button("·£´ý »ö»ó");
		
		blackButton.addActionListener(this);
		redButton.addActionListener(this);
		greenButton.addActionListener(this);
		blueButton.addActionListener(this);
		randomButton.addActionListener(this);

		panel.add(blackButton);
		panel.add(redButton);
		panel.add(greenButton);
		panel.add(blueButton);
		panel.add(randomButton);
		
		buttonFrame.add(panel);

		panel = new JPanel();

		redTextField = new TextField(2);
		greenTextField = new TextField(2);
		blueTextField = new TextField(2);
		
		customButton = new Button("È®ÀÎ");
		customButton.addActionListener(this);

		panel.add(new Label("RGB"));
		panel.add(new Label("»¡°­"));
		panel.add(redTextField);
		panel.add(new Label("ÃÊ·Ï"));
		panel.add(greenTextField);
		panel.add(new Label("ÆÄ¶û"));
		panel.add(blueTextField);
		panel.add(customButton);

		buttonFrame.add(panel);
		
		panel = new JPanel();
		
		brushButton = new JRadioButton("º×");
		lineButton = new JRadioButton("¼±");
		circleButton = new JRadioButton("¿ø");
		squareButton = new JRadioButton("»ç°¢Çü");
		
		ButtonGroup figureButtonGroup = new ButtonGroup();
		
		figureButtonGroup.add(brushButton);
		figureButtonGroup.add(lineButton);
		figureButtonGroup.add(circleButton);
		figureButtonGroup.add(squareButton);
		
		panel.add(brushButton);
		panel.add(lineButton);
		panel.add(circleButton);
		panel.add(squareButton);
		
		buttonFrame.add(panel);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(blackButton)) {
			drawingFrame.setColor(Color.BLACK);
		} else if(e.getSource().equals(redButton)) {
			drawingFrame.setColor(Color.RED);
		} else if(e.getSource().equals(greenButton)) {
			drawingFrame.setColor(Color.GREEN);
		} else if(e.getSource().equals(blueButton)) {
			drawingFrame.setColor(Color.BLUE);
		} else if(e.getSource().equals(randomButton)) {
			drawingFrame.setColor(new Color((int) (Math.random() * 256),
											(int) (Math.random() * 256),
											(int) (Math.random() * 256)));
		} else if(e.getSource().equals(customButton)) {
			
			int red = Integer.parseInt(redTextField.getText()); if (red > 255) return;
			int green = Integer.parseInt(greenTextField.getText()); if (green > 255) return;
			int blue = Integer.parseInt(blueTextField.getText()); if (blue > 255) return;
		
			drawingFrame.setColor(new Color(red, green, blue));
		}
		
		if(e.getSource().equals(brushButton)) {
			drawingFrame.setFigure("brush");
		} else if(e.getSource().equals(lineButton)) {
			drawingFrame.setFigure("line");
		} else if(e.getSource().equals(circleButton)) {
			drawingFrame.setFigure("circle");
		} else if(e.getSource().equals(squareButton)) {
			drawingFrame.setFigure("square");
		}
	}
	
}
