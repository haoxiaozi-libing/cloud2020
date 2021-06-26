package com.libing.api;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.libing.handel.MyHandleMethod;
import com.libing.springcloud.entities.CommonResult;
import com.libing.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lvlibing
 * @create 2021-06-25 22:12
 */
@RestController
public class RateLimitApi {

    @GetMapping("/byResource")
    @SentinelResource(value = "byResource", blockHandler = "rollMethod")
    public CommonResult byResource() {
        return new CommonResult(200, "按照资源名称限流", new Payment(2020l, "serial0101"));
    }

    public CommonResult rollMethod(BlockException exception) {
        return new CommonResult(200, exception.getClass().getCanonicalName() + "\t f服务不可用", "");
    }

    @GetMapping("/libing/byUrl")
    @SentinelResource(value = "byUrl")
    public CommonResult byUrl() {
        return new CommonResult(200, "byUrl限流", new Payment(2020l, "serial0101"));
    }


    @GetMapping("/rateLimit/myHandleMethod")
    @SentinelResource(value = "myHandleMethod", blockHandlerClass = MyHandleMethod.class, blockHandler = "handlerException2")
    public CommonResult customerBlockHandler() {
        return new CommonResult(200, "按客戶自定义", new Payment(2020L, "serial003"));
    }

}
