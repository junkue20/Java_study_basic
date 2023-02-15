package day13;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttMessage;

import day8.Config;

public class ChatClient implements MqttCallback {

	private MqttClient client = null;

	public ChatClient() { //
		try {
			String clientid = "id209_" + System.currentTimeMillis();
			this.client = new MqttClient(Config.BROKER, clientid);

			MqttConnectOptions options = new MqttConnectOptions();
			options.setUserName(Config.CONNECTID);
			options.setPassword(Config.CONNECTPW.toCharArray()); // 패스워드의 경우 Char형태로 받아야 함.
			options.setCleanSession(true); // 불필요 데이터 삭제
			options.setKeepAliveInterval(30); // 새 데이터 refresh 주기

			client.connect(options);
			System.out.println("=========================================================");
			System.out.println("접속 성공 - " + client);
			System.out.println("=========================================================");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("접속 실패.");
		}
	}

	// 구독 설정 ex)/pknu/class303으로 오는 모든 메시지는 다 받음.
	public boolean setSubscribe() {
		try {
			client.subscribe("/pknu/class303/#");
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	// 메세지 보내기(보낼토픽, 메시지)
	public boolean sendMessage(String topic, String msg) {
		try {
			MqttMessage message = new MqttMessage(msg.getBytes());
			message.setPayload(msg.getBytes());
			client.publish(topic, message);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public void connectionLost(Throwable cause) {
		System.out.println("connectionLost");

	}

	@Override
	public void messageArrived(String topic, MqttMessage message) throws Exception {
		//MqttMessage타입을 String 타입으로 변환
		byte[] tmp = message.getPayload();
		String str = new String(tmp);
		System.out.println("토픽 : " + "topic");
		System.out.println("메세지 : " + "message");

	}

	@Override
	public void deliveryComplete(IMqttDeliveryToken token) {
		System.out.println("deliveryComplete");

	}
}
