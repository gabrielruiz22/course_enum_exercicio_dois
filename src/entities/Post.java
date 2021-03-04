package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	public static SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private List<Comment> listComment = new ArrayList<Comment>();
	
	public Post(Date moment, String title, String content, int likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
	
	public Post() {
		
	}
	
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
		

	public List<Comment> getListComment() {
		return listComment;
	}

	public void addComment(Comment comment) {
		listComment.add(comment);
	}
	
	public void removeComment(Comment comment) {
		listComment.remove(comment);
	}

	@Override
	public String toString() {
		//return title + "\n" + likes + " Likes" + moment + "\n" + content + "\n" + "Comment's:";
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes + "Likes");
		sb.append(" - " + formatDate.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments:\n");
		
		for (Comment c : listComment) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString();
	}
	
}
