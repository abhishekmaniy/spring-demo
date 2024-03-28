package com.boottest.springdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorld {
    
    @RequestMapping("/")
    public String HelloMessage() {
        return new String("Hello World");
    }
}
