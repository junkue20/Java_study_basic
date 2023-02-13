package day11;

import org.bson.Document;
import org.json.JSONObject;

import com.mongodb.client.MongoCollection;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

// rest api 서버 
// 정보를 제공해주는 문서의 종류, xml, json ... (문서에 대한 이해 필요)
// 영화진흥원 현재 상영하고 있는 영화정보를 제공해줌.
// 카카오 결제를 위한 정보를 제공해줌.
// 모든 정보 가능

// http://1.234.5.158:23000/json/exam1.json

// rest api 서버에 접속해서 정보를 받아오는 기능을 하는 라이브러리 okhttp3
public class RestClient1 {
	// MongoDB에 접속할 정보
	

	// 접속해서서 정보를 받아올 rest 서버 주소.
	final String URL = "http://1.234.5.158:23000/json/exam1.json";

	public RestClient1() {
		try {
			// 라이브러리를 제공한 곳의 문서 참고
			// 1. 클라이언트 객체 생성
			OkHttpClient client = new OkHttpClient();
			// 2. 요청 정보 객체 만들기
			Request request = new Request.Builder().url(URL).get().build();
			// 3. 1과 2를 이용한 요청 후에 결과받기
			Response response = client.newCall(request).execute();

			// 결과를 잘 받았는지 확인
			if (response.isSuccessful()/* == true */) { // isSuccessful은 boolean타입
				// 실제로 받은 정보를 문자변수 strData에 저장.
				String strData = response.body().string().toString(); // 질문) .string()이후 .toString()하는 이유는??

				// 필요한 데이터만 꺼냄 변수명X
				// JSONObject == Map (키를 통해 데이터 꺼내기!)
				// Map과 방식이 같을뿐, Map을 사용하는것이 아님.
				JSONObject jobj = new JSONObject(strData);
				String ret = jobj.getString("ret");
				int data = jobj.getInt("data");

				// 콘솔에 확인하기
				System.out.println(strData);
				System.out.println(ret);
				System.out.println(data);

			}

		} // 위의 방법으로 어떠한 rest서버에 접속해서 정보를 받아올 수 있다!
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
