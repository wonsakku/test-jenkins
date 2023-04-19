package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class TestController {

    @Value("${message}")
    private String message;


    @GetMapping
    public String hello(){
        return "hello " + message
                + " (" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"))
                + ")";
    }
}


