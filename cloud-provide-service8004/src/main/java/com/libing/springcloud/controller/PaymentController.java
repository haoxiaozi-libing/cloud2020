package com.libing.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author libing
 * @create 2021-03-06 22:56
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String servicePort;

    @GetMapping(value = "payment/zk")
    public String paymentZK() {

        return "springcloud with zookeeper " + servicePort + "\t" + UUID.randomUUID().toString();
    }


}
