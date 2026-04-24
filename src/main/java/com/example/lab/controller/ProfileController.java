package com.example.lab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class ProfileController {

    @GetMapping("/") 
    public String index(Model model) {
        model.addAttribute("name", "Tanishq Saini");
        return "index";
    }
}
