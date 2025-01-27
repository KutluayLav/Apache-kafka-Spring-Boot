package com.kutluayulutas.producer.rest;


import com.kutluayulutas.producer.stream.WikimediaStreamConsumer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/wikimedia")
public class WikimediaController {

    private final WikimediaStreamConsumer wikimediaStreamConsumer;

    public WikimediaController(WikimediaStreamConsumer wikimediaStreamConsumer) {
        this.wikimediaStreamConsumer = wikimediaStreamConsumer;
    }

    @GetMapping
    public void startPublishing(){
        wikimediaStreamConsumer.consumeStreamAndPublish();
    }
}
