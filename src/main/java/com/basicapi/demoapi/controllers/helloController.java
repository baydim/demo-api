package com.basicapi.demoapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class helloController {
    
    @GetMapping
    public String hello() {
        return "Hello World!";
    }

    @PostMapping
    public String helloPost(int number1, int number2  ) {

        int value =  number1 + number2;

        return String.valueOf("{ \"value\": " + value + " }");
    }

}
