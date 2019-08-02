package com.emailService.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.util.JSONPObject;

@Component
public class Consumer {

	private String bar = new String("bar");

	@JmsListener(destination = "filaPedidoEmail")
	public void receiveMessage(String message){
		System.out.println(message);
		// System.exit(0);
	}
}