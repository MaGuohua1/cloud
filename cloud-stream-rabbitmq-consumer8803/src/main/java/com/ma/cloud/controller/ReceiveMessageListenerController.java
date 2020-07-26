package com.ma.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;

/**
 * @author MaGuohua
 * @version v1.0
 * @class com.ma.cloud.controller.ReceiveMessageListenerController
 * @description DOTO
 * @since 2020/7/13 15:21
 */
@EnableBinding(Sink.class)
public class ReceiveMessageListenerController {
    @Value("${server.port}")
    private String port;

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message) {
        System.out.println("消费者2号，------->接受到的消息："+message.getPayload()+"\tport:"+port);
    }
}
