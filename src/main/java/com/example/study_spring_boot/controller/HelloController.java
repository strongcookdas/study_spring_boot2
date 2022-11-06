package com.example.study_spring_boot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return "hello world";
    }

    //@GetMapping에 지정된 변수명과 @PathVariable의 variable1의 변수명이 일치해야한다.
    @GetMapping("/variable/{variable}")
    public String getVariable1(@PathVariable String variable){
        return variable;
    }
}
