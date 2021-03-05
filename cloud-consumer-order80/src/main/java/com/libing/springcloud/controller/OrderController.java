package com.libing.springcloud.controller;

import com.libing.springcloud.entities.CommonResult;
import com.libing.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author libing
 * @create 2021-03-02 19:57
 */
@RestController
@Slf4j
public class OrderController {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    DiscoveryClient discoveryClient;

//    private static final String LOCAL_URL="http://localhost:8001";
    private static final String LOCAL_URL="http://CLOUD-PAYMENT-SERVICE";

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

    @GetMapping(value = "/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String element : services) {
            log.info("*****element: " + element);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri());
        }

        return this.discoveryClient;
    }


}
