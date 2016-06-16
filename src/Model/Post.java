package Model;

public class Post {
	
	private String author;
	private String title;
	private String description;
	private String cover;

	public Post() {
		
	}
	
	public Post(String author, String title, String description, String cover) {
		this.author = author;
		this.title = title;
		this.description = description;
		this.cover = cover;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}
}
