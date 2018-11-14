package com.dongqilin.service;

import com.dongqilin.utils.SerializeUtil;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @description:
 * @author: dongql
 * @date: 2018/3/26 16:16
 */
public class RedisService {
    private static JedisPool pool = null;
    static {
        JedisPoolConfig config = new JedisPoolConfig();
        // 设置最大连接数
        config.setMaxTotal(200);
        // 设置最大空闲数
        config.setMaxIdle(8);
        // 设置最大等待时间
        config.setMaxWaitMillis(1000 * 100);
        // 在borrow一个jedis实例时，是否需要验证，若为true，则所有jedis实例均是可用的
        config.setTestOnBorrow(true);
        pool = new JedisPool(config, "127.0.0.1", 6379, 3000);
    }

    public static Jedis getInstance(){
        return pool.getResource();
    }

    public static void set(String key,Object obj){
        getInstance().set(key.getBytes(), SerializeUtil.serialize(obj));
    }

    public static Object get(String key){
        byte[] bytes = getInstance().get(key.getBytes());
        return SerializeUtil.unserialize(bytes);
    }

    public static void delete(String key){
        getInstance().del(key.getBytes());
    }
}