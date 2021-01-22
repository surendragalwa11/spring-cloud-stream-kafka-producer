package com.cloud.stream.kafka.processor;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;


@RestController
@AllArgsConstructor
@RequestMapping("/send")
public class KafkaProcessor {
    private final ProcessRequest processRequest;

    @PostMapping
    public void post(@RequestBody Message msg) {
        System.out.println("Sending message"+msg);
        processRequest.processRequest(msg);
    }
}
