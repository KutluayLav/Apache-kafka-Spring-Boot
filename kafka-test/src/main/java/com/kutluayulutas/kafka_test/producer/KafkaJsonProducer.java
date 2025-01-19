package com.kutluayulutas.kafka_test.producer;


import com.kutluayulutas.kafka_test.payload.Student;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaJsonProducer {

    private final KafkaTemplate<String, Student> kafkaTemplate;

    public KafkaJsonProducer(KafkaTemplate<String, Student> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(Student student) {
        kafkaTemplate.send("students", student);
    }
}
