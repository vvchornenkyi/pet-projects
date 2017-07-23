import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Button_4 extends JButton {

	private static final long serialVersionUID = 1L;
	
	public Button_4() {
		super.setText("4");
		super.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				PanelOfResults.setEntryFieldText(PanelOfResults.getEntryFieldText()+"4");
			}}); 
	}
}
