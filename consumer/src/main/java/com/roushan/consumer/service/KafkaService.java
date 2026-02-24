package com.roushan.consumer.service;

import com.roushan.consumer.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    private String message;

    @KafkaListener(topics = "aditya", groupId = "costumer-group")
    public void consumer(String course)
    {
        message = course + "got the data from kafka on consumer side !";
        System.out.println(message);

    }

    public String getMessage(){
        return message;
    }
}
