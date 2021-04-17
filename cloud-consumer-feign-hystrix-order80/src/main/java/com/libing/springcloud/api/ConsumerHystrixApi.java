package com.libing.springcloud.api;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author libing
 * @create 2021-03-19 22:13
 */
@RestController
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class ConsumerHystrixApi {
    @Autowired
    ConsumerHystrixClient consumerHystrixClient;

    @GetMapping("consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id) {
        String s = consumerHystrixClient.paymentInfo_OK(1);
        return s;
    }

//    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler", commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")})
    @HystrixCommand
    @GetMapping("consumer/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
        int a = 10 / 0;

        String result = consumerHystrixClient.paymentInfo_TimeOut(id);
        return result;
    }

    public String payment_Global_FallbackMethod() {
        return "全局异常处理机制。。。。。。。。。。。。。。。。。。。。。";
    }




}
