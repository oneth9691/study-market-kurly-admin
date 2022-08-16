package com.example.studymarketkurlyadmin.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "어드민나이스";
    }

}