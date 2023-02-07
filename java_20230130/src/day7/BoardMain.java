package day7;

public class BoardMain {

	public static void main(String[] args) {
		//설계도면 obj = new 구현한클래스의생성자();
		BoardDAOImpl obj = new BoardDAOImpl();
		
		// 고객이 입력한 내용에 해당
		Board board = new Board();
		board.setBrdTitle("제목");
		board.setBrdContent("내용");
		board.setBrdWriter("작성자");
		
		System.out.println(obj.insertBoard(board));
	}

}
