import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonEquals extends JButton {

	private static final long serialVersionUID = 1L;
	
	public ButtonEquals() {
		super.setText("=");
		super.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				try {
				if(PanelOfResults.getHistoryText() == "Hello! I'm calculator!" || PanelOfResults.getHistoryText() == "Can I help you yet?") {
					PanelOfResults.setHistoryText(null);
				    PanelOfResults.setHistoryText(PanelOfResults.getEntryFieldText());
				}
				else if(GlobalVars.sign == 1) PanelOfResults.setHistoryText(String.valueOf(Float.valueOf(PanelOfResults.getHistoryText())+Float.valueOf(PanelOfResults.getEntryFieldText())));
				else if(GlobalVars.sign == 2) PanelOfResults.setHistoryText(String.valueOf(Float.valueOf(PanelOfResults.getHistoryText())-Float.valueOf(PanelOfResults.getEntryFieldText())));
				else if(GlobalVars.sign == 3) PanelOfResults.setHistoryText(String.valueOf(Float.valueOf(PanelOfResults.getHistoryText())*Float.valueOf(PanelOfResults.getEntryFieldText())));
				else if(GlobalVars.sign == 4) PanelOfResults.setHistoryText(String.valueOf(Float.valueOf(PanelOfResults.getHistoryText())/Float.valueOf(PanelOfResults.getEntryFieldText())));
				}
				catch (NumberFormatException e) {}
				PanelOfResults.setEntryFieldText(PanelOfResults.getHistoryText());
				PanelOfResults.setHistoryText("Can I help you yet?");
				GlobalVars.cnt = 0;
				GlobalVars.sign = 0;
			}}); 
	}
}
