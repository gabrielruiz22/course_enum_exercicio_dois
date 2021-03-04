package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
				
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Wow that's awesome!");
		
		Post post = new Post(new Date(), "Traveling to New Zeland", "I'm going to visit this wonderful country!", 12);
		post.addComment(c1);
		post.addComment(c2);
		
		
		Post post2 = new Post(Post.formatDate.parse("21/06/2018 18:22:55"), "Good Night guys", "See you tomorrow", 5);
		post2.addComment(new Comment("Good Night"));
		post2.addComment(new Comment("May the Force be with you"));
		
		System.out.println(post);
		System.out.println(post2);

//		Maneira como fiz antes de ver a resolução
//		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");		
//		System.out.println(post);
//		for(int i = 0; i < post.getListComment().size(); i++) {
//			System.out.println(post.getListComment().get(i).getText());
//			
//			if(i == post.getListComment().size() - 1) {
//				System.out.println();
//			}
//		}
		
//		System.out.println(post2);
//		for(int i = 0; i < post2.getListComment().size(); i++) {
//			System.out.println(post2.getListComment().get(i).getText());
//		}
	}

}
