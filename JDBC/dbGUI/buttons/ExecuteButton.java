package dbGUI.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import connection.DbHelper;
import dbGUI.InputPanel;
import dbGUI.ResultPanel;

public class ExecuteButton extends JButton {
	/**
	 * @author Vitalii Chornenkiy
	 */
	private static final long serialVersionUID = -2865620600232513961L;
	private DbHelper helper = new DbHelper(LoginButton.getConnection().getStm());;
	
	public ExecuteButton() {
		super.setText("Execute");
		super.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				helper.executeQuery(InputPanel.getQueryTextField());
				ResultPanel.updateResultTable(helper.getNewTableModel());
			}
		});
	}
}
