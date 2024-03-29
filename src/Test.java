
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;

import org.eclipse.paho.client.mqttv3.MqttClient;

import org.eclipse.paho.client.mqttv3.MqttConnectOptions;

import org.eclipse.paho.client.mqttv3.MqttDeliveryToken;

import org.eclipse.paho.client.mqttv3.MqttMessage;

import org.eclipse.paho.client.mqttv3.MqttTopic;

public class Test {

	//http://api.heclouds.com/devices/39591434
	private static String hostName = "tcp://iot.eclipse.org:1883";// "tcp://iot.eclipse.org:1883";

	public static String uuid = "xxx";

	public static String token = "xx";

	private static String username = uuid;

	private static String password = token;

	private static String subscribeTopic = uuid;

	private static String publisheTopic = "message";

	private static String sendMsg = "{\"devices\":\"" + uuid + "\",\"payload\":{\"param1\":\"value1\"}}";

	private static MqttClient client;

	public static void main(String[] args) {

		// 订阅消息的方法

		subscribe();

		// 发布消息的类

		publish();

	}

	public static String subscribe() {

		try {

			// 创建MqttClient

			client = new MqttClient(hostName, "11");

			client.setCallback(new MqttCallback() {

				public void connectionLost(Throwable arg0) {

				}


				@Override
				public void deliveryComplete(IMqttDeliveryToken arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void messageArrived(String arg0, MqttMessage arg1) throws Exception {
					// TODO Auto-generated method stub
					System.out.println(" 从服务器收到的消息为:" + arg1.toString());
				}

			});

			MqttConnectOptions conOptions = new MqttConnectOptions();

			conOptions.setUserName(username);

			conOptions.setPassword(password.toCharArray());

			conOptions.setCleanSession(false);

			client.connect(conOptions);

			client.subscribe(subscribeTopic, 1);

			boolean isSuccess = client.isConnected();

			System.out.println("连接状态:" + isSuccess);

			// client.disconnect();

		} catch (Exception e) {

			e.printStackTrace();

			return "failed";

		}

		return "success";

	}

	public static void publish() {

		try {

			MqttTopic topic = client.getTopic(publisheTopic);

			System.out.println("发送的消息内容为:" + sendMsg);

			MqttMessage message = new MqttMessage(sendMsg.getBytes());

			message.setQos(1);

			while (true) {

				MqttDeliveryToken token = topic.publish(message);

				while (!token.isComplete()) {

					token.waitForCompletion(1000);

				}

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}