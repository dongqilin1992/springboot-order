package com.dongqilin.mapper;

import com.dongqilin.entity.OrderModel;
import com.dongqilin.entity.OrderModelExample;

public interface OrderModelMapper {
    int countByExample(OrderModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderModel record);

    int insertSelective(OrderModel record);

    OrderModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderModel record);

    int updateByPrimaryKey(OrderModel record);
}