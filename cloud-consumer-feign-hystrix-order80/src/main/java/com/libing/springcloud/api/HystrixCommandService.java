package com.libing.springcloud.api;

import org.springframework.stereotype.Component;

/**
 * @author libing
 * @create 2021-04-17 15:37
 */
@Component
public class HystrixCommandService implements ConsumerHystrixClient{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "服务器宕机";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "内部错误或者连接超时";
    }
}
