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
		this.setName("메뉴");
		
		this.setSize(500, 1000);
		this.setLayout(new GridLayout(4, 1));
		
			Panel panel = new Panel();
		
		searchBtn = new Button("검색");
		addBtn = new Button("추가");
		deleteBtn = new Button("삭제");
		modifyBtn = new Button("수정");
		
		this.add(searchBtn);
		this.add(addBtn);
		this.add(deleteBtn);
		this.add(modifyBtn);
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(searchBtn)) {
			System.out.println("테스트");
		}
	}
	
}