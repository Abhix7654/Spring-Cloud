package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/index")
    public String home() {
        return "index.html";
    }

    @RequestMapping("/ab")
    public String hometwo() {
        return "demo.html";
    }
    @RequestMapping("/login")
    public String showLoginPage() {
        return "login.html";
    }
    @RequestMapping("/logout")
    public String showLogoutPage() {
        return "logout.html";
    }

}
