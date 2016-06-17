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
	
	public boolean signup(Account account){
		String name = account.getName();
		String username = account.getUsername();
		String password = account.getPassword();
		String pic_url = account.getPic_url(); 
		
		Statement s = null;
		String query = "";
		int result = 0;
		
		try {
			s = connection.createStatement();
			query = "INSERT INTO accounts (name, username, password, pic_url) VALUES ('"
	                +name+ "', '" +username+ "', '" +password+ "', '" +pic_url+ "');";
			System.out.println("query = "+query);
			result = s.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (result > 0)
			return true;
		else
			return false;	
	}
	
	public Account login(Account account){
		String username = account.getUsername();
		String password = account.getPassword();
		
		Statement s = null;
		ResultSet rs = null;
		String query = "";
		
		try {
			s = connection.createStatement();
			query = "SELECT * FROM accounts WHERE username = '" +username+ "'"
					+ " AND password = '" +password+ "';";
			System.out.println("query = "+query);
			rs = s.executeQuery(query);
			
			if (rs.next()){
				String name = rs.getString("name");
				String pic_url = rs.getString("pic_url");
				
				account.setName(name);
				account.setPic_url(pic_url);
			} else {
				account = null;
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return account;
	}
}
