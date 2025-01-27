package com.kutluayulutas.producer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class WikimediaTopicConfig {

    public NewTopic wikiMediaTopic() {
        return TopicBuilder
                .name("wikimedia-stream")
                .build();
    }
}
