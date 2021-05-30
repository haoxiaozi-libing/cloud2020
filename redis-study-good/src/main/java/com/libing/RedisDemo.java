package com.libing;

import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import redis.clients.jedis.Jedis;

import java.util.Set;
import java.util.UUID;

/**
 * @author lvlibing
 * @create 2021-05-27 9:57
 */

@SpringBootApplication
public class RedisDemo {

    public static Jedis jedis = new Jedis("192.168.45.110", 6379);

    public static void main(String[] args) {
        SpringApplication.run(RedisDemo.class,args);
    }

    public static void test(String[] args) {
        Jedis jedis = new Jedis("192.168.45.110", 6379);
        String ping = jedis.ping();
        System.out.println(ping);

        Set<String> keys = jedis.keys("*");
        for (String key : keys) {
            System.out.println(key+"sssssssssss");
        }

    }

//    @Test
    public void tes() {
        Jedis jedis = new Jedis("192.168.45.110", 6379);
        String ping = jedis.ping();
        System.out.println(ping);
        String set = jedis.set("name", "lucy");
    }


    @Test
    public void shoujiyanzhengma(){
        String s = UUID.randomUUID().toString().substring(0,6);
        jedis.set("libing",s);

    }

}
