package com.dongqilin.mapper;

import com.dongqilin.entity.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    @Select("select id, username, password, salt, locked from sys_users where username=?")
    User findByUsername(String username);
}