package com.roushan.producer.service;

import com.roushan.producer.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public String SendMessage(Course course)
    {
        kafkaTemplate.send("aditya", "course", course.toString());

        return "course message sent to the kafka server !";
    }
}
