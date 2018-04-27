package com.text2system.stream.messaging;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.MessageBuilder;

import java.util.Random;


@EnableBinding(ContextSource.class)
public class ContextPublisher {

//	@InboundChannelAdapter(channel=Source.OUTPUT)
//	public String sendTollCharge() {
//		return "{station:\"20\", customerid:\"100\", timestamp:\"2017-07-12T03:15:00\"}";
//	}
	
	Random r = new Random();

	@Bean
	//@InboundChannelAdapter(channel="text2systemChannel", poller=@Poller(fixedDelay="2000"))
	public MessageSource<ContextBody> sendTollCharge() {

		return () -> MessageBuilder.withPayload(new ContextBody("20","100","2017-07-12T12:04:00"))
									.setHeader("speed", r.nextInt(8) * 10)
									.build();
	}
	
}
