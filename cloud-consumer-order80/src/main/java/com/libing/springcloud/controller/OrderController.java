package com.libing.springcloud.controller;

import com.libing.springcloud.entities.CommonResult;
import com.libing.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author libing
 * @create 2021-03-02 19:57
 */
@RestController
@Slf4j
public class OrderController {
    @Autowired
    RestTemplate restTemplate;

    private static final String LOCAL_URL="http://localhost:8001";

    @PostMapping("/consumer/payment/create")
    public CommonResult<Payment> createPayment(@RequestBody Payment payment){
        CommonResult commonResult = restTemplate.postForObject(LOCAL_URL + "/payment/create", payment, CommonResult.class);
        return commonResult;
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") String id){
        int a=90;
        CommonResult commonResult = restTemplate.getForObject(LOCAL_URL + "/payment/get/"+id, CommonResult.class);
        return commonResult;
    }


}
