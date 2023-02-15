package day13;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttMessage;

import day8.Config;

public class ChatClient implements MqttCallback {

	private MqttClient client = null;

	public ChatClient() {
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

	// 구독설정 ex)/pknu/class303으로 오는 모든 메시지는 다 받음
	public boolean setSubscribe() {
		try {
			client.subscribe("/pknu/class303/#");
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
	public void connectionLost(Throwable cause) {
		System.out.println("connectionLost");
	}

	@Override
	public void messageArrived(String topic, MqttMessage message) throws Exception {
		// MqttMessage타입을 String 타입으로 변환
		byte[] tmp = message.getPayload();
		String str = new String(tmp);
		System.out.println("토픽 => " + topic + "메시지 =>" + str);
	}

	@Override
	public void deliveryComplete(IMqttDeliveryToken token) {
		System.out.println("deliveryComplete");
	}
}
