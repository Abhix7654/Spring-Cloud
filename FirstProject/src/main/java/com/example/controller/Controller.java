package com.example.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/index")
    public String home(){
        return "index.html";

    }
    @GetMapping("/ab")
    public String hometwo(){
        return "demo.html";

    }

}