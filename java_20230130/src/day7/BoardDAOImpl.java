package day7;

import java.util.Date;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;

public class BoardDAOImpl implements BoardDAO {

	// 아이디:암호@서버주소:포트번호/DB명
	final String url = "mongodb://id209:pw209@1.234.5.158:37017/db209";
	private MongoCollection<Document> boardColl = null;
	private MongoCollection<Document> seqColl = null;

	public BoardDAOImpl() {
		try {
			// 설계도면 객체 = 클래스명.정적메소드()
			// 정적메소드는 객체가 1개만 생성되기때문에 리소스 낭비가 없다.
			MongoClient client = MongoClients.create(url);
			if (client != null) {
				this.boardColl = client.getDatabase("db209").getCollection("boards");
				this.seqColl = client.getDatabase("db209").getCollection("sequence");

				System.out.println("DB접속 성공.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB접속 실패.");
		}
	}

	// 글제목, 내용, 작성자 정보만 전달됨.
	// 글번호(시퀀스), 조회수 1, 등록일자는 현재시간
	@Override
	public int insertBoard(Board board) {
		try {
			// 시퀀스를 이용한 idx 값을 받고 idx를 1 증가 시키기
			Bson filter = Filters.eq("_id", "SEQ_BOARD_NO");
			Bson update = Updates.inc("idx", 1);

			// 초기값 1을 가져오고 2로 바꿔줌. (findOneAndUpdate)
			Document doc = this.seqColl.findOneAndUpdate(filter, update);

			// 받은 idx값으로 글번호를 설정하기
			board.setBrdNo(doc.getLong("idx"));
			board.setBrdHit(100L);
			board.setBrdDate(new Date());

			// Board 타입의 값들을 Document로 복사하세요.
			Document doc1 = new Document();
			doc1.append("_id", board.getBrdNo());
			doc1.append("title", board.getBrdTitle());
			doc1.append("content", board.getBrdContent());
			doc1.append("writer", board.getBrdWriter());
			doc1.append("hit", board.getBrdHit());
			doc1.append("reg date", board.getBrdDate());

			InsertOneResult result = this.boardColl.insertOne(doc1);
			System.out.println(result);
			if (result.getInsertedId().asInt64().getValue() == board.getBrdNo()) {
				return 1; // 정확하게 데이터가 추가된 경우 1을 반환
			}
			return 0; // 실행은 되었으니 추가하지 못한 경우에 0을 반환.
		} catch (Exception e) {
			e.getStackTrace();
			return -1;
		}
	}

	// 업데이트
	@Override
	public int updateBoard(Board board) {
		try {
			// 변경하고자 하는 항목의 조건
			Bson filter = Filters.eq("_id", board.getBrdNo());
			// 변경할 항목들 "제목, 내용, 작성자"
			Bson update1 = Updates.set("title", board.getBrdTitle());
			Bson update2 = Updates.set("content", board.getBrdContent());
			Bson update3 = Updates.set("writer", board.getBrdWriter());

			// updateOne (조건, 변경값) => 변경값이 하나의 Bson에만 가능.. combine
			Bson update = Updates.combine(update1, update2, update3);
			UpdateResult result = this.boardColl.updateOne(filter, update);
			System.out.println(result.toString());

			if (result.getUpsertedId().asInt64().getValue() == board.getBrdNo()) {
				return 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		return -1;
	}

	// 삭제하기
	@Override
	public int deleteBoard(long no) {
		try {
			Bson filter = Filters.eq("_id", no);
			DeleteResult result = this.boardColl.deleteOne(filter);
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

	// 전제 글조회
	@Override
	public List<Board> selectBoardList() {
		List<Board> list = this.boardColl.find().cursor();

		return null;
	}

	// hit 이상의 게시물만 조회
	@Override
	public List<Board> selectBoardhitList(long hit) {
		List<Board> list = this.boardColl.(hit).iterator();

		Bson filter = Filters.gte("hit", hit);
		printInfo(filter);

	}

	// 보드 선택하기
	@Override
	public Board selectBoardOne(long no) {
		
		return null;
	}
	
	// 출력문
	public void printInfo(Bson filter) {
		MongoCursor<Document> list = this.boardColl.find(filter).iterator();
		while (list.hasNext()) {
			Document doc = list.next();
			System.out.println("글번호 : " + doc.getString("_id"));
			System.out.println("제목 : " + doc.getString("title"));
			System.out.println("내용 : " + doc.getString("content"));
			System.out.println("글쓴이 : " + doc.getString("writer"));
			System.out.println("------------------------------------");
		}
	}

}
