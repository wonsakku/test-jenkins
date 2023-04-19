package com.example.demo.controller;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class TestControllerTest {

    @Test
    void test() {
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")));
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println(LocalDateTime.now());
    }

}
