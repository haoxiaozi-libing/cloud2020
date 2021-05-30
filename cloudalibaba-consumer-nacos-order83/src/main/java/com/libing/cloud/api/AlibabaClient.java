package com.libing.cloud.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author lvlibing
 * @create 2021-05-22 16:51
 */
@Component
@FeignClient(value = "nacos-payment-provider")
public interface AlibabaClient {
    @GetMapping("/payment/nacos/{id}")
    public String get(@PathVariable("id") Integer id);

}
