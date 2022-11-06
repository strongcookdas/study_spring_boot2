package com.example.study_spring_boot.controller;

import com.example.study_spring_boot.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get-api")
public class GetController {


    @GetMapping(value = "/name")
    public String getName(){
        return "name";
    }

    //@GetMapping에 지정된 변수명과 @PathVariable의 variable1의 변수명이 일치해야 한다.
    @GetMapping("/variable1/{variable1}")
    public String getVariable1(@PathVariable String variable1){
        return variable1;
    }
    //@GetMapping과 @PathVariable에 지정된 변수명이 동일하지 은 경우,
    //@PathVariable의 뒤에 괄호를 열어 @GetMapping 어노테이션의 변수명을 지정
    @GetMapping("/variable2/{variable2}")
    public String variable2(@PathVariable("variable2") String var){
        return var;
    }

    //@RequestParam을 활용
    @GetMapping(value = "/request1")
    public String getRequestParam1(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String organization
    ){
        return name + " " + email + " " + organization;
    }

    @GetMapping(value = "/request2")
    public String getRequsetParam2(@RequestParam Map<String,String> param){
        StringBuilder sb = new StringBuilder();
        param.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });
        return sb.toString();
    }

    //dto 적용
    @GetMapping("/request3")
    public String getRequestparam(MemberDto memberDto){
        return memberDto.toString();
    }
}
