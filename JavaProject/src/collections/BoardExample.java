package collections;

import java.util.ArrayList;
import java.util.List;

class Board {
	String subject;
	String content;
	String writer;
	Board(){}
	Board(String subject, String conent, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
}
public class BoardExample {
	public static void main(String[] args) {
		List<Board> boards = new ArrayList<Board>(); // board타입을 담을수 있는
//		boards = new LinkedList<>();
		Board b1 = new Board();
		
		b1.subject = "test";
		b1.content = "content";
		b1.writer = "user1";
		Board b2 = new Board("java", "very good", "user2");
		Board b3 = new Board("jaVascript", "good", "user1");
		
		boards.add(b1);
		boards.add(b2);
		boards.add(b3);
		boards.add(new Board("Javascript", "good", "user1"));
		
		String searchStr = "java"; 
		for(int i = 0; i < boards.size(); i++) {
			if(boards.get(i).subject.equals(searchStr)) {
				System.out.println(boards.get(i));
			}
		}
		
	}
}
