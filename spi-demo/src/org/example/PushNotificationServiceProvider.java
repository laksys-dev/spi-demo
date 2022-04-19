package org.example;

public class PushNotificationServiceProvider implements MessageServiceProvider {

	public PushNotificationServiceProvider() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("PushNotification constructor...");
	}

	@Override
	public void sendMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Sending push notification with message: " + msg);
	}

}
