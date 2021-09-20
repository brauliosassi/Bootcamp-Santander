package com.digitalinnovationone.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloMessage(){
        return "Hello. Digital Innovation One";
    }
}
