package day7;

import java.util.List;

public interface BoardDAO {

	// 게시글 추가
	public int insertBoard(Board board);

	// 게시글 수정
	public int updateBoard(Board board);

	// 게시글 삭제
	public int deleteBoard(long no);

	// 전체 조회
	public List<Board> selectBoardList();

	// 게시글 수에 따른 조회 ex)n보다 큰 경우
	public List<Board> selectBoardHitList(long hit);

	// 게시글 1개 조회
	public Board selectBoardOne(long no);

}
