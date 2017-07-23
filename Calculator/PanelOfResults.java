import java.awt.BorderLayout;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelOfResults extends JPanel {

	private static final long serialVersionUID = 3474845005935143916L;
	
	private static JLabel history;
	private static JTextField entryField;

	public PanelOfResults() {
		super.setLayout(new BorderLayout());
		
		history = new JLabel("Hello! I'm calculator!");
		history.setHorizontalAlignment(JLabel.RIGHT);
		history.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		
		entryField = new JTextField();
		entryField.setHorizontalAlignment(JTextField.RIGHT);
		entryField.setFont(new Font("Times New Roman", Font.BOLD, 30));
		entryField.setEditable(false);
		
		super.add(history, BorderLayout.NORTH);
		super.add(entryField, BorderLayout.CENTER);
	}
	
	public static String getHistoryText() {
		return history.getText();
	}
	
	public static void setHistoryText(String text) {
		history.setText(text);
	}
	
	public static String getEntryFieldText() {
		return entryField.getText();
	}

	public static void setEntryFieldText(String text) {
		entryField.setText(text);;
	}
}
