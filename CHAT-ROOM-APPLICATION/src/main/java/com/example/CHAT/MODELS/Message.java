package com.example.CHAT.MODELS;

public class Message {
	
	private String Name;
	private String content;
	public Message(String name, String content) {
		super();
		Name = name;
		this.content = content;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	

}
