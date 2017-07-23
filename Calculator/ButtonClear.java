import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonClear extends JButton {

	private static final long serialVersionUID = 1L;
	
	public ButtonClear() {
		super.setText("Clear");
		super.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				PanelOfResults.setEntryFieldText(null);
				GlobalVars.cnt = 0;
				GlobalVars.sign = 0;
				PanelOfResults.setHistoryText("Can I help you yet?");
			}}); 
	}
}
