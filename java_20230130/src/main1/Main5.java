/*---------------------------------------------------------*/

package main1;

import java.util.Date;

import cls.Board;

public class Main5 {

	public static void main(String[] args) {

		Board brd = new Board();
		Date date = new Date();

		brd.setBrdNo(1L);
		brd.setBrdTitle("첫 게시글");
		brd.setBrdContent("안녕하세요");
		brd.setBrdWriter("박준규");
		brd.setBrdHit(44091L);

		brd.setBrdDate(date);

		System.out.println(brd.toString());
		
	}

}
/*---------------------------------------------------------*/
