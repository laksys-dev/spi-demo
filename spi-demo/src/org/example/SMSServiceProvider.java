package org.example;

public class SMSServiceProvider implements MessageServiceProvider {

	public SMSServiceProvider() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("SMS Constructor...");
	}

	@Override
	public void sendMessage(String msg) {
		System.out.println("Sending SMS with message: "+msg);
	}

}
