package com.libing.springcloud.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author libing
 * @create 2021-03-19 22:10
 */
@Component
@FeignClient(value = "cloud-provider-hystrix-payment",fallback = HystrixCommandService.class)
public interface ConsumerHystrixClient {

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id);

    @GetMapping("/payment/hystrix/timeout/{id}")
    String paymentInfo_TimeOut(@PathVariable("id") Integer id);
}
