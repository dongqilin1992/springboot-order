package com.dongqilin.service;

import com.dongqilin.entity.Order;
import com.dongqilin.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: dongql
 * @date: 2018/3/26 14:29
 */
@Service
public class OrderService {
    @Autowired
    OrderMapper orderMapper;

    public void createOder(Order order){
        orderMapper.insertSelective(order);
    }

    public Order queryOder(Integer orderId){
        Order order = orderMapper.selectByPrimaryKey(orderId);
        return order;
    }
}
