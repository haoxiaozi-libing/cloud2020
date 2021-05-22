package com.libing.springcloud.api;

import com.libing.springcloud.entities.CommonResult;
import com.libing.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author libing
 * @create 2021-03-17 22:00
 */
@RestController
public class PaymentFeignApi {

    @Autowired
    PaymentFeignClient paymentFeignClient;

    @GetMapping(value = "/feign/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        CommonResult<Payment> paymentById = paymentFeignClient.getPaymentById(id);

        return paymentById;
    }

    // ====================> zipkin+sleuth
    @GetMapping("/consumer/payment/zipkin")
    public String paymentZipkin() {
        String result = paymentFeignClient.getZK();
        return result;
    }
}
