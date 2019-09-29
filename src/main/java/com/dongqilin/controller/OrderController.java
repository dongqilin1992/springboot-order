package com.dongqilin.controller;

import com.dongqilin.entity.OrderModel;
import com.dongqilin.service.OrderFactory;
import com.dongqilin.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: dongql
 * @date: 2018/3/26 14:29
 */
@Api(value = "订单中心统计API", description = "订单中心统计API", protocols = "http")
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @ApiOperation(value = "创建订单信息", notes = "创建订单信息", protocols = "http")
    @Transactional
    @RequestMapping(value = "/create/{id}", method = RequestMethod.GET, produces = {"application/json"})
    public void createOrder(@PathVariable("id") Integer id){
        OrderModel order = OrderFactory.getInstance().genOrder(id);
        orderService.createOder(order);

    }

    @ApiOperation(value = "查询订单信息", notes = "查询订单信息", protocols = "http")
    @RequestMapping(value ="/query{id}", method = RequestMethod.GET, produces = {"application/json"})
    public OrderModel queryOder(@PathVariable("id") Integer id){
        OrderModel order = orderService.queryOder(id);
        return order;
    }
}
