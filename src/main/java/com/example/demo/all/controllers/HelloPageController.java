package com.example.demo.all.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloPageController {

    @GetMapping("/hello")
    public String helloPage(Model model) {
        model.addAttribute("str", "Hello main page");
        return "hello";
    }
}
