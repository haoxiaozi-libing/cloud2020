package com.libing.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lvlibing
 * @create 2021-05-29 21:05
 */
@RestController
public class RedisController {
    @Autowired
    RedisTemplate redisTemplate;
    @Value("${server.port}")
    String port;

    @GetMapping(value = "/asd")
    public String hello() {
        return "asdgasg";
    }

    @RequestMapping(value = "/hello/redis", method = RequestMethod.GET)
    public String redisTest() {
        redisTemplate.opsForValue().set("libing", "haoxiazi");
        String libing = (String) redisTemplate.opsForValue().get("libing");
        System.out.println(libing + "port" + port);
        return libing;
    }
}
