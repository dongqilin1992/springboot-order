package com.dongqilin;

import com.dongqilin.mq.MqSender;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: dongql
 * @date: 2018/3/26 12:39
 */
@EnableTransactionManagement
@RestController
@SpringBootApplication
@MapperScan("com.dongqilin.mapper")
public class OrderApplication {

    @Autowired
    MqSender send;

    @RequestMapping("/direct/{type}")
    public String index(@PathVariable String type){
        send.sendDirectMsg("hello123", type);
        return "hello";
    }
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);

    }
}
