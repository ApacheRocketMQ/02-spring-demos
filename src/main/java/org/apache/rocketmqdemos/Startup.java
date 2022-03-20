package org.apache.rocketmqdemos;


import org.apache.rocketmq.client.producer.SendResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.List;

/**
 * Producer, using RocketMQTemplate sends a variety of messages
 */
@SpringBootApplication
public class Startup implements CommandLineRunner {

    @Resource
    private RocketMQClient rocketMQClient;

    @Value("${demo.topic_string}")
    private String stringTopic;
    @Value("${demo.topic_user}")
    private String userTopic;


    public static void main(String[] args) {
        SpringApplication.run(Startup.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        SendResult sendResult = rocketMQClient.syncSend(stringTopic, "Hello, World!");
        System.out.printf("syncSend1 to topic %s sendResult=%s %n", stringTopic, sendResult);

        sendResult = rocketMQClient.syncSend(userTopic, new UserEvent().setUserAge((byte) 18).setUserName("Kitty"));
        System.out.printf("syncSend1 to topic %s sendResult=%s %n", userTopic, sendResult);
    }

}

