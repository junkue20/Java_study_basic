package day9;

import java.util.List;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import day8.Config;

public class ReplyDBImpl implements ReplyDB {
	/*---------------------변수 지정.----------------------*/

	private MongoCollection<Document> sequence = null;
	private MongoCollection<Document> replies = null;

	// DB접속 및 컬렉션 선택
	public ReplyDBImpl() {
		try {// 몽고DB -> 접속URL -> DB이름
			MongoClient client = MongoClients.create(Config.URL);
			MongoDatabase db = client.getDatabase(Config.DBNAME);
			this.sequence = db.getCollection(Config.RESEQUENCECOL);
			this.replies = db.getCollection(Config.REPLYCOL);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
/*----------------------------------------------day8일차 BookDBlmpl을 참고함.------------------------------------------*/

//		try {// 몽고DB -> 접속URL -> DB이름
//		MongoDatabase db = MongoClients.create(Config.URL).getDatabase(Config.DBNAME);
//		this.sequence = db.getCollection(Config.RESEQUENCECOL);
//		this.replies = db.getCollection(Config.REPLYCOL);
//	} catch (Exception e) {
//		e.printStackTrace();
//	    }
//	}
	
/*----------------------------------------------------------------------------------------------------------------*/
	//
	@Override
	public short insertReply(Reply reply) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public short updateReply(Reply reply) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public short deleteReply(long no) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Reply selectReplyOne(long no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reply> selectReplyList() {
		// TODO Auto-generated method stub
		return null;
	}

}
