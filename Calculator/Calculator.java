import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class Calculator {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Calculator");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250, 400);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setLayout(new BorderLayout());
		
		PanelOfButtons btnPanel = new PanelOfButtons();
		btnPanel.setBackground(new Color(211, 211, 211));
		
		PanelOfResults resultPanel = new PanelOfResults();
		resultPanel.setBackground(new Color(211, 211, 211));
		
		frame.add(resultPanel, BorderLayout.NORTH);
		frame.add(btnPanel, BorderLayout.CENTER);
		
		frame.setVisible(true);
	}

}
