package day11;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.json.JSONArray;
import org.json.JSONObject;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

import day8.Config;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class RestClientTitanic {
	private MongoCollection<Document> titanic = null;
	private MongoCollection<Document> sequence = null;

	final String URL = "https://raw.githubusercontent.com/" + "AISPUBLISHING/dsfs-python/master/titanic.json";
	private String data = null;

	public RestClientTitanic() {

		this.sequence = MongoClients.create(Config.URL).getDatabase(Config.DBNAME).getCollection(Config.RESEQUENCECOL);
		this.titanic = MongoClients.create(Config.URL).getDatabase(Config.DBNAME).getCollection(Config.TITANICOL);

		try {
			OkHttpClient client = new OkHttpClient();
			Request request = new Request.Builder().url(URL).get().build();
			Response response = client.newCall(request).execute();

			if (response.isSuccessful()) {
				this.data = response.body().string().toString();

			}
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

			t1.setFare(jobj.getFloat("fare"));
			t1.setName(jobj.getString("name"));
			t1.setAge(0.0f);
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
				t1.setAge(jobj.getFloat("age"));
			}
			if (!jobj.isNull("sibsp")) {
				t1.setSibsp(jobj.getInt("sibsp"));
			}
			if (!jobj.isNull("parch")) {
				t1.setParch(jobj.getInt("parch"));
			}
			if (!jobj.isNull("fare")) {
				t1.setFare(jobj.getFloat("fare"));
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
//				System.out.println("셰르부르");
//			}
//			else if(jobj.getString("embarked").equals("Q")){
//				System.out.println("퀸스타운");
//			}
//			else if(jobj.getString("embarked").equals("S")){
//				System.out.println("사우샘프턴");
//			}  // 강사님께 2/14일에 질문하기. 
			if (!jobj.isNull("embarked")) {
				t1.setEmbarked(jobj.getString("embarked"));
			}
			list.add(t1);
		}
		return list;
	}

	public void saveMongoDB() {
		try {
			Document doc = this.sequence.findOneAndUpdate
					(Filters.eq("_id", "SEQ_TITANIC_CODE"), Updates.inc("idx", 1));
			long code = doc.getLong("idx");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
