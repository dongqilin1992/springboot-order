package com.dongqilin.service;

import com.dongqilin.entity.Order;
import org.redisson.api.RLock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: dongql
 * @date: 2018/3/26 15:33
 */
public class OrderFactory {
    private static final Logger logger = LoggerFactory.getLogger(OrderFactory.class);
    private static OrderFactory oderFactory;

    private OrderFactory() {

    }

    public static OrderFactory getInstance() {
        OrderFactory oderFactory = new OrderFactory();
        return oderFactory;
    }

    public Order genOrder(Integer userId) {
        Order order = new Order();
        order.setUserId(userId);
        String s = genOrderNumber();
        order.setOrderNumber(s);
        return order;
    }

    private String genOrderNumber() {
        RLock lock = RedissonLock.getRedisson().getLock("TEST_KEY");
        try {
            boolean res = lock.tryLock(10, 10, TimeUnit.SECONDS);
            if (res) {
                String uuid = UUID.randomUUID().toString();
                return uuid;
            }
        } catch (Exception e) {
            logger.debug(e.toString());
        } finally {
            lock.unlock();
        }
        return "";
    }

}
