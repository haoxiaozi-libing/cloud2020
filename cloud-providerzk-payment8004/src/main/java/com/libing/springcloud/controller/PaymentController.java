package com.libing.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author libing
 * @create 2021-03-09 18:30
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/paymentzk")
    public String paymentZk() {
        return "这个zk端口" + port + "\t" + UUID.randomUUID().toString();
    }
}
