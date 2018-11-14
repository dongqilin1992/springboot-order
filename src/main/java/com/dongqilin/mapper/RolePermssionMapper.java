package com.dongqilin.mapper;

import com.dongqilin.entity.RolePermssionKey;

public interface RolePermssionMapper {
    int deleteByPrimaryKey(RolePermssionKey key);

    int insert(RolePermssionKey record);

    int insertSelective(RolePermssionKey record);
}