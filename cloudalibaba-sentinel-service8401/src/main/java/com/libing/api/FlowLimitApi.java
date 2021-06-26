package com.libing.api;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author lvlibing
 * @create 2021-06-20 23:23
 */
@RestController
@Slf4j
public class FlowLimitApi {
    @GetMapping("/testA")
    public String testA() {
        return "--------->AAAAAAAA";
    }


    @GetMapping("/testB")
    public String testB() {
        System.out.println("--------->BBBBBBBBB");
        return "--------->BBBBBBBBB";
    }

    @GetMapping("/testD")
    public String testD() {
        log.info("testD....................熔断降级.....");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "--------->DDDDDDDDDDDDDDDDDDD 熔断降级";
    }


    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandler = "rollbackMethod")
    public String testHotKey(@RequestParam(value = "p1") String p1,@RequestParam(value = "p2") String p2) {
       log.info("testHotKey..................");
        return "--------->testHotKey";
    }



    public String rollbackMethod(String p1, String p2, BlockException exception) {
       log.info("rollbackMethod");
        return "--------->rollbackMethod";
    }

}
