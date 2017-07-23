package dbGUI;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import connection.DbHelper;

public class SQLTableModel extends AbstractTableModel{
	/**
	 * @author Vitalii Chornenkyi
	 */
	private static final long serialVersionUID = 2148095058603758945L;
	
	private int columnCount;
	private ArrayList <String []> dataArrayList;
	
	public SQLTableModel() {
		dataArrayList = new ArrayList <String []>();
		int sizeArrayList = dataArrayList.size();
		for (int i = 0; i < sizeArrayList; i ++) {
			dataArrayList.add(new String[columnCount]);
		}
	}
	
	@Override
	public int getColumnCount() {
		return columnCount;
	}

	@Override
	public int getRowCount() {
		return dataArrayList.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int colIndex) {
		String [] rows = dataArrayList.get(rowIndex);
		return rows[colIndex];
	}
	
	@Override
	public String getColumnName (int columnIndex) {
		return DbHelper.getColumnName(columnIndex + 1);
	}
	
	public void addDataTableResult(String [] row) {
		columnCount = row.length;
		dataArrayList.add(row);
	}

}
