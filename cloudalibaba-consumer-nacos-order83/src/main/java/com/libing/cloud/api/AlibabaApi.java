package com.libing.cloud.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lvlibing
 * @create 2021-05-22 15:43
 */
@RestController
public class AlibabaApi {
    @Autowired
    AlibabaClient alibabaClient;
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/consumer/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id) {
        return alibabaClient.get(id);
    }
}
