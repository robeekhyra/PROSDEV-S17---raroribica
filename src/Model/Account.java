package Model;

public class Account {

	private String name;
	private String username;
	private String password;
	private String pic_url;
	
	public Account(){
	}
	
	public Account(String username, String password){
		this.username = username;
		this.password = password;
	}
	
	public Account(String name, String username, String password, String pic_url){
		this.name = name;
		this.username = username;
		this.password = password;
		this.pic_url = pic_url;
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

	public String getPic_url() {
		return pic_url;
	}

	public void setPic_url(String pic_url) {
		this.pic_url = pic_url;
	}
}
