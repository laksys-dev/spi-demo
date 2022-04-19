package org.example;

public class EmailServiceProvider implements MessageServiceProvider {	
	
	public EmailServiceProvider() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Email constructor...");
	}

	@Override
	public void sendMessage(String msg) {
		System.out.println("Sending email with message: "+ msg);
	}
}
