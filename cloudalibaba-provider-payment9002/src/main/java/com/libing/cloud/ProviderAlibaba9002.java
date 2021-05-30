package com.libing.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lvlibing
 * @create 2021-05-22 15:42
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderAlibaba9002 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderAlibaba9002.class,args);
    }
}
