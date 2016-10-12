package com.dmaps.study.button;

import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.dmaps.study.frame.ButtonFrame;
import com.dmaps.study.frame.DrewFrame;

public class BackgroundButton implements ActionListener {

	DrewFrame drawingFrame;

	private Button redButton;
	private Button greenButton;
	private Button blueButton;
	private Button randomButton;
	private Button customButton;

	private TextField redTextField;
	private TextField greenTextField;
	private TextField blueTextField;

	public BackgroundButton(ButtonFrame buttonFrame, DrewFrame drawingFrame) {

		this.drawingFrame = drawingFrame;

		Panel panel = new Panel();

		redButton = new Button("»¡°­");
		greenButton = new Button("ÃÊ·Ï");
		blueButton = new Button("ÆÄ¶û");
		randomButton = new Button("·£´ý »ö»ó");

		redButton.addActionListener(this);
		greenButton.addActionListener(this);
		blueButton.addActionListener(this);
		randomButton.addActionListener(this);

		panel.add(redButton);
		panel.add(greenButton);
		panel.add(blueButton);
		panel.add(randomButton);

		buttonFrame.add(panel);

		panel = new Panel();

		customButton = new Button("È®ÀÎ");
		customButton.addActionListener(this);

		redTextField = new TextField(1);
		greenTextField = new TextField(1);
		blueTextField = new TextField(1);

		redTextField.setText("0");
		greenTextField.setText("0");
		blueTextField.setText("0");
		
		panel.add(new Label("RGB"));
		panel.add(new Label("»¡°­"));
		panel.add(redTextField);
		panel.add(new Label("ÃÊ·Ï"));
		panel.add(greenTextField);
		panel.add(new Label("ÆÄ¶û"));
		panel.add(blueTextField);
		panel.add(customButton);

		buttonFrame.add(panel);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(redButton)) {
			drawingFrame.PaintBackground(Color.RED);

		} else if (e.getSource().equals(greenButton)) {
			drawingFrame.PaintBackground(Color.GREEN);

		} else if (e.getSource().equals(blueButton)) {
			drawingFrame.PaintBackground(Color.BLUE);

		} else if (e.getSource().equals(randomButton)) {
			drawingFrame.PaintBackground((int) (Math.random() * 256),
										(int) (Math.random() * 256),
										(int) (Math.random() * 256));

		} else if (e.getSource().equals(customButton)) {
			
			int red = Integer.parseInt(redTextField.getText()); if (red > 255) return;
			int green = Integer.parseInt(greenTextField.getText()); if (green > 255) return;
			int blue = Integer.parseInt(blueTextField.getText()); if (blue > 255) return;
			
			drawingFrame.PaintBackground(red, green, blue);

		}
	}

}
