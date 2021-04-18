package com.libing;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

/**
 * @author libing
 * @create 2021-04-17 16:46
 */

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashBoardMain {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashBoardMain.class,args);
    }

}
