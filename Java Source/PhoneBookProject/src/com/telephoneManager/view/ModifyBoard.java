package com.telephoneManager.view;

import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JTextField;

import com.telephoneManager.VO.Data;
import com.telephoneManager.controller.Controller;

public class ModifyBoard extends Board
	implements KeyListener{
	
	Controller controller;
	
	private Label label;

	private JTextField text;

	public ModifyBoard(Controller controller) {
		
		this.controller = controller;
		
		this.setSize(300, 100);
		this.setLayout(new FlowLayout());
		
		Panel panel = new Panel();
		label = new Label("이름을 입력하세요");
		text = new JTextField(10);
		text.addKeyListener(this);
		panel.add(label);
		panel.add(text);
		
		this.add(panel);
		
		this.setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyChar() == 10) {
			System.out.println("엔터누름");
			String str = text.getText();
			controller.searchData(str);
			ArrayList<Data> data = controller.getResultList();
			data.toString();
		}
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
