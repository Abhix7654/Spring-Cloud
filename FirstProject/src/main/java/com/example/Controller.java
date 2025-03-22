package com.example;


import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/")
    public String home(){
        return "index.html";

    }

}
