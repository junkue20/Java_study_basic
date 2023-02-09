package day9;

import day7.Board;

public class Main {

	public static void main(String[] args) {
		try {
			/*-------댓글조회--------------------------------------------------------------------------------------*/

			// 답글번호 한개 조회하기
			// 입력기능 추가
//			System.out.print("조회 할 답글번호를 눌러주세요. : ");
//			Scanner sc = new Scanner(System.in);
//            
//			ReplyDB replyDB = new ReplyDBImpl();
//		    Reply reply = replyDB.selectReplyOne(sc.nextLong()); // 해당 번호의 글 불러오기
//		    if(reply!=null) {
//			System.out.println("┌---------------------------------------┐");
//			System.out.println("답글번호 => " + reply.getNo());
//			System.out.println("답글내용 => " + reply.getContent());
//			System.out.println("답글작성자 => " + reply.getWriter());
//			System.out.println("답글일자 => " + reply.getRegdate());
//			System.out.println("원본게시글 정보 => " + reply.getNo());
//			System.out.println("└---------------------------------------┘");
//			}
			/*-----------------------------------------------------------------------------------------------------*/
			/*
			 * // 답글 쓰기 테스트 Reply reply = new Reply(); reply.setContent("content2");
			 * reply.setWriter("writer2"); reply.setRegdate(new Date()); // String => long
			 * Board board = new Board(); board.setBrdNo(1L);
			 * 
			 * reply.setBoard(board);
			 * 
			 * // 2. 추가하는 메소드 short ret = replyDB.insertReply(reply);
			 * 
			 * System.out.println(ret);
			 */
			/*-------게시글번호의 댓글 조회----------------------------------------------------------------------------------------*/

//			ReplyDB replyDB = new ReplyDBImpl();
//			List<Reply> list = replyDB.selectReplyList(4L); // 해당 번호의 글 불러오기
//			for (Reply one : list) {
//				System.out.println("┌---------------------------------------┐");
//				System.out.println("답글번호 => " + one.getNo());
//				System.out.println("답글내용 => " + one.getContent());
//				System.out.println("답글작성자 => " + one.getWriter());
//				System.out.println("답글일자 => " + one.getRegdate());
//				System.out.println("└---------------------------------------┘");
//			}

			/*---------삭제하기---------------------------------------------------------------------------------------*/

//			ReplyDB obj = new ReplyDBImpl();
//			obj.deleteReply(231);
			
			/*---------게시글 수정하기--------------------------------------------------------------------------------------*/
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
