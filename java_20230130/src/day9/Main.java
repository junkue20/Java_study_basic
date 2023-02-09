package day9;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		try {
			/*----------답글의 갯수가 n개인 게시글 조회-----------------------------------------------------------------------------------*/
//			BoardDAO boardDAO = new BoardDAOImpl();
//			List<Board> list = boardDAO.selectBoardReplyCount(1);
//			for (Board board : list) {
//				System.out.println("┌---------------┐");
//				System.out.println("게시글번호 => " + board.getBrdNo());
//				System.out.println("게시글제목 => " + board.getBrdTitle());
//				System.out.println("게시글작성자 => " + board.getBrdContent());
//				System.out.println("게시글조회수 => " + board.getBrdHit());
//				System.out.println("게시글 날짜 => " + board.getBrdDate());
//				System.out.println("└---------------┘");
//			}
			
			/*-------댓글갯수 및 답글 번호 조회--------------------------------------------------------------------------------------*/
//			BoardDAO boardDAO = new BoardDAOImpl();
//			List<Board> list = boardDAO.selectBoardList();
//			for(Board board : list) {
//				System.out.println("┌---------------┐");
//				System.out.println("게시글번호 => " + board.getBrdNo());
//				System.out.println("게시글제목 => " + board.getBrdTitle());
//				System.out.println("게시글작성자 => " + board.getBrdContent());
//				System.out.println("게시글조회수 => " + board.getBrdHit());
//				System.out.println("게시글 날짜 => " + board.getBrdDate());
//				System.out.println("댓글 갯수 => " + board.getReplyCount());
//				System.out.println("답글 번호는 => ");
//				for(int i=0; i<board.getReplyNolist().size();i++) {
//				System.out.println(board.getReplyNolist().get(i) + ", ");
//				}
//				System.out.println("└---------------┘");
//			}
//			
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
			 * 
			 * Board board = new Board(); board.setBrdNo(1L);
			 * 
			 * reply.setBoard(board); short ret = replyDB.insertReply(reply);
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

			/*---------댓글 수정하기--------------------------------------------------------------------------------------*/
//			ReplyDB replyDB = new ReplyDBImpl();
//			Reply reply = new Reply();
//			
//			System.out.print("조회할 글의 번호를 입력 해주세요. : ");
//			Scanner sc = new Scanner(System.in);
//			reply.setNo(sc.nextShort());
//			System.out.print("수정할 글의 내용을 입력 해주세요. : ");
//			reply.setContent(sc.next());
//			System.out.print("수정할 글의 작성자를 입력 해주세요. : ");
//			reply.setWriter(sc.next());
//			sc.close();
//
//			short ret = replyDB.updateReply(reply);
//
//			System.out.println(ret);

		    /*---------게시판 번호 불러와서 수정하기--------------------------------------------------------------------------------------*/

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
