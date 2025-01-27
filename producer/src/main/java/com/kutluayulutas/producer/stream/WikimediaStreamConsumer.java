package com.kutluayulutas.producer.stream;

import com.kutluayulutas.producer.producer.WikimediaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class WikimediaStreamConsumer {

    private final Logger log = LoggerFactory.getLogger(WikimediaStreamConsumer.class);

    private final WebClient webClient;

    private final WikimediaProducer producer;


    public WikimediaStreamConsumer(WebClient.Builder webClientBuilder, WikimediaProducer producer) {
        this.webClient = webClientBuilder
                .baseUrl("https://stream.wikimedia.org/v2").build();
        this.producer = producer;
    }

    public void consumeStreamAndPublish(){
        webClient.get()
                .uri("/stream/recentchange")
                .retrieve()
                .bodyToFlux(String.class)
                .subscribe(producer::sendMessage);
    }
}
