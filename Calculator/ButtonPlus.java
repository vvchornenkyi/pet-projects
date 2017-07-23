import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonPlus extends JButton {

	private static final long serialVersionUID = 1L;
	
	public ButtonPlus() {
		super.setText("+");
		super.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				GlobalVars.sign = 1;
				try {
				if(PanelOfResults.getHistoryText() == "Hello! I'm calculator!" || PanelOfResults.getHistoryText() == "Can I help you yet?") {
					PanelOfResults.setHistoryText(null);
				PanelOfResults.setHistoryText(PanelOfResults.getEntryFieldText());
				}
				else PanelOfResults.setHistoryText(String.valueOf(Float.valueOf(PanelOfResults.getHistoryText())+Float.valueOf(PanelOfResults.getEntryFieldText())));
				PanelOfResults.setEntryFieldText(null);
			}
			catch (NumberFormatException e) {}
				GlobalVars.cnt = 0;
			}}); 
	}	
}