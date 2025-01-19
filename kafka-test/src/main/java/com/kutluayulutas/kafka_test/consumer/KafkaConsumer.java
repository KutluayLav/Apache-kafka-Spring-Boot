package com.kutluayulutas.kafka_test.consumer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private final Logger log = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "kutluayulutas",groupId = "myGroup")
    public void consumeMessage(String message){
        log.info(String.format("Consuming message from kutluayulutas topic:: %s", message));


    }


}
