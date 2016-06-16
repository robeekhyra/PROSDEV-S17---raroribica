package Model;

public class User {
	private String name;
	private String username;
	private String password;
	private String picture;
	
	public User() {
		
	}
	
	public User(String name, String username, String password, String picture) {
		this.name = name;
		this.username = username;
		this.password = password;
		this.picture = picture;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}
}
