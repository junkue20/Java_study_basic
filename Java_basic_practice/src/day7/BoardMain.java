package day7;

import java.util.List;

import day9.BoardDAOImpl;

public class BoardMain {

	public static void main(String[] args) {
		// 설계도면 obj = new 구현한클래스의생성자();
		BoardDAOImpl obj = new BoardDAOImpl();

		/*--------- 글번호와 제목 내용 작성자 전송하면 해당 글번호의 제목 내용 작성자를 변경하기-------*/

//		Board board = new Board();
//		board.setBrdNo(1);
//		board.setBrdTitle("새로운 제목");
//		board.setBrdContent("새로운 내용");
//		board.setBrdWriter("새 작성자");
//	    int ret = obj.updateBoard(board);
//		System.out.println(ret);
//		
		/*----------------------- 삭제하기 --------------------------------*/

//		Board board = obj.deleteBoard(100);
//      System.out.println(board.toString());

		/*-----------------------hit 이하의 게시물만 조회-----------------------*/

		// 목록으로 전송됨. 목록은 반드시 반복문을 통해서 1개씩 출력해야 함.
//		long num = 10;
//
//		List<Board> list = obj.selectBoardHitList(num);
//
//		if (list.isEmpty()) {  // list가 현재 아무것도 지정되지 않은 ArrayList() 이기 때문에 .isEmpty 라는  
//			System.out.println(num + "이하의 값이 없음.");
//		} else {
//			for (Board one : list) {
//				System.out.println(one.getBrdNo() + ", " + one.getBrdTitle() + ", " + one.getBrdHit() + ", "
//						+ one.getBrdWriter() + ", " + one.getBrdDate());
//			}
//		}

		/*-------------------------전체글 조회--------------------------*/

//		List<Board> list = obj.selectBoardList();
//		// list의 값을 1개씩 꺼내서 one 변수 보관하는 방식
//		for (Board one : list) {
//			System.out.println(one.getBrdNo() + ", " + one.getBrdTitle() + ", " + one.getBrdHit() + ", "
//					+ one.getBrdWriter() + ", " + one.getBrdDate());
//
//		}
//		System.out.println();
//
//		// 배열의 위치를 이용하여 출력하는 방식 결과값은 위와 동일함.
//		for (int i = 0; i < list.size(); i++) {
//			Board one = list.get(i);
//			System.out.println(one.getBrdNo() + ", " + one.getBrdTitle() + ", " + one.getBrdHit() + ", "
//					+ one.getBrdWriter() + ", " + one.getBrdDate());
//		}
//	}

		/*------------------ 보드 선택하기 -------------------------*/

		// 숫자를 입력하면 값에 해당하는 글을 출력

//		System.out.println(obj.selectBoardOne(2));

		/*------------------글제목, 내용, 작성자 정보만 전달됨.-------------------*/

		// 고객이 입력한 내용에 해당
//	    
//		Board board = new Board();
//		board.setBrdTitle("제목1");
//		board.setBrdContent("내용1");
//		board.setBrdWriter("작성자1");
//		System.out.println(obj.insertBoard(board));

		/*--------------------------------------------------------------------*/

//

	}

}
