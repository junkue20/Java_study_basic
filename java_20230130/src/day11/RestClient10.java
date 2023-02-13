package day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class RestClient10 {

	final String URL = "http://1.234.5.158:23000/json/exam10.json";
	private String data = null;

	public RestClient10() {
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

	public void parseData() {
		try {
			JSONObject jobj = new JSONObject(this.data);
			String ret = jobj.getString("ret");
			JSONArray jary = jobj.getJSONArray("data"); // data에 여러 정보가 있기때문에 Array로 받음.
			// [{0},{1},{2},{3},{4}]
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			if (ret.equals("y")) {
				for (int i = 0; i < jary.length(); i++) { // 5번 왕복

					JSONObject jobj1 = jary.getJSONObject(i); // 한개 꺼내기
					// {"id": "id1", "name": "가나다1", "age"; 31, "score": {"math: 50, "eng": 90,
					// "kor": 69}}
					String id = jobj1.getString("id");
					String name = jobj1.getString("name");
					int age = jobj1.getInt("age");

					// {"math: 50, "eng": 90, "kor": 69}
					JSONObject score = jobj1.getJSONObject("score");
					int math = score.getInt("math");
					int eng = score.getInt("eng");
					int kor = score.getInt("kor");

					System.out.println(id + "," + name + "," + age + "," + math + "," + eng + "," + kor);
					System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<Score1> parseData1() {
		// 1. 반환 객체 만들기
		List<Score1> list = new ArrayList<>();
		JSONObject jobj = new JSONObject(this.data);
		JSONArray jary = jobj.getJSONArray("data");

		// 실제 저장된 객체에서 Score1객체로 1개씩 복사
		for (int i = 0; i < jary.length(); i++) {
			JSONObject jobj1 = jary.getJSONObject(i);
			Score1 s1 = new Score1();

			s1.setId(jobj1.getString("id"));
			s1.setName(jobj1.getString("name"));
			s1.setAge(jobj1.getInt("age"));

			JSONObject score = jobj1.getJSONObject("score");

			s1.setMath(score.getInt("math"));
			s1.setEng(score.getInt("eng"));
			s1.setKor(score.getInt("kor"));

			// 반환할 객체에 Score1객체 추가
			list.add(s1);
		}
		return list;

	}

	// 실습
	/*----------------------------------------------------------------------*/
	// 국어점수 합계 구하기
	public int sumKor() {
		List<Score1> list = this.parseData1();
		int sum = 0; // 합계 구하는 변수
		for (Score1 s1 : list) {
			sum += s1.getKor();
		}

		return sum;
	}
	/*----------------------------------------------------------------------*/

	// 영어점수 최대값 구하기
	public int maxEng() { // this.부터 막혔음.
		List<Score1> list = this.parseData1();
		int max = 0;
		// 최소값도 구해보자.
		int min = 101; // 최고 점수가 100점이기때문에 101로 설정.
		for (Score1 s1 : list) {
			int n = s1.getEng();
			if (max < n) {
				max = n;
			}
			if (min > n) {
				min = n;
			}
		}
		return max;
	}

	// 국어, 영어, 수학 합계 구하기
	public int[] sumKorMathEng() { // 배열생성, 점수 모두 합한 뒤 ret에 추가하는부분에서 막힘.
		List<Score1> list = this.parseData1();
		// 배열을 추가해야함
		int[] ret = new int[3];

		for (Score1 s1 : list) {
			ret[0] += s1.getKor();
			ret[1] += s1.getEng();
			ret[2] += s1.getMath();
		}

		return ret;
	}

	/*----------------------------------------------------------------------*/

	// 학생별 총점 구하기
	/* map에는 학생 아이디, 총점정보와 이름 포함하기 */
	public List<Map<String, Object>> sumStudent() {
		List<Score1> list = this.parseData1(); // 점수를 가지고 있음 5개

		// 1. 반환타입 만들기 map은 클래스와 같음.
		List<Map<String, Object>> stu = new ArrayList<>();
		for (Score1 s1 : list) {
			// 2. 반환타입에 포함하는 Map만들기
			Map<String, Object> map = new HashMap<>();
			map.put("id", s1.getId());
			map.put("name", s1.getName());
			map.put("total", s1.getKor() + s1.getEng() + s1.getMath());
			map.put("avg", (s1.getKor() + s1.getEng() + s1.getMath()) / 3);

			// 3. list에 추가하기
			stu.add(map);

		}
		// 4. 반환하기
		return stu;
	}

}
