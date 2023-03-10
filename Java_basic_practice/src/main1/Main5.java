/*---------------------------------------------------------*/

package main1;

import java.util.Date;
// import는 남겨둬야 date 사용이 가능

import cls.Board;

public class Main5 {

	public static void main(String[] args) {
		// 1. 객체 생성
		Board brd = new Board();

		// 2. 객체를 기반으로 메소드를 사용해서 적절한 일을 수행
		brd.setBrdNo(1L);
		brd.setBrdTitle("첫 게시글");
		brd.setBrdContent("안녕하세요");
		brd.setBrdWriter("박준규");
		brd.setBrdHit(44091L);
		// Date date = new Date (); 생략가능

		brd.setBrdDate(new Date());

		// 3.현재의 값을 반환 후 출력.
		System.out.println(brd.toString());

	}

}
/*---------------------------------------------------------*/
