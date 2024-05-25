package com.example.CHAT.CONTROLERS;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.CHAT.MODELS.Message;

@RestController
public class MessageControllers {
	
	
	@MessageMapping("/message")
	@SendTo("/topic/return-to")
	public Message getContent(@RequestBody Message message)
	{
		try
		{
			Thread.sleep(200);
		}
		catch(InterruptedException e)
		{
			
		}
		return message;
	}

}
