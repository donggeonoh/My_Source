package dmaps.study.main;

import java.awt.Button;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetButtonListener 
	implements ActionListener {

	Button button[];
	TextField textField[];
	TextArea textArea;
	
	public SetButtonListener(Button []button, TextField []textField, TextArea textArea) {
		this.button = button;
		this.textField = textField;
		this.textArea = textArea;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i = 0; i < 13; i++) {
			if(e.getSource().equals(button[12] /*submit*/)) {
				for(int k = 0; k < 3; k++) {
					
					/* 첫 번째
					String text;
					text = textField[k].getText();
					textArea.setText(textArea.getText() + text);
					*/
					
					/* 두 번째
					 * textArea.setText(textArea.getText() + textField[k].getText());
					 */
					
					// 세 번째
					String text = textField[k].getText();
					textArea.append(text + " ");
				}
				
				break;
			}
			
			else if(e.getSource().equals(button[i])) {
				for(int j = 0; j < 3; j++) {
					if(textField[j].getText().isEmpty()) {
						textField[j].setText((button[i].getLabel()));
						break;
					}
				}
			}
		}
	}	
}
