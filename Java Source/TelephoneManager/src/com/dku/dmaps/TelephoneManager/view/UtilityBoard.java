package com.dku.dmaps.TelephoneManager.view;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class UtilityBoard extends JFrame
	implements ActionListener{
	
	private Button searchBtn;
	private Button addBtn;
	private Button deleteBtn;
	private Button modifyBtn;
	
	public UtilityBoard() {
		this.setName("�޴�");
		
		this.setSize(500, 1000);
		this.setLayout(new GridLayout(4, 1));
		
			Panel panel = new Panel();
		
		searchBtn = new Button("�˻�");
		addBtn = new Button("�߰�");
		deleteBtn = new Button("����");
		modifyBtn = new Button("����");
		
		this.add(searchBtn);
		this.add(addBtn);
		this.add(deleteBtn);
		this.add(modifyBtn);
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(searchBtn)) {
			System.out.println("�׽�Ʈ");
		}
	}
	
}