package com.libing.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

/**
 * @author libing
 * @create 2021-03-10 20:56
 */
@RestController
public class OrderController {


    private static final String ADDRESS_URL="http://cloud-provider-payment";
    @Value("${server.port}")
    private String serverPort;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/zk80")
    public String getServerPort(){
        String forObject = restTemplate.getForObject(ADDRESS_URL + "/payment/zk", String.class);
        return forObject;
    }


}
