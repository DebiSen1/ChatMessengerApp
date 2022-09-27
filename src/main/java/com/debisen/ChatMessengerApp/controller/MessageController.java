package com.debisen.ChatMessengerApp.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

import com.debisen.ChatMessengerApp.POJO.Message;

@Controller
public class MessageController {

	//to register a user based on username he/she provides
	@MessageMapping("/chat.addUser")
	@SendTo("msg/public")
	public Message addUser(@Payload Message message, SimpMessageHeaderAccessor headerAccessor) {
		try {
			headerAccessor.getSessionAttributes().put("username", message.getFromWhom());
			return message;
		}
		catch(Exception ex) {
			System.out.println("error caused"); //for demo purpose
			return message;
		}
	}
	
	
	@MessageMapping("/chat.sendMessage")
	@SendTo("msg/public")
	public Message sendMessage(@Payload Message message) {
		return message;
	}
}
