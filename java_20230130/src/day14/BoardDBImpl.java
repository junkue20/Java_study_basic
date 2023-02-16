package day14;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.InsertOneResult;

import day8.Config;
import day9.Board;

public class BoardDBImpl implements BoardDB {

	MongoCollection<Document> boards = null;

	public BoardDBImpl() {
		boards = DBconn.getInstance().getCollection(Config.BOARDCOL);
	}

	/*---------------------------------------------------------------------------------------------------*/
	// 게시판 글쓰기
	@Override
	public int insertBoardOne(day14.Board board) {
		try {
			Bson filter = Filters.eq("_id", "SEQ_BOARD_NO");
			Bson update = Updates.inc("idx", 1);

			Document doc = this.boards.findOneAndUpdate(filter, update);

			Document doc1 = new Document();
			doc1.append("_id", board.getNo());
			doc1.append("title", board.getTitle());
			doc1.append("writer", board.getWriter());
			doc1.append("content", board.getContent());
			doc1.append("hit", board.getHit());
			doc1.append("reg date", board.getRegdate());

			InsertOneResult result = this.boards.insertOne(doc);
			System.out.println(result);
			if (result.getInsertedId().asInt64().getValue() == board.getNo()) {
				return 1;
			}
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	/*---------------------------------------------------------------------------------------------------*/

	// 게시판 조회 (최신글순으로 10개씩, 페이지네이션)
	@Override
	public List<day14.Board> selectBoardList(int page) {
		List<day14.Board> list = new ArrayList<>();

		try {
			Bson sort = Filters.eq("_id", -1);

			return null;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/*---------------------------------------------------------------------------------------------------*/

	// 게시판 수정 (제목, 내용만 변경)
	@Override
	public int updateBoardOne(day14.Board board) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	/*---------------------------------------------------------------------------------------------------*/

	// 게시판 1개 조회
	@Override
	public day14.Board selectBoardOne(int num) {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/*---------------------------------------------------------------------------------------------------*/

	// 게시판 삭제
	@Override
	public int deleteBoardOne(long num) {
		try {
			return 1;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

	}

	/*---------------------------------------------------------------------------------------------------*/

}
