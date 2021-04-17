package com.libing.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author libing
 * @create 2021-03-19 22:09
 */
//@EnableEurekaClient  为什么不标注；
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class ConsumerHystrix80 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerHystrix80.class, args);
    }
}
