package com.dku.dmaps.TelephoneManager.view;

import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

import javax.swing.JFrame;

public class AddBoard extends JFrame{

	Panel genderPanel;
	private Panel numberPanel;
	private Panel addressPanel;
	private Panel namePanel;
	private Panel addPanel;
	
	public AddBoard() {
		
		setFrame();
		setLabel();
		setInfo();
	}
	
	private void setFrame() {
		
		this.setName("����ó �߰�");
		this.setSize(350, 550);
		this.setLayout(new GridLayout(5, 1));
	}
	
	private void setLabel() {
		namePanel = new Panel();
		
		genderPanel = new Panel();
		
		numberPanel = new Panel();
		
		addressPanel = new Panel();
		
		addPanel = new Panel();
		
		this.add(namePanel);
		this.add(genderPanel);
		this.add(numberPanel);
		this.add(addressPanel);
		this.add(addPanel);
		
		this.setVisible(true);
	}
	
	private void setInfo() {
		Label nameLabel = new Label("�̸�  ");
		TextField nameText = new TextField(10);
		
		Label genderLabel = new Label("����  ");
		Button men = new Button(" �� ");
		Button women = new Button(" �� ");

		Label numberLabel = new Label("��ȭ��ȣ  ");
		TextField integratedNumber = new TextField(3);
		TextField centerNumber = new TextField(4);
		TextField lastNumber = new TextField(4);
		
		Label addressLabel = new Label("�ּ�  ");
		TextField addressText = new TextField(30);
		
		Label setButtonSize = new Label();
		setButtonSize.setAlignment(Label.CENTER);
		setButtonSize.setSize(100, 50);
		
		Button addBtn = new Button("�߰�");
		
		namePanel.add(nameLabel);
		namePanel.add(nameText);
		
		genderPanel.add(genderLabel);
		genderPanel.add(men);
		genderPanel.add(women);
		
		numberPanel.add(numberLabel);
		numberPanel.add(integratedNumber);
		numberPanel.add(new Label("-"));
		numberPanel.add(centerNumber);
		numberPanel.add(new Label("-"));
		numberPanel.add(lastNumber);
		
		addressPanel.add(addressLabel);
		addressPanel.add(addressText);
		
		addPanel.add(setButtonSize);
		addPanel.add(addBtn);
		
		this.setVisible(true);
	}
	
}