package com.dongqilin.mq;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: dongql
 * @date: 2018/9/14 13:53
 */
@Component
public class DirectConsumerQuery implements ChannelAwareMessageListener {
    @Override
    public void onMessage(Message message, Channel channel) throws Exception {
        System.out.println("[DirectConsumerQuery] receive msg: " + new String(message.getBody()));
        //手动应答canalData
        channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
    }
    /*@RabbitListener(queues="springboot-directQueue-query")
    public void receive_2(String content) {
        // ...
        System.out.println("[DirectConsumerQuery] receive msg: " + content);
    }*/
}
