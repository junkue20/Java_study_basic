package webmapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import webdto.Board;

@Mapper
public interface BoardMapper {

	// 글쓰기
	@Insert( value = { 
			"	INSERT INTO board( title, content, writer)	",
			"	VALUES( #{obj.title}, #{obj.content}, #{obj.writer}  )	" 
			} )
	public int insertBoard(@Param("obj") Board board);
	
//	-------------------------------------------------------------------------
	
	// 전체목록
	@Select ( value = {
			"	SELECT * FROM board		"
	} )
	public List<Board> selectBoard();
	
	
//	-------------------------------------------------------------------------

	// 전체 갯수 (페이지네이션용)
	@Select ( value = {
			"	SELECT COUNT(*) cnt FROM board	"
	} )
	public long countBoardList ();
	
//	-------------------------------------------------------------------------

	// 10개씩 게시글 조회
	@Select( value = { 
			"  SELECT b.* FROM  ",
					"  ( SELECT b.*, ROW_NUMBER() OVER( ORDER BY no DESC ) rown FROM BOARD b ) b  ",
			"   WHERE   ",
					"  rown >= #{start} AND rown <= #{end} ",
			"  ORDER BY no DESC  "
	} )
	public List<Board> selectBoardList(@Param("start") int start, @Param("end") int end ); // 1, 2, 3, 4, 각 페이지당 10개씩

//	-------------------------------------------------------------------------
	
	// #{} => 값을 표현할 때
		// ${} => 컬럼명, 테이블명 등..
		@Select( value = { // 물품 검색
				"  SELECT * FROM board  ",
				"  WHERE ${column}  ",
				"  LIKE  '%' || #{text} || '%'  ",
				"  ORDER BY no DESC  "
		} )
		public List<Board> selectItemList(@Param("column") String column,@Param("text") String text );
		
//		-------------------------------------------------------------------------
}
