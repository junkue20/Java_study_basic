package day14;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;

import day8.Config;

public class BoardDBImpl implements BoardDB {
	
	MongoCollection<Document> sequence = null;
	MongoCollection<Document> boards = null;

	public BoardDBImpl() {
		
		this.boards = DBconn.getInstance().getCollection(Config.BOARDCOL);
		this.sequence = DBconn.getInstance().getCollection(Config.RESEQUENCECOL);
	}

	/*---------------------------------------------------------------------------------------------------*/
	// 게시판 글쓰기
	@Override
	public int insertBoardOne(day14.Board board) {
		try {
			Bson filter = Filters.eq("_id", "SEQ_BOARD_NO");
			Bson update = Updates.inc("idx", 1);
			Document doc = this.sequence.findOneAndUpdate(filter, update);

			
			Document doc1 = new Document();
			doc1.append("_id", doc.getLong("idx"));
			doc1.append("title", board.getTitle());
			doc1.append("writer", board.getWriter());
			doc1.append("content", board.getContent());
			doc1.append("hit", board.getHit());
			doc1.append("reg date", board.getRegdate());

			InsertOneResult result = this.boards.insertOne(doc1);
			if (result.getInsertedId().asInt64().getValue() == doc1.getLong("_id")) {
				return 1;
			}
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
		
	}

	/*---------------------------------------------------------------------------------------------------*/

	// 게시판 조회 (최신글순으로 10개씩, 페이지네이션)
	@Override
	public List<day14.Board> selectBoardList(int page) {
		List<day14.Board> list = new ArrayList<>();
		try {
			Bson sort = Filters.eq("_id", -1);
			FindIterable<Document> docs = this.boards.find().sort(sort).skip(10 * (page - 1)).limit(10);
			for (Document doc : docs) {
				day14.Board board = new day14.Board();
				board.setNo(doc.getLong("_id"));
				board.setTitle(doc.getString("title"));
				board.setWriter(doc.getString("writer"));
				board.setContent(doc.getString("content"));
				board.setHit(doc.getLong("hit"));
				board.setRegdate(doc.getDate("reg date"));

				list.add(board);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	/*---------------------------------------------------------------------------------------------------*/

	// 게시판 수정 (제목, 내용만 변경)
	@Override
	public int updateBoardOne(day14.Board board) {
		try {
			Bson filter = Filters.eq("_id", board.getNo());

			Bson up1 = Updates.set("title", board.getTitle());
			Bson up2 = Updates.set("content", board.getContent());

			Bson update = Updates.combine(up1, up2);
			UpdateResult result = this.boards.updateOne(filter, update);
			if (result.getModifiedCount() == 1) {
				return 1;
			}
			return 0;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	/*---------------------------------------------------------------------------------------------------*/

	// 게시판 1개 조회
	@Override
	public day14.Board selectBoardOne(int num) {
		day14.Board board = new day14.Board();
		try {
			Bson filter = Filters.eq("_id", num);
			Document doc = this.boards.find().filter(filter).first();
			board.setNo(doc.getLong("_id"));
			board.setTitle(doc.getString("title"));
			board.setWriter(doc.getString("writer"));
			board.setContent(doc.getString("content"));
			board.setHit(doc.getLong("hit"));
			board.setRegdate(doc.getDate("reg date"));

			return board;
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
			Bson filter = Filters.eq("_id", num);
			DeleteResult result = this.boards.deleteOne(filter);
			System.out.println(result.toString());
			if (result.getDeletedCount() == 1L) {
				return 1;
			}
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}

	}

	/*---------------------------------------------------------------------------------------------------*/
}
