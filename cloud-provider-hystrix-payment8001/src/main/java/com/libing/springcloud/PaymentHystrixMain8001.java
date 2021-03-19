package com.libing.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author libing
 * @create 2021-03-17 23:31
 */
@SpringBootApplication
@EnableFeignClients
public class PaymentHystrixMain8001 {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(PaymentHystrixMain8001.class, args);
    }
}