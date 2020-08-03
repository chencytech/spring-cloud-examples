package com.chaytech.stream.consumer.listener;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * 消息监听器
 *
 * @author Chency
 * @email chaytech@163.com
 * @Date 2020/08/02 22:45
 */
@Component
@EnableBinding(Sink.class)
public class MessageListener {

    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message){
        System.out.println("[" + serverPort + "]接收到的消息：" + message.getPayload());
    }
}
