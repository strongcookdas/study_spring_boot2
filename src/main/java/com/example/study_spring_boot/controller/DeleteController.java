package com.example.study_spring_boot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/delete-api")
public class DeleteController {
    @DeleteMapping(value = "/{variable}")
    public String DeleteVariable(@PathVariable String variable){
        return variable;
    }

    @DeleteMapping("/request1")
    public String getRequestParam1(@RequestParam String email){
        return "email : "+email;
    }
}
