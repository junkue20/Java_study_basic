package day9;

import java.util.Date;

import day7.Board;

public class Main {

	public static void main(String[] args) {
		try {
			// 1. 접속, 컬렉션2개 객체 변수보관
			ReplyDB replyDB = new ReplyDBImpl();
			replyDB.selectReplyOne(111);
/*-----------------------------------------------------------------------------------------------------*/
			/*
			// 답글 쓰기 테스트
			Reply reply = new Reply();
			reply.setContent("content2");
			reply.setWriter("writer2");
			reply.setRegdate(new Date()); // String => long

			Board board = new Board();
			board.setBrdNo(1L);

			reply.setBoard(board);

			// 2. 추가하는 메소드
			short ret = replyDB.insertReply(reply);

			System.out.println(ret);
			*/
/*-----------------------------------------------------------------------------------------------------*/

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
