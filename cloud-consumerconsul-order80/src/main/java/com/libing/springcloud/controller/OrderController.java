package com.libing.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.print.DocFlavor;

/**
 * @author libing
 * @create 2021-03-11 21:29
 */
@RestController
public class OrderController {


    private static final String ADDRESS_URL="http://consul-provider-payment";

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping(value = "consul/80")
    public String getConsul(){
       return restTemplate.getForObject(ADDRESS_URL+"/payment/consul", String.class);
    }

}
