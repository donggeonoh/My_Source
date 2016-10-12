package com.telephoneManager.view;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.util.ArrayList;

import javax.swing.JTextField;

import com.telephoneManager.VO.Data;
import com.telephoneManager.controller.Controller;

public class DeleteBoard extends Board{
	
	private Controller controller;
	
	private Label label;
	private JTextField textField;
	private Panel panel;
	private TextArea dataArea;

	public DeleteBoard(Controller controller) {
		this.controller = controller;
		
		this.setSize(700, 300);
		this.setLayout(new BorderLayout());
		
		panel = new Panel();
		label = new Label("이름을 입력하세요");
		textField = new JTextField(10);
		
		panel.add(label);
		panel.add(textField);
		
		this.add(panel, BorderLayout.NORTH);
		
		dataArea = new TextArea();
		this.add(dataArea, BorderLayout.CENTER);
		
		controller.searchData("");
		getData();
		
		panel = new Panel();
		Button deleteButton = new Button("          삭제          ");
		
		panel.add(deleteButton);
		this.add(panel, BorderLayout.SOUTH);
		
		this.setVisible(true);
	}
	
	private void getData() {
		ArrayList<Data> dataList = controller.getResultList();
	
		dataArea.setText("");
		
		for(Data data : dataList) {
			dataArea.append(data.toString() + "\n");
		}
		
	}

}
