import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonPoint extends JButton {

	private static final long serialVersionUID = 1L;
	
	public ButtonPoint() {
		super.setText(".");
		super.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if(GlobalVars.cnt == 0) {
					PanelOfResults.setEntryFieldText(PanelOfResults.getEntryFieldText()+".");
					GlobalVars.cnt ++;
				}
			}}); 
	}
}
