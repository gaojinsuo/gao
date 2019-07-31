package com.gao.jin.web;

import com.gao.jin.config.RabbitMqConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.io.Console;
import java.time.LocalDateTime;

@RestController
public class ProducerController {
    @Autowired
    private RabbitTemplate rabbitTemplate;


    @GetMapping("/sendMessage")
    public Object sendMessage() {
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                String value = LocalDateTime.now().toString();
                CorrelationData correlationData = new CorrelationData();
                correlationData.setId("we");
//                rabbitTemplate.convertAndSend(RabbitMqConfig.EXCHANGE_NAME, RabbitMqConfig.ROUTING_KEY, "user-key",correlationData);
                rabbitTemplate.convertAndSend(RabbitMqConfig.EXCHANGE_NAME, "student-key", "student-key");
            }
        }).start();

        return "ok";
    }
}
