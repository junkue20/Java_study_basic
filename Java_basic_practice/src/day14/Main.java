package day14;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		MemberDB mDB = new MemberDBImpl();
		BoardDB bDB = new BoardDBImpl();
		
		
		// ------------------------------------------------------------
		// MongoClient db = MongoClient.create()~;
		DBconn db = DBconn.getInstance(); // 위와 똑같은 기능.
		// ------------------------------------------------------------

		
		
		/*------------------회원가입------------------------------------*/
		
//		Member m1 = new Member();
//
//		m1.setId("junkue30");
//		m1.setPassword("1234");
//		m1.setName("박준규");
//		m1.setAge(27);
//		m1.setPhone("010-0000-0000");
//		m1.setRegdate(new Date());
//
//		int ret = mDB.memberJoin(m1);
//		mDB.runMessage(ret);

	
		/*-------------------로그인------------------------------------*/
		/*복습해야할 부분*/
//		Map<String, Object> m2 = new HashMap<>();
//		m2.put("_id", "JunGyu2023");
//		m2.put("password", "비밀번호칸");
//		Member member = mDB.memberLogin(m2);
//		if(member == null) {
//			System.out.println("아이디 또는 암호가 틀립니다.");
//		}
//		else {
//			System.out.println(member.getName()+ "님 로그인 성공");
//		}
//		mDB.memberLogin(null);
		
		/*-----------------멤버한명고르기----------------------------------*/
////		
//		String id2 = "ccc4";
//		mDB.memberSelectOne(id2);
		
		/*-----------------멤버업데이트----------------------------------*/

//		Member m3 = new Member();
//		// 정보들을 수정할 아이디 입력
//		m3.setId("JunGyu2023"); 
//		// 변경할 정보들 입력
//		m3.setPassword("123412344"); 
//		m3.setPhone("010-1234-5678");
//		m3.setAge(27);
//		m3.setRole("C");
//		m3.setName("박준규");
//		
//		int ret3 = mDB.memberUpdateOne(m3);
//		mDB.runMessage(ret3);
		

		/*-----------------비번업데이트----------------------------------*/

//		Map<String, Object> m4 = new HashMap<>();
//		m4.put("_id", "junkue30");
////		m4.put("password", "1234");
//		m4.put("password1", "12341234");
//		int ret4 = mDB.memberUpdatePwOne(m4);
//		mDB.runMessage(ret4);

		
		/*-----------------멤버정보삭제----------------------------------*/

//		String id5 = "JunGyu2023";
//		
//		int ret5 = mDB.memberDeleteOne(id5);
//		mDB.runMessage(ret5);
		
		/*-------------------------------------------------------------------*/

	
		
		
		
		/*----------------------------------------------------*/
		/*----------------------Board 실습---------------------*/
		/*---------------------------------------------------*/
		
		
		
		/*-----------------게시판 글쓰기----------------------------------*/
		
//		day14.Board b1 = new day14.Board();
//		
//		b1.setTitle("16일 실습 n차");
//		b1.setWriter("junkue30");
//		b1.setContent("오늘 하루는 실습을 진행했어요~");
//		b1.setHit(345L);
//		b1.setRegdate(new Date());
//		
//		int ret1 = bDB.insertBoardOne(b1);
//		
//		System.out.println(ret1);
//		

		
		/*-----------------게시판조회(최신글순으로 10개씩, 페이지네이션)----------------------------------*/
		
//		int i2 = 1;
//		
//		List<day14.Board> list2 = bDB.selectBoardList(i2);
//		System.out.println(list2);
		
		
		/*-----------------게시판수정(제목, 내용만 변경)----------------------------------*/

//		day14.Board b3 = new day14.Board();
//		
//		b3.setNo(12);
//		b3.setTitle("제목 바꾸기");
//		b3.setContent("짠");
//		
//		int ret3 = bDB.updateBoardOne(b3);
//		System.out.println(ret3);
		
		/*-----------------게시판 1개조회----------------------------------*/
//        int i4 = 13;
//		day14.Board b4 = bDB.selectBoardOne(i4);
//		System.out.println(b4);
//		
		/*-----------------게시판 삭제----------------------------------*/

//		long l = 15;
//		
//		int ret5 = bDB.deleteBoardOne(l);
//		System.out.println(ret5);
		
		/*------------------------------------------------------------*/

		
		 
		  
		 
		 
		 
		  
		  
		 
		 
		 
		
		

		
		/*---------------필기한 내용들 ( 금요일 평가시험 출제문제임 )--------------------------------------------------------------*/
		
		
		
		// 확장자가 java로 만들어 짐. -> 컴파일 후 확장자는 class -> 실행 (Run을 누르면 순차적으로 진행됨)

		// 1바이트 = 8비트 ㅜㅜ
		
		
		// 원시타입
		// [논리형] boolean (8 bit)1 byte => 0과1로 구성
		// [정수형] short(2 byte), int(4 byte), long(8 byte),
		// [실수형] folat(4 byte), double(8 byte)
		// [문자형] char

		// 정수 / 정수 => 정수
		// 정수 / 실수 => 실수
//		int a = 14;
//		int b = 20;
//		float c = 6;
//
//		// 배열생성
//		int a1[] = new int[3]; // 배열 칸 수를 지정하기 
//      int[] a1 = new int[3];	
//		int[] a2 = { 1, 2, 3 }; // 값을 초기화시키기
//		

//		for(int i =0; i<3; i++) {   // 나중에 질문하기
//		System.out.println(a1[i]);
//		System.out.println(a3[i]);
//		}

		// 문자열의 비교
		// if(a == b), equals

		// static 메소드 (클래스명 . 찍고 불러옴)

		// 최대값, 최소값
		/*------------------------------------------------------------------------------------*/
		/*------------------------------------------------------------------------------------*/

	}

}
