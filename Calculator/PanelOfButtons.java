
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;

public class PanelOfButtons extends JPanel {

	private static final long serialVersionUID = -6161045786099051089L;
	
	private Button_0 btn_0;
	private Button_1 btn_1;
	private Button_2 btn_2;
	private Button_3 btn_3;
	private Button_4 btn_4;
	private Button_5 btn_5;
	private Button_6 btn_6;
	private Button_7 btn_7;
	private Button_8 btn_8;
	private Button_9 btn_9;
	private ButtonPoint btn_point;
	private ButtonEquals btn_equals;
	private ButtonPlus btn_plus;
	private ButtonMinus btn_minus;
	private ButtonMultiplication btn_multiplication;
	private ButtonDivision btn_division;
	private ButtonClear btn_clear;

	public PanelOfButtons() {
		super.setLayout(new GridBagLayout());
		
		btn_0 = new Button_0();
		btn_1 = new Button_1();
		btn_2 = new Button_2();
		btn_3 = new Button_3();
		btn_4 = new Button_4();
		btn_5 = new Button_5();
		btn_6 = new Button_6();
		btn_7 = new Button_7();
		btn_8 = new Button_8();
		btn_9 = new Button_9();
		btn_point = new ButtonPoint();
		btn_equals = new ButtonEquals();
		btn_plus = new ButtonPlus();
		btn_minus = new ButtonMinus();
		btn_multiplication = new ButtonMultiplication();
		btn_division = new ButtonDivision();
		btn_clear = new ButtonClear();
		
		super.add(btn_0, new GridBagConstraints (0,4,1,1,1,1, GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(2,2,2,2), 0, 0));
		super.add(btn_1, new GridBagConstraints (0,3,1,1,1,1, GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(2,2,2,2), 0, 0));
		super.add(btn_2, new GridBagConstraints (1,3,1,1,1,1, GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(2,2,2,2), 0, 0));
		super.add(btn_3, new GridBagConstraints (2,3,1,1,1,1, GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(2,2,2,2), 0, 0));
		super.add(btn_4, new GridBagConstraints (0,2,1,1,1,1, GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(2,2,2,2), 0, 0));
		super.add(btn_5, new GridBagConstraints (1,2,1,1,1,1, GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(2,2,2,2), 0, 0));
		super.add(btn_6, new GridBagConstraints (2,2,1,1,1,1, GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(2,2,2,2), 0, 0));
		super.add(btn_7, new GridBagConstraints (0,1,1,1,1,1, GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(2,2,2,2), 0, 0));
		super.add(btn_8, new GridBagConstraints (1,1,1,1,1,1, GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(2,2,2,2), 0, 0));
		super.add(btn_9, new GridBagConstraints (2,1,1,1,1,1, GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(2,2,2,2), 0, 0));
		super.add(btn_point, new GridBagConstraints (1,4,1,1,1,1, GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(2,2,2,2), 0, 0));
		super.add(btn_equals, new GridBagConstraints (2,4,1,1,1,1, GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(2,2,2,2), 0, 0));
		super.add(btn_plus, new GridBagConstraints (3,4,1,1,1,1, GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(2,2,2,2), 0, 0));
		super.add(btn_minus, new GridBagConstraints (3,3,1,1,1,1, GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(2,2,2,2), 0, 0));
		super.add(btn_multiplication, new GridBagConstraints (3,2,1,1,1,1, GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(2,2,2,2), 0, 0));
		super.add(btn_division, new GridBagConstraints (3,1,1,1,1,1, GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(2,2,2,2), 0, 0));
		super.add(btn_clear, new GridBagConstraints (0,0,4,1,1,0.2, GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(2,2,2,2), 0, 0));
	}
	
}
