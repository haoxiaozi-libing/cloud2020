package com.libing.springcloud.conf;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author libing
 * @create 2021-03-17 22:53
 */
@Configuration
public class ConfigLog {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
