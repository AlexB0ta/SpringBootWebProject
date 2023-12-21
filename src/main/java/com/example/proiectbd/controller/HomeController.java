package com.example.proiectbd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "homepage";
    }

    @GetMapping("/interogari")
    public String interogari() {
        return "interogari";
    }

    @GetMapping("/crudhome")
    public String crudhome() {
        return "crud-home";
    }

    @GetMapping("/create")
    public String create() {
        return "create-table";
    }

}

