package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private String driverName;
	private String url;
	private String dbName;
	private String username;
	private String password;
	
	public DBConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		this.driverName = "com.mysql.jdbc.DriverManager";
		this.url = "jdbc:mysql://127.0.0.1:3306/";
		this.dbName = "prosdev_rarirobica";
		this.username = "root"; //root
		this.password = "1234";
	}

	public Connection getConnection() {
		try {
			System.out.println("con");
			return DriverManager.getConnection(url + dbName, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String getDriverName() {
		return driverName;
	}

	public String getUrl() {
		return url;
	}

	public String getDbName() {
		return dbName;
	}

	public String getUsername() {
		return username;
	}
}
