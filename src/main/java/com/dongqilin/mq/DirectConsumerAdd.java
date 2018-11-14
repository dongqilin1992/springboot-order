package com.dongqilin.mq;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: dongql
 * @date: 2018/9/14 11:45
 */
@Component
public class DirectConsumerAdd implements ChannelAwareMessageListener {
    /*@RabbitListener(queues="springboot-directQueue-add")
    public void receive_2(String content) {
        // ...
        System.out.println("[DirectConsumerAdd] receive msg: " + content);
    }*/

    @Override
    public void onMessage(Message message, Channel channel) throws Exception {
        System.out.println("[DirectConsumerAdd] receive msg: " + new String(message.getBody()));
        //手动应答canalData
        channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
    }
}
