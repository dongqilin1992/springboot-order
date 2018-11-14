package com.dongqilin.service;

import com.dongqilin.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;


/**
 * @description:
 * @author: dongql
 * @date: 2017/10/9 14:17
 */
@Service
public class UserServiceImpl implements UserService{
    /*@Autowired
    private UserMapper userMapper;*/
    @Autowired
    private PasswordHelper passwordHelper;
    @Autowired
    private UserDao userDao;

    public User findUserById(int id) {
        //User user = userMapper.selectByPrimaryKey(Long.valueOf(id));
        return null;
    }

    public void adduser(User user) {
        //userMapper.insert(user);
    }

    public void changePassword(Integer userId, String newPassword) {
        /*User user = userMapper.selectByPrimaryKey(Long.valueOf(userId));
        user.setPassword(newPassword);
        userMapper.updateByPrimaryKeySelective(user);*/
    }

    public User findByName(String username) {
        //User byName = userMapper.findByName(username);
        return null;
    }


    /**
     * 创建用户
     *
     * @param user
     */
    public User createUser(User user) {
        //加密密码
        passwordHelper.encryptPassword(user);
        return userDao.createUser(user);
    }

    /**
     * 修改密码
     *
     * @param userId
     * @param newPassword
     */
    public void changePassword(Long userId, String newPassword) {
        User user = userDao.findOne(userId);
        user.setPassword(newPassword);
        passwordHelper.encryptPassword(user);
        userDao.updateUser(user);
    }

    /**
     * 添加用户-角色关系
     *
     * @param userId
     * @param roleIds
     */
    public void correlationRoles(Long userId, Long... roleIds) {
        userDao.correlationRoles(userId, roleIds);
    }


    /**
     * 移除用户-角色关系
     *
     * @param userId
     * @param roleIds
     */
    public void uncorrelationRoles(Long userId, Long... roleIds) {
        userDao.uncorrelationRoles(userId, roleIds);
    }

    /**
     * 根据用户名查找用户
     *
     * @param username
     * @return
     */
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

    /**
     * 根据用户名查找其角色
     *
     * @param username
     * @return
     */
    public Set<String> findRoles(String username) {
        return userDao.findRoles(username);
    }

    /**
     * 根据用户名查找其权限
     *
     * @param username
     * @return
     */
    public Set<String> findPermissions(String username) {
        return userDao.findPermissions(username);
    }

}
