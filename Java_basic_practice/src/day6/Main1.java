package day6;

import java.util.Date;

public class Main1 {

	public static void main(String[] args) {
		MemberDB mDB = new MemberDB();
		
		mDB.printMembersName("가나다");
	    // 회원정보 삭제하기
//		int ret = mDB.deleteMember("bbb");  // 정보가 삭제되어도 1이 뜨는 문제 해결필요
//		System.out.println(ret);

	// 1. 객체 생성
	// DB에 접속하고 members collection 접속
/*		mDB.printMembers();
		System.out.println();
		mDB.printMembersName("가나다"); 
	 문제 1 실행
	mDB.printMembersRole("C");
	System.out.println();
	// 문제 2 실행
	mDB.printMembersAge(100);   
	// 2. 회원가입하고 싶은 임시 데이터 (아이디,암호,이름,나이,연락처,권한,현재시간)
	
	// 회원정보 수정하기
	Member member = new Member();
	member.setId("bbb");
	member.setName("abcd");
	member.setPhone("010-3455-6778");
	member.setAge(33);
	
	int ret = mDB.updateMember(member); //성공하면 1, 실패시 -1
	System.out.println(ret);    */
	
//	Member member = new Member("43", "40000", "가나다", 19, "010-0020-0001", "C", new Date());
	
//  3. DB에 추가하는 메소드 수행
//	int ret = mDB.insertMember(member); //성공하면 1, 실패시 -1
//	System.out.println(ret);
	}
	
}
