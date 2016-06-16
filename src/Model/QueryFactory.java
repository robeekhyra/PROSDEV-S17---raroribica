package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import DBConnection.DBConnection;

public class QueryFactory {

	private Connection connection;

	public QueryFactory() {
		this.connection = new DBConnection().getConnection();
	}

	public void addPost(String title, String description, String author, String cover) {

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		System.out.println(dateFormat.format(date));

		Statement statement = null;
		String sql = "INSERT INTO posts (title, description, author, date, cover)" + " VALUES ('" + title + "', '"
				+ description + "', '" + author + "', '" + dateFormat.format(date) + "', '" + cover + "')";
		try {
			statement = connection.createStatement();
			statement.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void addComment(String comment, String author, int postID) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		System.out.println(dateFormat.format(date));

		Statement statement = null;
		String sql = "INSERT INTO comments (postid, comment, author, date)" + " VALUES ('" + postID + "', '"
				+ comment + "', '" + author + "', '" + dateFormat.format(date) + "')";
		try {
			statement = connection.createStatement();
			statement.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void addUser(String username, String password) {
		
		Statement statement = null;
		String sql = "INSERT INTO users (username, password)" + " VALUES ('" + username + "', '"
				+ password + "')";
		try {
			statement = connection.createStatement();
			statement.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
