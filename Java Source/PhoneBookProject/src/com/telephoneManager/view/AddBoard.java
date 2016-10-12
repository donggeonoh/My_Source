package com.telephoneManager.view;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.telephoneManager.VO.Data;
import com.telephoneManager.controller.Controller;

public class AddBoard extends Board
	implements ActionListener{
	
	private Controller controller;
	
	private Panel panel;
	private Label label;
	
	private JTextField nameText;
	private JTextField numberText;
	private JTextField addressText;
	private ButtonGroup genderGroup;
	
	private JRadioButton womenButton;
	private JRadioButton manButton;
	
	private boolean isGender;
	private Button addButton;

	public AddBoard(Controller controller) {
		this.controller = controller;
		
		setFrame();
		
		insertName();
		insertGender();
		insertNumber();
		insertAddress();
		
		addButton();

		this.setVisible(true);
	}

	private void setFrame() {
		
		this.setSize(300, 500);
		this.setLayout(new FlowLayout());
	}
	
	private void insertName() {
		
		panel = new Panel();
		label = new Label("이름");
		nameText = new JTextField(5);
		
		panel.add(label);
		panel.add(nameText);
		
		this.add(panel);
	}
	
	private void insertGender() {
		
		label = new Label("성별");
		panel = new Panel();
		
		manButton = new JRadioButton("남");
		womenButton = new JRadioButton("여");
		
		manButton.addActionListener(this);
		womenButton.addActionListener(this);
		
		genderGroup = new ButtonGroup();
		genderGroup.add(manButton);
		genderGroup.add(womenButton);
		
		panel.add(label);
		panel.add(manButton);
		panel.add(womenButton);
		
		this.add(panel);
	}
	
	private void insertNumber() {
		
		label = new Label("전화번호");
		numberText = new JTextField(8);
		panel = new Panel();
		
		panel.add(label);
		panel.add(numberText);
		
		this.add(panel);
	}
	
	private void insertAddress() {
		
		label = new Label("주소");
		addressText = new JTextField(20);
		panel = new Panel();
		
		panel.add(label);
		panel.add(addressText);
		
		this.add(panel);
		
	}
	
	public Data insertData() {
		Data data = new Data(nameText.getText(), isGender, numberText.getText(), addressText.getText());
		
		return data;
	}
	
	private void addButton() {

		addButton = new Button("추가");
		addButton.addActionListener(this);
		this.add(addButton);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(manButton)) {
			System.out.println("남자 눌림");
			isGender = true;
			
		} else if (e.getSource().equals(womenButton)) {
			System.out.println("여자 눌림");
			isGender = false;
		}
		
		if(e.getSource().equals(addButton)) {
			System.out.println("입력 받음");
				controller.saveData(insertData());
				getName();
				dispose();
		}
		
	}
}
