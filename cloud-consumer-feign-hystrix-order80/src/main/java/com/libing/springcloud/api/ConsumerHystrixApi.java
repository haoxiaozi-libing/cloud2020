package com.libing.springcloud.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author libing
 * @create 2021-03-19 22:13
 */
@RestController
public class ConsumerHystrixApi {
    @Autowired
    ConsumerHystrixClient consumerHystrixClient;

    @GetMapping("consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id) {
        String s = consumerHystrixClient.paymentInfo_OK(1);
        return s;
    }

    @GetMapping("consumer/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
        String result = consumerHystrixClient.paymentInfo_TimeOut(id);
        return result;
    }

}
