package com.libing.api;

import com.libing.springcloud.entities.CommonResult;
import com.libing.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author lvlibing
 * @create 2021-06-26 22:43
 */
@FeignClient(value = "nacos-payment-provider")
@Component
public interface ConsumerClient {


    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id) ;
}
