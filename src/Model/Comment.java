package Model;

public class Comment {

	private int postID;
	private String comment;
	
	public Comment() {
		
	}
	
	public Comment(int postID, String comment) {
		this.postID = postID;
		this.comment = comment;
	}

	public int getPostID() {
		return postID;
	}

	public void setPostID(int postID) {
		this.postID = postID;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
