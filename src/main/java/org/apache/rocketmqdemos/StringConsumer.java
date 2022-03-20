package org.apache.rocketmqdemos;


import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

/**
 * StringConsumer
 */
@Service
@RocketMQMessageListener(
        nameServer = "${demo.name_srv}",
        topic = "${demo.topic_string}",
        consumerGroup = "${demo.string_consumer}"
)
public class StringConsumer implements RocketMQListener<String> {
    @Override
    public void onMessage(String message) {
        System.out.printf("[正在消费] string %s \n", message);
    }
}