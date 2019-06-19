package com.dongqilin.service;

import com.dongqilin.entity.Order;
import com.dongqilin.entity.OrderModel;
import com.dongqilin.mapper.OrderMapper;
import com.dongqilin.mapper.OrderModelMapper;
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
    @Autowired
    OrderModelMapper orderModelMapper;

    public void createOder(Order order){
        orderMapper.insertSelective(order);
    }

    public Order queryOder(Integer orderId){
        Order order = orderMapper.selectByPrimaryKey(orderId);
        OrderModel orderModel = orderModelMapper.selectByPrimaryKey(orderId);
        return order;
    }
}
