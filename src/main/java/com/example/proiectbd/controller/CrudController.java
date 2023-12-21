package com.example.proiectbd.controller;

import com.example.proiectbd.getinfo.CreateTables;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CrudController {

    private final CreateTables createTables;

    public CrudController(CreateTables createTables) {
        this.createTables = createTables;
    }

    @GetMapping("/createPersoana")
    public String createPers(Model model){
        createTables.createPers();
        return "create-pers";
    }
}
