package com.dongqilin.controller;

import com.alibaba.fastjson.JSONObject;
import com.dongqilin.entity.User;
import com.dongqilin.service.RedisService;
import com.dongqilin.service.UserServiceImpl;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: dongql
 * @date: 2017/10/11 17:57
 */
@RestController
@RequestMapping("/user")
@MapperScan("com.dongqilin.mapper")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/login")
    public String login(String username, String password) {
        User user = null;
        Object userna = RedisService.get(username);
        if (null == userna) {
            /*user = userService.findUserByName(username);
            if (null != user) {
                RedisService.set(username, user);
            }*/
        }
        else{
            user=(User)userna;
        }
        if (user == null || !password.equals(user.getPassword())) {
            return "login faild , user not exits";
        }
        return "login success";
    }

    /*@RequestMapping("/getUser/{id}")
    public User getUser(
            @PathVariable("id")
                    Integer id) {
        User user = userService.findUserById(id);
        return user;
    }*/

    @RequestMapping("/addUser")
    public void adduser(String username) {
        User user = new User();
        //user.setUserName(username);
        user.setPassword("123");
        //user.setPhone("123456789");
        userService.adduser(user);
    }
    @RequestMapping(value = "/ajaxLogin", method = RequestMethod.POST)
    @ResponseBody
    public String ajaxLogin(User userInfo) {
        JSONObject jsonObject = new JSONObject();
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(userInfo.getUsername(), userInfo.getPassword());
        try {
            subject.login(token);
            jsonObject.put("token", subject.getSession().getId());
            jsonObject.put("msg", "登录成功");
        } catch (IncorrectCredentialsException e) {
            jsonObject.put("msg", "密码错误");
        } catch (LockedAccountException e) {
            jsonObject.put("msg", "登录失败，该用户已被冻结");
        } catch (AuthenticationException e) {
            jsonObject.put("msg", "该用户不存在");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonObject.toString();
    }
    @RequestMapping(value = "/unauth")
    @ResponseBody
    public Object unauth() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", "1000000");
        map.put("msg", "未登录");
        return map;
    }
}
