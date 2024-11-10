package com.practice.spring.security.sprign_security_practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String getMessage(){
        return "Hello World!!!";
    }
}
