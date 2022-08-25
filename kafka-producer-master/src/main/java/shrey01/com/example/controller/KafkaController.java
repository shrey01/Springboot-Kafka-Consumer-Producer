package shrey01.com.example.controller;
/**
 * @author Shreyaskar Nath Tripathi 
 * Github.com/shrey01
 * @date 25th August 2022
 */
import lombok.RequiredArgsConstructor;
import shrey01.com.example.broker.producer.TopicProducer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {
    private final TopicProducer topicProducer;
    @GetMapping(value = "/send")
    public void send(){
        topicProducer.send("Shreyaskar's Kafka test..... msg");
    }
}
