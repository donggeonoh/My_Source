package com.dmaps.study.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InformFrame extends JFrame 
	implements ActionListener {
	
	PhotoFrame photoFrame;
	
	private JButton comfirmButton;
	private JButton exitButton;

	public InformFrame(PhotoFrame photoFrame) {
		
		this.photoFrame = photoFrame;
		
		JLabel label = new JLabel("끝! 다시 시도하시겠습니까?");
		comfirmButton = new JButton("확인");
		exitButton = new JButton("나가기");
		
		comfirmButton.addActionListener(this);
		exitButton.addActionListener(this);
		
		this.setLayout(new GridLayout(2, 1));
		this.add(label);
		
		JPanel panel = new JPanel(); 
		
		panel.add(comfirmButton);
		panel.add(exitButton);
		
		this.add(panel);
		
		this.setSize(400, 200);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(comfirmButton)) {
			this.dispose();
			photoFrame.setEnabled(true);
			
		} else if(e.getSource().equals(exitButton)) {
			System.exit(0);
		}
	}

}
