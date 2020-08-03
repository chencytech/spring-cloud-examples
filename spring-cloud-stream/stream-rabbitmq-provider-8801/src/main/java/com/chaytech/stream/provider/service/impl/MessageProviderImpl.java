package com.chaytech.stream.provider.service.impl;

import com.chaytech.stream.provider.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import java.util.UUID;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date 2020/08/02 22:21
 */
@EnableBinding(Source.class) // 定义消息发送通道
public class MessageProviderImpl implements IMessageProvider {

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private MessageChannel output; // 消息发送通道

    @Override
    public String send() {
        String uuid = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(uuid).build());
        System.out.println("[" + serverPort + "]消息发送成功：" + uuid);
        return uuid;
    }
}
