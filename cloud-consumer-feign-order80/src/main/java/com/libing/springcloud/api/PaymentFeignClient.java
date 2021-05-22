package com.libing.springcloud.api;

import com.libing.springcloud.entities.CommonResult;
import com.libing.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author libing
 * @create 2021-03-17 21:53
 */
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
@Component
public interface PaymentFeignClient {

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) ;
    @GetMapping(value = "/payment/zipkin")
    String getZK();
}
