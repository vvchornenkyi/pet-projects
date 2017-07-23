package dbGUI.buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ExitButton extends JButton {
	/**
	 * @author Vitalii Chornenkyi
	 */
	private static final long serialVersionUID = 2197558707706665058L;
	
	public ExitButton() {
		super.setText("Exit");
		super.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				LoginButton.getConnection().finalize();
				System.exit(0);
			}
			
		});
	}
}
