package com.cloud.stream.kafka.producer;

import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.stereotype.Component;

@Component
@MessagingGateway
public interface MessageGateway {
    @Gateway(requestChannel = Source.OUTPUT)
    void send(Message message);
}
