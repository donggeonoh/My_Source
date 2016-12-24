package dmaps.study.main;

import java.awt.Button;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		String buttonText[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "START", "0", "RESET", "SUBMIT"};
		
		JFrame inputFrame = new JFrame("야구게임");
		JFrame outputFrame = new JFrame("출력");
		
		Panel textPanel = new Panel();
		Panel buttonPanel = new Panel();
		
		TextField []textField = new TextField[3];
		TextArea outputText = new TextArea();
		Button []numberButton = new Button[13];
		
		for(int i = 0; i < 3; i++) {
			textField[i] = new TextField();
			textField[i].setFont(new Font(Font.DIALOG, Font.BOLD, 100));
			textPanel.add(textField[i]);
		}
		
		for(int i = 0; i < 13; i++) {
			numberButton[i] = new Button(buttonText[i]);
			numberButton[i].addActionListener(new SetButtonListener(numberButton, textField, outputText));
			
			buttonPanel.add(numberButton[i]);
		}
		
		textPanel.setLayout(new GridLayout(1, 3));
		buttonPanel.setLayout(new GridLayout(4, 3));
		
		inputFrame.setSize(300, 400);
		inputFrame.setLayout(new GridLayout(3, 1));
		
		inputFrame.add(textPanel);
		inputFrame.add(buttonPanel);
		inputFrame.add(numberButton[12]);
		
		outputFrame.setSize(300, 400);
		outputFrame.add(outputText);
		
		inputFrame.setVisible(true);
		outputFrame.setVisible(true);
	}

}
