package dbGUI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import dbGUI.buttons.LoginButton;

public class AuthorizationFrame extends JFrame {
	/**
	 * @author Vitalii Chornenkyi
	 */
	private static final long serialVersionUID = 5201582873344229686L;
	private static JFrame authorizationFrame;
	// Labels
	private JLabel hostLabel = new JLabel("Host:");
	private JLabel rootLabel = new JLabel("Root:");
	private JLabel passwordLabel = new JLabel("Password:");
	private JLabel nameDbLabel = new JLabel("Name DB:");
	// Text fields
	private static JTextField hostTextField = new JTextField(20);
	private static JTextField rootTextField = new JTextField(20);
	private static JTextField passwordTextField = new JPasswordField(20);
	private static JTextField nameDbTextField = new JTextField(20);
	// Buttons
	private LoginButton logInButton = new LoginButton();
	
	public AuthorizationFrame () {
		authorizationFrame = new JFrame("Connection to DB");
		authorizationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		authorizationFrame.setLayout(new GridBagLayout());
		// Adding labels to the frame
		authorizationFrame.add(hostLabel, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		authorizationFrame.add(rootLabel, new GridBagConstraints(0, 1, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		authorizationFrame.add(passwordLabel, new GridBagConstraints(0, 2, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		authorizationFrame.add(nameDbLabel, new GridBagConstraints(0, 3, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		// Adding text fields
		authorizationFrame.add(hostTextField, new GridBagConstraints(1, 0, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		authorizationFrame.add(rootTextField, new GridBagConstraints(1, 1, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		authorizationFrame.add(passwordTextField, new GridBagConstraints(1, 2, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		authorizationFrame.add(nameDbTextField, new GridBagConstraints(1, 3, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		// Adding button
		authorizationFrame.add(logInButton, new GridBagConstraints(1, 4, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		
		authorizationFrame.pack();
		authorizationFrame.setLocationRelativeTo(null);
		authorizationFrame.setResizable(false);
		authorizationFrame.setVisible(true);
	}
	
	public static String getHost() {
		return hostTextField.getText();
	}
	
	public static String getRoot() {
		return rootTextField.getText();
	}
	
	public static String getPassword() {
		return passwordTextField.getText();
	}
	
	public static String getNameDb() {
		return nameDbTextField.getText();
	}
	
	public static void setNotVisible () {
		authorizationFrame.setVisible(false);
	}
}
