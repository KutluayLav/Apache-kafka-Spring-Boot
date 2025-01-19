package com.kutluayulutas.kafka_test.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic kutluayTopic() {
        return TopicBuilder
                .name("kutluayulutas")
                .build();
    }
}
