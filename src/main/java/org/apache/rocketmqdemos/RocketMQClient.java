package org.apache.rocketmqdemos;

import org.apache.rocketmq.spring.annotation.ExtRocketMQTemplateConfiguration;
import org.apache.rocketmq.spring.core.RocketMQTemplate;

@ExtRocketMQTemplateConfiguration(
        nameServer = "${demo.name_srv}",
        group = "${demo.producer_group_name}"
)
public class RocketMQClient extends RocketMQTemplate {
}
