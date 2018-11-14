package com.dongqilin.config;

import com.dongqilin.mq.DirectConsumerAdd;
import com.dongqilin.mq.DirectConsumerQuery;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @description:
 * @author: dongql
 * @date: 2018/5/16 15:07
 */
@Configuration
public class RabbitmqConfig {
    public static final String DIRECT_EXCHANGE = "springboot-directExchange";
    public static final String DIRECT_ROUTINGKEY = "springbootDirect.";

    @Bean
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
        connectionFactory.setAddresses("127.0.0.1:5672");
        connectionFactory.setUsername("guest");
        connectionFactory.setPassword("guest");
        connectionFactory.setVirtualHost("/");
        connectionFactory.setPublisherConfirms(true); //必须要设置
        return connectionFactory;
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//必须是prototype类型
    public RabbitTemplate directTemplate() {
        RabbitTemplate template = new RabbitTemplate(connectionFactory());
        template.setExchange(DIRECT_EXCHANGE);
        return template;
    }

    @Bean
    public DirectExchange directExchange() {
        return new DirectExchange(DIRECT_EXCHANGE);
    }

    @Bean
    public Queue directQueueAdd() {
        return new Queue("springboot-directQueue-add", true); //队列持久

    }
    @Bean
    public Queue directQueueQuery() {
        return new Queue("springboot-directQueue-query", true); //队列持久

    }

    @Bean
    public Binding directBindingAdd() {
        return BindingBuilder.bind(directQueueAdd()).to(directExchange()).with("springbootDirect.add");
    }
    @Bean
    public Binding directBindingQuery() {
        return BindingBuilder.bind(directQueueQuery()).to(directExchange()).with("springbootDirect.query");
    }
    @Bean
    public RabbitAdmin admin(@Qualifier("directExchange") DirectExchange exchange) {
        RabbitAdmin rabbitAdmin = new RabbitAdmin(connectionFactory());
        rabbitAdmin.declareExchange(exchange);
        return rabbitAdmin;
    }
    @Bean
    MessageListenerAdapter directQueueAddListener(DirectConsumerAdd receiver) throws Exception {
        return new MessageListenerAdapter(receiver) {
            {
                setDefaultListenerMethod("onMessage");
            }
        };
    }
    @Bean
    public SimpleMessageListenerContainer directQueueAddContainer(@Qualifier("directQueueAddListener") MessageListenerAdapter directQueueAddListener) {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer(connectionFactory());
        container.setQueues(directQueueAdd());
        container.setExposeListenerChannel(true);
        container.setMaxConcurrentConsumers(1);
        container.setConcurrentConsumers(1);
        container.setAcknowledgeMode(AcknowledgeMode.MANUAL); //设置确认模式手工确认
        container.setMessageListener(directQueueAddListener);
        return container;
    }
    @Bean
    MessageListenerAdapter directQueueQueryListener(DirectConsumerQuery receiver) throws Exception {
        return new MessageListenerAdapter(receiver) {
            {
                setDefaultListenerMethod("onMessage");
            }
        };
    }
    @Bean
    public SimpleMessageListenerContainer directQueueQueryContainer(@Qualifier("directQueueQueryListener") MessageListenerAdapter directQueueQueryListener) {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer(connectionFactory());
        container.setQueues(directQueueQuery());
        container.setExposeListenerChannel(true);
        container.setMaxConcurrentConsumers(1);
        container.setConcurrentConsumers(1);
        container.setAcknowledgeMode(AcknowledgeMode.MANUAL); //设置确认模式手工确认
        container.setMessageListener(directQueueQueryListener);
        return container;
    }
}
