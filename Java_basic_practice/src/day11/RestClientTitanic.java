package day11;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.Document;
import org.json.JSONArray;
import org.json.JSONObject;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.InsertManyResult;

import day8.Config;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class RestClientTitanic {
	private MongoCollection<Document> titanicCollection = null;
	
	final String URL = "https://raw.githubusercontent.com/AISPUBLISHING/dsfs-python/master/titanic.json";
	private String data = null;

	public RestClientTitanic() {
		// rest 데이터가져와서 data 변수에 추가하기
		try {
			OkHttpClient client = new OkHttpClient();
			Request request = new Request.Builder().url(URL).get().build();
			Response response = client.newCall(request).execute();

			if (response.isSuccessful()) {
				this.data = response.body().string().toString();

			}
			// 데이터베이스 접속하기
			MongoClient dbClient = MongoClients.create(Config.URL);
			this.titanicCollection = dbClient.getDatabase(Config.DBNAME).getCollection(Config.TITANICCOL);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<Titanic> paraseData() {
		List<Titanic> list = new ArrayList<>();
		// [ {0},{},{},{}....{n} ]
		JSONArray jary = new JSONArray(this.data);
		for (int i = 0; i < jary.length(); i++) {
			JSONObject jobj = jary.getJSONObject(i).getJSONObject("fields");

			Titanic t1 = new Titanic();

			t1.setFare(jobj.getDouble("fare"));
			t1.setName(jobj.getString("name"));
			t1.setAge(0.0d);
			t1.setCabin("정보없음.");
			t1.setParch(0);
			t1.setPclass(0);
			t1.setSex("정보없음.");
			t1.setSurvived("정보없음.");
			t1.setEmbarked("정보없음.");
			t1.setTicket("정보없음.");
			t1.setPassengerId(0);
			t1.setSibsp(0);

			if (!jobj.isNull("survived")) {
				t1.setSurvived(jobj.getString("survived"));
			}
			if (!jobj.isNull("pclass")) {
				t1.setPclass(jobj.getInt("pclass"));
			}
			if (!jobj.isNull("sex")) {
				t1.setSex(jobj.getString("sex"));
			}
			if (!jobj.isNull("age")) {
				t1.setAge(jobj.getDouble("age"));
			}
			if (!jobj.isNull("sibsp")) {
				t1.setSibsp(jobj.getInt("sibsp"));
			}
			if (!jobj.isNull("parch")) {
				t1.setParch(jobj.getInt("parch"));
			}
			if (!jobj.isNull("fare")) {
				t1.setFare(jobj.getDouble("fare"));
			}
			if (!jobj.isNull("ticket")) {
				t1.setTicket(jobj.getString("ticket"));
			}
			if (!jobj.isNull("cabin")) {
				t1.setCabin(jobj.getString("cabin"));
			}
			if (!jobj.isNull("passengerId")) {
				t1.setPassengerId(jobj.getInt("passengerId"));
			}
//			if (jobj.getString("embarked").equals("C")) {
//				t1.setEmbarked("셰르부르");
//			}
//			else if(jobj.getString("embarked").equals("Q")){
//				t1.setEmbarked("퀸스타운");
//			}
//			else if(jobj.getString("embarked").equals("S")){
//				t1.setEmbarked("사우샘프턴");
//			}  
			if (!jobj.isNull("embarked")) {
				t1.setEmbarked(jobj.getString("embarked"));
			}
			list.add(t1);
		}
		return list;
	}

	public void saveMongodDB() {
		List<Titanic> list = this.paraseData();
		//List<Titanic>  => List<Document>
		List<Document> saveList = new ArrayList<Document>();
		for( Titanic tmp : list ) {
			Document doc = new Document();
			doc.append("fare", tmp.getFare());
			doc.append("survived", tmp.getSurvived());
			doc.append("pclass", tmp.getPclass());
			doc.append("sex", tmp.getSex());
			doc.append("sibsp", tmp.getSibsp());
			doc.append("parch", tmp.getParch());
			doc.append("ticket", tmp.getTicket());
			doc.append("cabin", tmp.getCabin());
			doc.append("embarked", tmp.getEmbarked());
			doc.append("name", tmp.getName());
			doc.append("passengerid", tmp.getPassengerId());
			doc.append("age", tmp.getAge());
			doc.append("regdate", new Date());
			doc.append("age", tmp.getAge());

			saveList.add(doc);
		}
		
		InsertManyResult result = titanicCollection.insertMany( saveList );
		System.out.println(result);
	}
}
