package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.Statement;

public class DBConnection {
	private String host;
	private String root;
	private String password;
	private String nameDb;
	private String url;

	private Properties properties = new Properties();
	private Connection mysqlConnect;
	
	public DBConnection (String host, String root, String password, String nameDb) {
		this.host = host;
		this.root = root;
		this.password = password;
		this.nameDb = nameDb;
	}
	// Задаем свойства подключения, которые будут использоваться в БД
	public void initProperties () {
		url = "jdbc:mysql://" + host + "/" + nameDb + "?useSSL=true";

		properties.setProperty("user", root);
		properties.setProperty("password", password);
		properties.setProperty("characterEncoding", "UTF-8");
		properties.setProperty("useUnocode", "true");

		System.out.println("URL: " + url);
	}
	// Непосредственно подключаемся к БД
	public void init () throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver"); //Загружаем в память необходимый класс Driver
			mysqlConnect = DriverManager.getConnection(url, properties);
	}

	// Закрытие соединения
	public void finalize () {
		try {
			mysqlConnect.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Connection closed");
	}
	
	public Statement getStm () {
		try {
			return mysqlConnect.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
