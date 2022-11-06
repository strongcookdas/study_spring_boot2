package com.example.study_spring_boot.helloController;

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

    //@GetMapping과 @PathVariable에 지정된 변수명이 동일하지 않은 경우
    @GetMapping("/variable2/{variable2}")
    public String variable2(@PathVariable("variable2") String var){
        return var;
    }
}
