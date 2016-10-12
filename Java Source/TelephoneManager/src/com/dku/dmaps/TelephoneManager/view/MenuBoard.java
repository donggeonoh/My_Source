package com.dku.dmaps.TelephoneManager.view;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;

import com.dku.dmaps.TelephoneManager.VO.Humint;
import com.dku.dmaps.TelephoneManager.control.Controller;

public class MenuBoard implements ActionListener{
	
	private Controller controller = new Controller(this);
	
	private Button northButton;
	private TextField northTextField;
	private TextArea outputArea;
	
	Button addButton;
	Button deleteButton;
	Button modifyButton;
	
	public MenuBoard() {
		startMainboard();
	}
	
	private void startMainboard() {
		JFrame mainBoard = new JFrame("TelephoneManager");
		mainBoard.setSize(700, 500);
		mainBoard.setLayout(new BorderLayout(10, 20));
		
		//윗부분 레이아웃 설정
		Panel northPanel = new Panel();
		northTextField = new TextField(50);
		northPanel.add(northTextField);
		
		northButton = new Button("  검색  ");
		northButton.addActionListener(this);
		northPanel.add(northButton);
		mainBoard.add(northPanel, BorderLayout.NORTH);
		
		outputArea = new TextArea();
		mainBoard.add(outputArea, BorderLayout.CENTER);
		
		//밑부분 레이아웃 설정
		Panel southPanel = new Panel();

		addButton = new Button("  추가  ");
		deleteButton = new Button("삭제	");
		
		addButton.addActionListener(this);
		
		southPanel.add(addButton);
		southPanel.add(deleteButton);
		southPanel.add(modifyButton);

		mainBoard.add(southPanel, BorderLayout.SOUTH);
		
		//실행화면
		mainBoard.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(northButton)) {
			controller.searchWithName(northTextField.getText().toString());
		} else if (e.getSource().equals(addButton)) {
			new AddBoard();
		}
	}
	
	public void printDataList(ArrayList<Humint> resultList) {
		outputArea.setText("");
		for(Humint humint : resultList)
			outputArea.append(humint.toString() + "\n");
	}
}