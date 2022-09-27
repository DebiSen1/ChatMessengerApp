package com.debisen.ChatMessengerApp.POJO;

public class Message {
	private int id;
	private String messageContent;
	private String toWhom;
	private String fromWhom;

	public Message(int id, String messageContent, String toWhom, String fromWhom) {
		super();
		this.id = id;
		this.messageContent = messageContent;
		this.toWhom = toWhom;
		this.fromWhom = fromWhom;
	}

	public Message() {
		super();
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}

	public String getToWhom() {
		return toWhom;
	}

	public void setToWhom(String toWhom) {
		this.toWhom = toWhom;
	}

	public String getFromWhom() {
		return fromWhom;
	}

	public void setFromWhom(String fromWhom) {
		this.fromWhom = fromWhom;
	}

}
