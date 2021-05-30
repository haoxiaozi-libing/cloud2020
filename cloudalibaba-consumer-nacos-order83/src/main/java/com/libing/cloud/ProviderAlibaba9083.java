package com.libing.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author lvlibing
 * @create 2021-05-22 15:42
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ProviderAlibaba9083 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderAlibaba9083.class,args);
    }
}
