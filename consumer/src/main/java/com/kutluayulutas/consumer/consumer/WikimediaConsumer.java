package com.kutluayulutas.consumer.consumer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class WikimediaConsumer {

    private final Logger log = LoggerFactory.getLogger(WikimediaConsumer.class);

    @KafkaListener(topics = "wikimedia-stream",groupId = "myGroup")
    public void consumeMessage(String message){
        log.info(String.format("Consuming message from wikimedia-stream topic:: %s", message));
    }

}
