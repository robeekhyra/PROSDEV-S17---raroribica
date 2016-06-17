package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Model.Account;

public class DBManager {
	
	DBConnection connection;
	
	public DBManager(){
		connection = DBConnection.getConnection();
		System.out.println("xxxxxxxx -- DBManager has been contacted! xo");
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
			s = connection.getRawConnection().createStatement();
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
			s = connection.getRawConnection().createStatement();
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
