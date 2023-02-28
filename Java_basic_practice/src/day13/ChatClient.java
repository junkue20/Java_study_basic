package day13;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.json.JSONObject;

import day8.Config;

public class ChatClient implements MqttCallback { // 채팅클래스

	private MqttClient client = null;
	private ItemDB iDB = new ItemDBImpl(); // items 컬렉션 연동 객체 생성

	public ChatClient() { // 생성자, 서버 접속
		try {
			String clientid = "id200_" + System.currentTimeMillis();
			this.client = new MqttClient(Config.BROKER, clientid);

			MqttConnectOptions options = new MqttConnectOptions();
			options.setUserName(Config.CONNECTID);
			options.setPassword(Config.CONNECTPW.toCharArray());
			options.setCleanSession(true);
			options.setKeepAliveInterval(30);

			this.client.connect(options);
			this.client.setCallback(this);
			System.out.println("접속성공 => " + client);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("접속실패");
		}
	}

	// 구독설정 (해당 주소로 오는 내용을 확인이 가능.)
	public boolean setSubscribe() {
		try {
			client.subscribe("/pknu/class303/id209"); // 내용을 받고싶은 주소
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// 메시지 보내기(보낼토픽, 메시지)
	public boolean sendMessage(String topic, String msg) {
		try {
			MqttMessage message = new MqttMessage();
			message.setPayload(msg.getBytes());
			client.publish(topic, message);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public void connectionLost(Throwable cause) {// 연결이 끊어졌을때
		System.out.println("connectionLost");
	}

	@Override
	public void messageArrived(String topic, MqttMessage message) throws Exception { // 도착한 메세지 분류
		try {
			// MqttMessage타입을 String 타입으로 변환 ( 변환된 String 타입을 DB로 전송하기 위함 )
			byte[] tmp = message.getPayload();
			String str = new String(tmp);

			// {"name" : "물품명", "content" : "물품내용", "price":1234, "quantity":1234};
			// price와 quantity의 경우 DB에 Int64(long타입)으로 저장되어 있기 때문에 long으로 불러올것.
			JSONObject jobj = new JSONObject(str); //받아온 문자에서 각각의 항목으로 분리.
			String name = jobj.getString("name");
			String content = jobj.getString("content");
			long price = jobj.getLong("price");
			long quantity = jobj.getLong("quantity");

			// map에 데이터 담기 (interface의 insertItemMap의 형태가 map이기 때문.)
			Map<String, Object> map = new HashMap<>(); // 분리된 항목을 map에 담음.
			map.put("name", name); 
			map.put("content", content);
			map.put("price", price);
			map.put("quantity", quantity);

			// 데이터 베이스에 추가하기
			int ret = iDB.insertItemMap(map); // (interface의) insertItemMap로 결과를 보냄.
			System.out.println("DB추가 유무 = > " + ret); // 자료가 올라가면 1 표시.

			// 데이터 베이스에서 조회
			List<Map<String, Object>> list = iDB.selecItemListMap(ret); // 
			for(Map<String, Object> map1 : list){ // 반복문. DB에서 받아온 items 정보를 처음부터 끝까지 범위를 지정.
				System.out.println(map1.get("_id")); // 아이템 숫자
				System.out.println(map1.get("name")); // 아이템 이름 만 출력되게끔 설정
				System.out.println("---------------------------");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		// System.out.println("토픽 => " + topic + "메시지 =>" + str);
	}

	@Override
	public void deliveryComplete(IMqttDeliveryToken token) { // 메세지 전송 성공시
		System.out.println("deliveryComplete");
	}
}
