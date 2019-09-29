package com.dongqilin.service;

import com.dongqilin.entity.OrderModel;
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
    OrderModelMapper orderModelMapper;

    public void createOder(OrderModel order){
        orderModelMapper.insertSelective(order);
    }

    public OrderModel queryOder(Integer orderId){
        OrderModel orderModel = orderModelMapper.selectByPrimaryKey(orderId);
        return orderModel;
    }
}
