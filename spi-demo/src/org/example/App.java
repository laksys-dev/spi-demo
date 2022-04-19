package org.example;

import java.util.ServiceLoader;

public class App {
	public static void main(String[] args) {
		
		System.out.println("Starting--------");
		ServiceLoader<MessageServiceProvider> serviceLoader;
		serviceLoader = ServiceLoader.load(MessageServiceProvider.class);
		
		//for(MessageServiceProvider service: serviceLoader)
		//	service.sendMessage("hello, laksys!");
		
		serviceLoader.forEach(s->s.sendMessage("hello, world!"));
		
		System.out.println("Ending.......");
	}
}
