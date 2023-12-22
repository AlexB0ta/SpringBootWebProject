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
        return "selects/interogari";
    }

    @GetMapping("/crudhome")
    public String crudhome() {
        return "crud/crud-home";
    }

    @GetMapping("/create")
    public String create() {
        return "crud/create/create-table";
    }

    @GetMapping("/read")
    public String read(){
        return "crud/read/read-table";
    }

    @GetMapping("/update")
    public String update(){
        return "crud/update/update-table";
    }

    @GetMapping("/delete")
    public String delete(){
        return "crud/delete/delete-table";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

}

