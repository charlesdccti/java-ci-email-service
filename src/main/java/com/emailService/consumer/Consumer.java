package com.emailService.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.util.JSONPObject;

@Component
public class Consumer {

	@JmsListener(destination = "filaPedidoEmail")
	public void receiveMessage(String message) {
	    System.out.println(message);
	}
}