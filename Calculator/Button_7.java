import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Button_7 extends JButton {

	private static final long serialVersionUID = 1L;
	
	public Button_7() {
		super.setText("7");
		super.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				PanelOfResults.setEntryFieldText(PanelOfResults.getEntryFieldText()+"7");
			}}); 
		
	}
}
