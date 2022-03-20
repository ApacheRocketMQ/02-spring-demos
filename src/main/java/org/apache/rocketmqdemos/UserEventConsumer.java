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
        topic = "${demo.topic_user}",
        consumerGroup = "${demo.user_consumer}"
)
public class UserEventConsumer implements RocketMQListener<UserEvent> {
    @Override
    public void onMessage(UserEvent message) {
        System.out.printf("[正在消费] user event : %s\n", message, message.getUserAge(), message.getUserName());

    }
}