package com.libing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lvlibing
 * @create 2021-06-20 23:21
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Sentinel8401{
    public static void main(String[] args) {
        SpringApplication.run(Sentinel8401.class,args);
    }

}
