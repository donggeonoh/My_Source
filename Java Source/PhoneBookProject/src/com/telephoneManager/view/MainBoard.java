package com.telephoneManager.view;

import java.awt.BorderLayout;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextArea;

import com.telephoneManager.VO.Data;
import com.telephoneManager.controller.Controller;

public class MainBoard extends Board
	implements ActionListener{
	
	private Controller controller;
	
	private Button searchButton;
	private Button addButton;
	private Button deleteButton;
	private Button modifyButton;

	private TextField searchtextField;

	private JTextArea dataArea;

	public MainBoard() {
		
		controller = new Controller();
		
		setBaseFrame();
		
		setNorthLayout();
		setCenterLayout();
		setSouthLayout();
		
		this.setVisible(true);
	}

	private void setBaseFrame() {
		this.setName("전화번호부");
		this.setSize(700, 500);
		this.setLayout(new BorderLayout(0, 30));
	}
	
	private void setNorthLayout() {
		Panel northPanel = new Panel();
		searchtextField = new TextField(80);
		searchButton = new Button(" 검색 ");
		
		northPanel.setLayout(new BorderLayout(10, 0));

		northPanel.add(searchtextField, BorderLayout.WEST);
		northPanel.add(searchButton, BorderLayout.CENTER);
		
		searchButton.addActionListener(this);
		
		this.add(northPanel, BorderLayout.NORTH);
	}
	
	private void setCenterLayout() {
		dataArea = new JTextArea();
		
		this.add(dataArea, BorderLayout.CENTER);
	}

	private void setSouthLayout() {
		Panel southPanel = new Panel();
		southPanel.setLayout(new GridLayout(1, 3));
		
		Panel addPanel = new Panel();
		addButton = new Button("         추가         ");
		southPanel.add(addPanel);
		addPanel.add(addButton);
		
		Panel deletePanel = new Panel();
		deleteButton = new Button("         삭제         ");
		southPanel.add(deletePanel);
		deletePanel.add(deleteButton);
		
		Panel modifyPanel = new Panel();
		modifyButton = new Button("         수정         ");
		southPanel.add(modifyPanel);
		modifyPanel.add(modifyButton);
		
		addButton.addActionListener(this);
		deleteButton.addActionListener(this);
		modifyButton.addActionListener(this);
		
		this.add(southPanel, BorderLayout.SOUTH);
	}
	
	private void getData() {
		ArrayList<Data> dataList = controller.getResultList();
	
		dataArea.setText("");
		
		for(Data data : dataList) {
			dataArea.append(data.toString() + "\n");
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(searchButton)) {
			System.out.println("검색눌림");
			String str = searchtextField.getText();
			controller.searchData(str);
			getData();
			
		} else if(e.getSource().equals(addButton)) {
			System.out.println("추가 눌림");
			new AddBoard(controller);
			
		} else if(e.getSource().equals(deleteButton)) {
			System.out.println("삭제 눌림");
			new DeleteBoard(controller);
			
		} else if(e.getSource().equals(modifyButton)) {
			System.out.println("수정 눌림");
			new ModifyBoard(controller);
			
		}
	}
	
}
