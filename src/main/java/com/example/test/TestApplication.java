package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestApplication {

    @RequestMapping("/")
    public String hello() {
        return "Hello world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

}