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
	public int insertItemMap(Map<String, Object> map) {
		try {
			Bson filter = Filters.eq("_id", "SEQ_ITEMS_NO");
			Bson update = Updates.inc("idx", 1);
			Document doc = this.sequence.findOneAndUpdate(filter, update);
			long itemcode = doc.getLong("idx");

			Document saveDoc = new Document();
			saveDoc.append(null, saveDoc);
			this.items.insertOne(doc);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;

		}

	}

}
