package com.text2system.stream.messaging;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface ContextSource {
	
	@Output("text2systemchannel")
	MessageChannel message();
}