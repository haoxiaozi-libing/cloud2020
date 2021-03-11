package com.libing.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author libing
 * @create 2021-03-10 20:53
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZk80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderZk80.class,args);
    }
}
