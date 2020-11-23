package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import Entities.Post;
import Entities.comment;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Post p1 = new Post(
							sdf.parse("21/06/2018 13:05:44"),
							"Traveling to New Zealand",
							"I'm going to visit this wonderfull country",
							12);
		Post p2 = new Post(
							sdf.parse("28/07/2018 23:14:19"),
							"Good Night guys",
							"See you tomorow",
							5);
		comment c1 = new comment("Have a nice trip");
		comment c2 = new comment("Wow thats awesome");
		comment c3 = new comment("Good night");
		comment c4 = new comment("May the force be with you");
		p1.addComment(c1);
		p1.addComment(c2);
		p2.addComment(c3);
		p2.addComment(c4);
		
		
		System.out.println(p1.toString());
		System.out.println();
		System.out.println(p2.toString());
		
		
	}

}
