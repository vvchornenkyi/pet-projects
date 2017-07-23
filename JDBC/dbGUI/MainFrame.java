package dbGUI;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	/**
	 * @author Vitalii Chornenkyi
	 */
	private static final long serialVersionUID = -736452448315106752L;
	private JFrame mainFrame;
	private InputPanel inputPanel;
	private ResultPanel resultPanel;
	
	public MainFrame() {
		mainFrame = new JFrame("Graphical user interface (GUI) for JDBC");
		inputPanel = new InputPanel();
		resultPanel = new ResultPanel();
		mainFrame.setLayout(new BorderLayout());
		mainFrame.add(inputPanel, BorderLayout.NORTH);
		mainFrame.add(resultPanel, BorderLayout.CENTER);
		
		mainFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		mainFrame.setSize(600, 400);
		mainFrame.setResizable(true);
		mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		mainFrame.setVisible(true);
	}
	
}
