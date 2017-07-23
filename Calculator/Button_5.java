import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Button_5 extends JButton {

	private static final long serialVersionUID = 1L;
	
	public Button_5() {
		super.setText("5");
		super.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				PanelOfResults.setEntryFieldText(PanelOfResults.getEntryFieldText()+"5");
			}}); 
	}
}
