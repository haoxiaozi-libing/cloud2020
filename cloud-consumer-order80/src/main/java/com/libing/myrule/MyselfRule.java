package com.libing.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author libing
 * @create 2021-03-12 20:36
 */
@Configuration
public class MyselfRule {
    @Bean
    public IRule iRule() {
        return new RandomRule(); //随机
    }

}
