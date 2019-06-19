package com.dongqilin;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @description:
 * @author: dongql
 * @date: 2019/6/13 17:37
 */
public interface BaseMapper <T> extends Mapper<T> , MySqlMapper<T> {
}
