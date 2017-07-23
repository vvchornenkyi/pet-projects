import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Button_1 extends JButton {
	
	private static final long serialVersionUID = 1L;

	public Button_1 () {
		super.setText("1");
		super.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				PanelOfResults.setEntryFieldText(PanelOfResults.getEntryFieldText()+"1");
			}});
	}

}
