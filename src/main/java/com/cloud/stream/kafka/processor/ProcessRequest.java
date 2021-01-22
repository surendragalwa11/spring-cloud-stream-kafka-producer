package com.cloud.stream.kafka.processor;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(Source.class)
@RequiredArgsConstructor
public class ProcessRequest {
    private final MessageGateway messageGateway;

    public void processRequest(Message msg) {
        messageGateway.send(msg);
    }
}
