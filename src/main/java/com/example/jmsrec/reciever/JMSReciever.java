package com.example.jmsrec.reciever;

import org.springframework.stereotype.Component;

@Component
public class JMSReciever {
	public void receiveMessage(String message) {
		System.out.println("Recieved < "+ message +" >");
	}

}
