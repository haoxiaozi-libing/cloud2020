package com.libing.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @author lvlibing
 * @create 2021-05-22 9:42
 */
@Component
@EnableBinding(Sink.class)
public class ReceiveMessageListenerController {
@Value("${server.port}")
private String serverPort;

@StreamListener(Sink.INPUT)
public void input(Message<String> message){
    System.out.println("消费者1号,收到的消息"+message.getPayload()+"---端口--->"+serverPort);
}

}
