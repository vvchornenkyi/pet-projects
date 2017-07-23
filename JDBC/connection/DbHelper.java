package connection;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import dbGUI.SQLTableModel;

public class DbHelper {
	private Statement stm;
	private ResultSet result;
	private static ResultSetMetaData rsmd;
	private int columnCount;
	private SQLTableModel tableModel;

	public DbHelper(Statement stm) {
		if (stm != null) this.stm = stm;
	}

	public void executeQuery(String query) {
		if (query.length() > 6 && query.substring(0, 6).equalsIgnoreCase("SELECT")) this.printResult(this.doQuery(query));
		if (query.length() > 6 && query.substring(0, 6).equalsIgnoreCase("INSERT") || query.substring(0, 6).equals("DELETE")) this.doUpdate(query);
	}

	public void doUpdate(String query) {
		try {
			stm.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ResultSet doQuery(String query) {
		try {
			result = stm.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static String getColumnName(int columnIndex) {
		try {
			return rsmd.getColumnName(columnIndex);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public void printResult(ResultSet result) {
		try {
			rsmd = result.getMetaData();
			columnCount = rsmd.getColumnCount();
			tableModel = new SQLTableModel();
			while (result.next()) {
				String [] row = new String[columnCount];
				for (int i = 0; i < columnCount; i ++) {
					row[i] = result.getString(i + 1);
				}
				tableModel.addDataTableResult(row);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public SQLTableModel getNewTableModel() {
		return this.tableModel;
	}
	// Old method for print in console
	/*public void printResult(ResultSet result) {
		try {
			rsmd = result.getMetaData();
			columnCount = rsmd.getColumnCount();
			for (int j = 1; j <= columnCount; j ++) {
				System.out.printf("%-50s%s", rsmd.getColumnName(j), "|");
			}
			System.out.println();
			while (result.next()) {
				for (int i = 1; i <= columnCount; i ++) {
					System.out.printf("%-50s%s", result.getString(i), "|");
				}
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}*/
}
