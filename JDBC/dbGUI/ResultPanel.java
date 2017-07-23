package dbGUI;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ResultPanel extends JPanel {
	/**
	 * @author Vitalii Chornenkyi
	 */
	private static final long serialVersionUID = 484328047706306521L;
	
	private JScrollPane scroll;
	private static JTable resultTable;
	
	public ResultPanel() {
		super.setLayout(new BorderLayout());
		resultTable = new JTable();
		scroll = new JScrollPane(resultTable);
		// Adding components
		super.add(scroll, BorderLayout.CENTER);
	}
	
	public static void updateResultTable(SQLTableModel dataModel) {
		resultTable.setModel(dataModel);
	}
}
