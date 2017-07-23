package dbGUI.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;

import connection.DBConnection;
import dbGUI.AuthorizationFrame;
import dbGUI.MainFrame;

public class LoginButton extends JButton{
	/**
	 * @author Vitalii Chornenkyi
	 */
	private static final long serialVersionUID = -3252101320630373866L;
	private static DBConnection connect;
	
	public LoginButton () {
		super.setText("Log in");
		super.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			    connect = new DBConnection(AuthorizationFrame.getHost(), AuthorizationFrame.getRoot(), AuthorizationFrame.getPassword(), AuthorizationFrame.getNameDb());
				connect.initProperties();
				try {
					connect.init();
					AuthorizationFrame.setNotVisible();
					@SuppressWarnings("unused")
					MainFrame mainFrame = new MainFrame();
				} catch (ClassNotFoundException | SQLException e1) {}
			}	
		});
	}
	
	public static DBConnection getConnection() {
		return connect;
	}
}
