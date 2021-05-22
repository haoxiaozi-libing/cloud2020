package com.libing.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lvlibing
 * @create 2021-05-20 23:46
 */

// 消息驱动之生产者
@SpringBootApplication
@EnableEurekaClient
public class StreamMqMain8802 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMqMain8802.class,args);
    }
/*springCloud是一个构建消息驱动微服务的框架
* 应用程序通过inputs或者outputs来有springCloud的Stream中的binder对象交互
*input生产者
* output：消费者
* Stream中的消息通信方式遵循发布订阅模式--》topic主题进行广播，在rabbitMq中就是交换机，kafka中就是Topic
* 通过定义binder作为中间层，实现了应用程序与消息中间件细节之间的隔离
*
*
*
* */
}
