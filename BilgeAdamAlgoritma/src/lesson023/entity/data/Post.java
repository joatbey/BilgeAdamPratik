package lesson023.entity.data;

import java.time.LocalDate;
import java.util.List;

public class Post {

	private LocalDate date;
	private String image;
	private List<String> comments;
	private static int likes = 0;

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}

	public int getLikes() {
		return likes;
	}

}