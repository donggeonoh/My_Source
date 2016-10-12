package com.dmaps.study.frame;

import java.awt.BorderLayout;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.dmaps.study.numberBaseball.NumberBaseballGame;

public class PrintFrame extends JFrame {

	NumberBaseballGame baseballGame;
	
	private Panel panel;
	private JTextArea displayArea;
	private JScrollPane scrollPane;
	
	private int outputNumbers[];
	
	public PrintFrame() {
		
		this.setSize(200, 350);
		this.setResizable(false);
		this.setLayout(new BorderLayout());
		this.setLocation(200, 0);
		
		panel = new Panel();
		displayArea = new JTextArea(17, 16);
		scrollPane = new JScrollPane(displayArea);
		
		displayArea.setLineWrap(true);
		displayArea.setEditable(false);
		
		baseballGame = new NumberBaseballGame(this);
		
		panel.add(scrollPane);
		
		this.add(panel, BorderLayout.CENTER);
		
		this.setVisible(true);
	}
	
	public void printNumbers(int[] _setOutputNumbers) {
		outputNumbers = _setOutputNumbers;
		baseballGame.getNumbers(outputNumbers);
		
	}
	
	public void setDisplayArea(String str) {
		displayArea.append(str + "\n");  // �α� ������ JTextArea ���� �ٿ��ְ�
		displayArea.setCaretPosition(displayArea.getDocument().getLength());  // �ǾƷ��� ��ũ���Ѵ�.
	}
	
}
