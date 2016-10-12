package com.dku.dmaps.personcontrolproject.view;

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

import com.dku.dmaps.personcontrolproject.control.Controlor;
import com.dku.dmaps.personcontrolproject.vo.Person;

public class MainBoard
	implements ActionListener {
	
	private Controlor controlor = new Controlor(this);
	
	private Button northButton;
	private TextField northTextField;
	private TextArea outputArea;

	public MainBoard() {
		
		JFrame mainBoard = new JFrame("PersonControlProject");
		mainBoard.setSize(1000, 500);
		mainBoard.setLayout(new BorderLayout());
		
		//윗부분 레이아웃 설정
		Panel northPanel = new Panel();
		northPanel.setLayout(new GridLayout(1, 2));
		northTextField = new TextField();
		northPanel.add(northTextField);
		northButton = new Button("검색");
		northButton.addActionListener(this);
		northPanel.add(northButton);
		mainBoard.add(northPanel, BorderLayout.NORTH);
		
		outputArea = new TextArea();
		mainBoard.add(outputArea, BorderLayout.CENTER);
		
		//밑부분 레이아웃 설정
		Panel southPanel = new Panel();
		southPanel.setLayout(new GridLayout(1, 4));
		Button testButton = new Button("테스트");
		testButton.addActionListener(this);
		southPanel.add(testButton);
		southPanel.add(new Button());
		southPanel.add(new Button());
		southPanel.add(new Button());
		mainBoard.add(southPanel, BorderLayout.SOUTH);
		
		
		mainBoard.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(northButton)) {
			controlor.searchWithName(northTextField.getText().toString());
		}
	}

	public void printDataList(ArrayList<Person> resultList) {
		outputArea.setText("");
		for (Person person : resultList) {
			outputArea.append(person.toString()+"\n");	
		}
	}
}
