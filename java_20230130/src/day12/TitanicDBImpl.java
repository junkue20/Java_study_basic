package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;

import day11.Titanic;
import day8.Config;

public class TitanicDBImpl implements TitanicDB {
	private MongoCollection<Document> titanic = null;

	// 1. titanic 컬렉션 접속하기
	public TitanicDBImpl() {
		try {
			this.titanic = MongoClients.create(Config.URL).getDatabase(Config.DBNAME).getCollection(Config.TITANICCOL);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 전체조회
	@Override
	public List<Titanic> selectTitanicList() {
		try {
			// 반환 타입
			List<Titanic> list = new ArrayList<>();
			// _id (시퀀스 대신값)
			Bson sort = Filters.eq("fare", 1);
			// 원본 타입
			FindIterable<Document> docs = this.titanic.find().sort(sort);
			for (Document doc : docs) { // 원본데이터 반복
				Titanic titanic = new Titanic();
				// age가 원래 float이었으나, getFloat이 되지않아 double로 바꿈.
				// titanic.setAge(doc.getDouble("age").floatValue()); 도 가능!! (더블로 빼고 다시 float으로
				// 바꿔주기)
				titanic.setName(doc.getString("name"));
				titanic.setSurvived(doc.getString("survived"));
				titanic.setPclass(doc.getInteger("pclass"));
				titanic.setSex(doc.getString("sex"));
				titanic.setAge(doc.getDouble("age")); // float은 어떻게 받아와야할까
				titanic.setSibsp(doc.getInteger("sibsp"));
				titanic.setParch(doc.getInteger("parch"));
				titanic.setTicket(doc.getString("ticket"));
				titanic.setFare(doc.getDouble("fare"));
				titanic.setCabin(doc.getString("cabin"));
				titanic.setEmbarked(doc.getString("embarked"));
				titanic.setPassengerId(doc.getInteger("passengerid"));
				titanic.setDate(doc.getDate("regdate"));

				list.add(titanic);
			}
			return list;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// Map 방식 전체조회
	@Override
	public List<Map<String, Object>> selectTitaniListMap() {
		try {
			// 원본 타입
			FindIterable<Document> docs = this.titanic.find().sort(Filters.eq("fare", 1));
			// 빈 배열 list 선언
			List<Map<String, Object>> list = new ArrayList<>();
			for (Document doc : docs) {
				Map<String, Object> map = new HashMap<>(); // 형태가 Map<String, Object> 이기 때문에 key, value 대로 입력해준다.
				map.put("name", doc.getString("name"));
				map.put("survived", doc.getString("survived"));
				map.put("pclass", doc.getInteger("pclass"));
				map.put("sex", doc.getString("sex"));
				map.put("age", doc.getDouble("age")); // float은 어떻게 받아와야할까
				map.put("sibsp", doc.getInteger("sibsp"));
				map.put("parch", doc.getInteger("parch"));
				map.put("ticket", doc.getString("ticket"));
				map.put("fare", doc.getDouble("fare"));
				map.put("cabin", doc.getString("cabin"));
				map.put("embarked", doc.getString("embarked"));
				map.put("passengerid", doc.getInteger("passengerid"));
				map.put("regdate", doc.getDate("regdate"));
				list.add(map);
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

	//
	@Override
	public List<Titanic> selectTitanicAge(int n) { // n 값을 입력
		// 891개를 가
		Bson sort = Filters.eq("age", -1); // 내림차순 (나이 많은사람부터)
		List<Titanic> list = new ArrayList<>(); // 빈 배열 생성
		FindIterable<Document> docs = this.titanic.find().sort(sort).limit(n);

		for (Document doc : docs) { // 원본데이터 반복
			Titanic titanic = new Titanic();
			// age가 원래 float이었으나, getFloat이 되지않아 double로 바꿈.
			// titanic.setAge(doc.getDouble("age").floatValue()); 도 가능!! (더블로 빼고 다시
			// float으로바꿔주기)
			titanic.setName(doc.getString("name"));
			titanic.setSurvived(doc.getString("survived"));
			titanic.setPclass(doc.getInteger("pclass"));
			titanic.setSex(doc.getString("sex"));
			titanic.setAge(doc.getDouble("age")); // float은 어떻게 받아와야할까
			titanic.setSibsp(doc.getInteger("sibsp"));
			titanic.setParch(doc.getInteger("parch"));
			titanic.setName(doc.getString("ticket"));
			titanic.setFare(doc.getDouble("fare"));
			titanic.setCabin(doc.getString("cabin"));
			titanic.setEmbarked(doc.getString("embarked"));
			titanic.setPassengerId(doc.getInteger("passengerid"));
			titanic.setDate(doc.getDate("regdate"));

			list.add(titanic);
		}
		return list;

	}
}
