package com.text2system.stream.webhook;

import com.text2system.stream.messaging.ContextBody;
import com.text2system.stream.messaging.ContextPublisher;
import com.text2system.stream.messaging.ContextSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@Configuration
@EnableAutoConfiguration
@RestController
public class Application {

    @Value("${robin}")
    String robin = "does not work";

    @Autowired
    private ContextSource contextSource;

    @RequestMapping("/")
    public String home() {


        ContextBody payload = new  ContextBody("07786543212","what the f**ck",
                "198612091755234");

        Random r = new Random();
        contextSource.message().send(MessageBuilder.withPayload(payload)
                .setHeader("speed", r.nextInt(8) * 10)
                .build());


        return "Hello " + robin;
    }
}