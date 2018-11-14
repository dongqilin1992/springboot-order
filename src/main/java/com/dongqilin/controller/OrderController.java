package com.dongqilin.controller;

import com.dongqilin.entity.Order;
import com.dongqilin.service.OrderFactory;
import com.dongqilin.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: dongql
 * @date: 2018/3/26 14:29
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @Transactional
    @RequestMapping("{id}/create")
    public void createOrder(@PathVariable("id") Integer id){
        Order order = OrderFactory.getInstance().genOrder(id);
        orderService.createOder(order);
    }
    @RequestMapping("{id}/query")
    public Order queryOder(@PathVariable("id") Integer id){
        Order order = orderService.queryOder(id);
        return order;
    }
}
