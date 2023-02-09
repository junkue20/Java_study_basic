package day9;

import java.util.List;
import java.util.Vector;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;

import day8.Config;

public class ReplyDBImpl implements ReplyDB {
	/*------------------------------------------변수 지정.--------------------------------------*/

	private MongoCollection<Document> sequence = null;
	private MongoCollection<Document> replies = null;

	// 생성자
	// DB접속 및 컬렉션 선택
	public ReplyDBImpl() {
		try {// 몽고DB -> 접속URL -> DB이름
			MongoClient client = MongoClients.create(Config.URL);
			MongoDatabase db = client.getDatabase(Config.DBNAME);
			sequence = db.getCollection(Config.RESEQUENCECOL);
			replies = db.getCollection(Config.REPLYCOL);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*------------------------day8일차 BookDBlmpl을 참고함.------------------------*/
//		try {// 몽고DB -> 접속URL -> DB이름
//		MongoDatabase db = MongoClients.create(Config.URL).getDatabase(Config.DBNAME);
//		this.sequence = db.getCollection(Config.RESEQUENCECOL);
//		this.replies = db.getCollection(Config.REPLYCOL);
//	} catch (Exception e) {
//		e.printStackTrace();
//	    }
//	}
	/*-----------------------------------------------------------------------------------------------------*/

	// 댓글 입력
	@Override
	public short insertReply(Reply reply) throws Exception {

		Document doc = sequence.findOneAndUpdate(Filters.eq("_id", "SEQ_REPLY_NO"), Updates.inc("idx", 2));
		// Document{{_id=SEQ_REPLY_NO, idx=210}}
		System.out.println(doc.toString());
		long idx = doc.getInteger("idx");

		Document doc1 = new Document().append("_id", idx).append("content", reply.getContent())
				.append("writer", reply.getWriter()).append("regdate", reply.getRegdate())
				// 전체적인 데이터를 추가하는것이 아니라, 기본키정보(게시글번호)만 DB에 추가함.
				.append("board", reply.getBoard().getBrdNo());

		// DB에 데이터가 정확하게 추가되면 반환값으로 답글번호를 반환.
		InsertOneResult result = this.replies.insertOne(doc1);

		System.out.println(result.toString());
		if (result.getInsertedId().asInt64().getValue() == idx) {
			return 1;
		}
		return 0;

	}
	/*-----------------------------------------------------------------------------------------------------*/

	// 수정
	@Override
	public short updateReply(Reply reply) throws Exception {
		
		// 변경하고자 하는 항목의 조건
		Bson filter = Filters.eq("_id", reply.getNo());
		// 변경할 항목들 "내용, 작성자"
		Bson update1 = Updates.set("content", reply.getContent());
		Bson update2 = Updates.set("writer", reply.getWriter());
		// updateOne (조건, 변경값) => 변경값이 하나의 Bson에만 가능.. combine
		Bson update = Updates.combine(update1, update2);
		UpdateResult result = this.replies.updateOne(filter, update);
		if (result.getModifiedCount() == 1) {
			return 1;
		}
		return 0;
	}
	/*-----------------------------------------------------------------------------------------------------*/

	// 삭제
	@Override
	public short deleteReply(long no) throws Exception {

		Bson filter = Filters.eq("_id", no);
		DeleteResult result = this.replies.deleteOne(filter);
		System.out.println(result.toString());
		if (result.getDeletedCount() == 1L) {
			return 1;

		}
		return -1;
	}

	/*-----------------------------------------------------------------------------------------------------*/

	// 한개 가져오기
	// replyno는 답글번호
	@Override
	public Reply selectReplyOne(long replyNo) {
		try {
			// doc값이 null경우는 해당하는 답글이 없음.
			// doc값이 null아니면 해당하는 답글이 존재한다.
			Document doc = this.replies.find(Filters.eq("_id", replyNo)).first();
			if (doc != null) { // Document -> Reply 타입으로 복사한 후 리턴
				Reply reply = new Reply();
				reply.setNo(doc.getLong("_id"));
				reply.setContent(doc.getString("dontent"));
				reply.setWriter(doc.getString("writer"));
				reply.setRegdate(doc.getDate("regdate"));

				Board board = new Board();
				board.setBrdNo(doc.getLong("board"));

				reply.setBoard(board);

				return reply;
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	/*-----------------------------------------------------------------------------------------------------*/

	// 문제 ) 원본게시글 번호를 전달하면 해당하는 모든 답글을 반환하기.
	@Override
	public List<Reply> selectReplyList(long boardNo) {
		try {
			Bson filter = Filters.eq("board", boardNo);
			Bson sort = Filters.eq("_id", -1);

			this.replies.find(filter).sort(sort);
			FindIterable<Document> docs = this.replies.find(filter).sort(sort);
			// FindIterable<Document> => List<Reply>

			// 인터페이스<> 객체명 = new 컬렉션 클래스();
			List<Reply> list = new Vector<Reply>();
			for (Document doc : docs) {
				Reply reply = new Reply();
				reply.setNo(doc.getLong("_id"));
				reply.setContent(doc.getString("dontent"));
				reply.setWriter(doc.getString("writer"));
				reply.setRegdate(doc.getDate("regdate"));
				reply.setBoard(null);

				list.add(reply);
//			// doc값이 null경우는 해당하는 답글이 없음.
//			// doc값이 null아니면 해당하는 답글이 존재한다.
//			Document doc = this.replies.find(Filters.eq("_id", boardNo)).first();
//			if (doc != null) { // Document -> Reply 타입으로 복사한 후 리턴
//				Reply reply = new Reply();
//				reply.setNo(doc.getLong("_id"));
//				reply.setContent(doc.getString("dontent"));
//				reply.setWriter(doc.getString("writer"));
//				reply.setRegdate(doc.getDate("regdate"));
//
//				// board를 찾을껀데 굳이 할 필요가 있을까 
////				Board board = new Board();
////				board.setBrdNo(doc.getLong("board"));
////				reply.setBoard(board);
//
//				return (List<Reply>) reply; //List<Reply> 반환타입? 

			}
			if (!list.isEmpty()) {
				return list;
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
	/*-----------------------------------------------------------------------------------------------------*/

}
