package com.cloud.stream.kafka.producer;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    private String message;
    private int messageId;
}
