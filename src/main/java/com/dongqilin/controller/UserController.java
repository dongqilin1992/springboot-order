package com.dongqilin.controller;

import com.alibaba.fastjson.JSONObject;
import com.dongqilin.entity.User;
import com.dongqilin.service.RedisService;
import com.dongqilin.service.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: dongql
 * @date: 2017/10/11 17:57
 */
@Api(value = "用户中心统计API", description = "用户中心统计API", protocols = "http")
@RestController
@RequestMapping("/user")
@MapperScan("com.dongqilin.mapper")
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    @ApiOperation(value = "登录", notes = "登录", protocols = "http")
    @RequestMapping(value = "/login", method = RequestMethod.GET, produces = {"application/json"})
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
    @ApiOperation(value = "添加用户", notes = "添加用户", protocols = "http")
    @RequestMapping(value = "/addUser", method = RequestMethod.GET, produces = {"application/json"})
    public void adduser(@RequestParam("username") String username) {
        User user = new User();
        //user.setUserName(username);
        user.setPassword("123");
        //user.setPhone("123456789");
        userService.adduser(user);
    }
    @ApiOperation(value = "ajax登录", notes = "ajax登录", protocols = "http")
    @RequestMapping(value = "/ajaxLogin", method = RequestMethod.POST, produces = {"application/json"})
    public String ajaxLogin(@RequestBody @Valid User userInfo) {
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
    @ApiOperation(value = "未认证", notes = "未认证", protocols = "http")
    @RequestMapping(value = "/unauth", method = RequestMethod.GET, produces = {"application/json"})
    public Object unauth() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", "1000000");
        map.put("msg", "未登录");
        return map;
    }
}
