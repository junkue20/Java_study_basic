package day13;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;

import day8.Config;

public class ItemDBImpl implements ItemDB {

	private MongoCollection<Document> sequence = null;
	private MongoCollection<Document> items = null;

	public ItemDBImpl() {
		try {
			this.sequence = MongoClients.create(Config.URL).getDatabase(Config.DBNAME)
					.getCollection(Config.RESEQUENCECOL);
			this.items = MongoClients.create(Config.URL).getDatabase(Config.DBNAME).getCollection(Config.ITEMCOL);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Map<String, Object>> selecItemListMap(int n) {
		try {
			Bson sort = Filters.eq("_id", -1);
			FindIterable<Document> docs = this.items.find().sort(sort).limit(n);

			List<Map<String, Object>> list = new ArrayList<>();
			for (Document doc : docs) {
				Map<String, Object> map = new HashMap<>();
				map.put("_id", doc.getLong("_id"));
				map.put("name", doc.getString("name"));
				map.put("content", doc.getString("content"));
				map.put("price", doc.getLong("price"));
				map.put("quantity", doc.getLong("quantity"));
				map.put("regdate", doc.getDate("regdate"));

				// doc 를 map으로 변환하기
				list.add(map);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int insertItemMap(Map<String, Object> map) { // 전달받은 map 값을 대입.
		try {
			// items의 시퀀스값을 높여주기 위함.
			Bson filter = Filters.eq("_id", "SEQ_ITEMS_NO");
			Bson update = Updates.inc("idx", 1);
			Document doc = this.sequence.findOneAndUpdate(filter, update);
			long itemCode = (long) doc.getInteger("idx"); // 현재 DB에 저장된 idx값이 int타입이기 때문에 변환이 필요.
// -------------------------------------------------------------------------
			Document saveDoc = new Document();
			saveDoc.append("_id", itemCode); // 시퀀스에서 꺼낸값
			saveDoc.append("name", map.get("name"));
			saveDoc.append("content", map.get("content"));
			saveDoc.append("price", map.get("price"));
			saveDoc.append("quantity", map.get("quantity"));
			saveDoc.append("regdate", new Date()); // 현재시간
// -------------------------------------------------------------------------
			InsertOneResult result = this.items.insertOne(saveDoc); // 저장된 위의 정보들을 DB에 저장.
			if (result.getInsertedId().asInt64().getValue() == itemCode) {
				return 1;
			}
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;

		}

	}

	@Override
	public int deleteItemOne(long no) {
		try {
			Bson filter = Filters.eq("_id", no);
			DeleteResult result = this.items.deleteOne(filter);

			return 1;
		}

		catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	public int deleteItemMany(long[] no) {
		try {
			int cnt = 0;

			// long[] no = {1,2,5,6}
			for (int i = 0; i < no.length; i++) {
				Bson filter = Filters.eq("_id", no[i]);
				DeleteResult result = this.items.deleteOne(filter);
				cnt += result.getDeletedCount();
			}
			// 삭제한 갯수 == 배열의 갯수
			if (cnt == no.length) {
				return 1;
			}
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;

		}
	}

	@Override // 물품 수정 (name, content, price, quantity)를 변경하기
	public int updateItemOne(Item item) {
		try {
			int cnt = 0;
			for (int i = 0; i < item.getNo(); i++) {
//		     	Document doc = new Document();
				Bson filter = Filters.eq("_id", item.getNo());
				Bson update1 = Updates.set("name", item.getName());
				Bson update2 = Updates.set("content", item.getContent());
				Bson update3 = Updates.set("price", item.getPrice());
				Bson update4 = Updates.set("quantity", item.getQuantity());
				Bson update = Updates.combine(update1, update2, update3, update4);
				UpdateResult result = this.items.updateOne(filter, update);
				if (result.getModifiedCount() == 1) {
					return 1;
				}
			}
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;

		}
	}

	// n개 목록 불러오기
	@Override
	public List<Item> selectItemList(int n) {
		try {
			Bson sort = Filters.eq("_id", -1);
			FindIterable<Document> docs = this.items.find().sort(sort).limit(n);

			List<Item> list = new ArrayList<>();
			for (Document doc : docs) {
				Item item = new Item();
				item.setNo(doc.getLong("_id"));
				item.setName(doc.getString("name"));
				item.setContent(doc.getString("content"));
				item.setPrice(doc.getLong("price").intValue());
				item.setQuantity(doc.getLong("quantity").intValue());
				item.setDate(doc.getDate("regdate"));

				// item 을 list로 변환하기
				list.add(item);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
}
