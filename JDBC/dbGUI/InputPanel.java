package dbGUI;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dbGUI.buttons.ExecuteButton;
import dbGUI.buttons.ExitButton;

public class InputPanel extends JPanel{
	/**
	 * @author Vitalii Chornenkyi
	 */
	private static final long serialVersionUID = -1622357380557062559L;
	
	private static JTextField queryTextField = new JTextField();
	private ExecuteButton executeButton = new ExecuteButton();
	private ExitButton exitButton = new ExitButton();
	private JLabel adviceLabel = new JLabel("Advice: For exit use button 'Exit', else connection will not close!");

	public InputPanel() {
		super.setLayout(new BorderLayout());
		adviceLabel.setForeground(Color.RED);
		adviceLabel.setHorizontalAlignment(JLabel.CENTER);
		// Adding components
		super.add(queryTextField, BorderLayout.NORTH);
		super.add(executeButton, BorderLayout.WEST);
		super.add(exitButton, BorderLayout.EAST);
		super.add(adviceLabel, BorderLayout.CENTER);
	}
	
	public static String getQueryTextField() {
		return queryTextField.getText();
	}
}
