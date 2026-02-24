package com.roushan.consumer.controller;

import com.roushan.consumer.model.Course;
import com.roushan.consumer.service.KafkaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    private KafkaService service;

    @GetMapping("/get-course")
    public ResponseEntity<String> getCourse()
    {
        String response = service.getMessage();

        return new ResponseEntity<String>(response, HttpStatus.OK);
    }
}

