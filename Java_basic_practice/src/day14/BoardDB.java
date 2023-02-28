package day14;

import java.util.List;

public interface BoardDB {

	// 게시판 글쓰기
	public int insertBoardOne(Board board);

	// 게시판 조회 (최신글순으로 10개씩, 페이지네이션)
	public List<Board> selectBoardList(int page);

	// 게시판 수정 (제목, 내용만 변경)
	public int updateBoardOne(Board board);

	// 게시판 1개 조회
	public Board selectBoardOne(int num);

	// 게시판 삭제
	public int deleteBoardOne(long num);

}
