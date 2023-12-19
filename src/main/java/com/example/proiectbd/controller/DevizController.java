package com.example.proiectbd.controller;

import com.example.proiectbd.getinfo.ProcDeviz;
import com.example.proiectbd.model.Deviz;
import com.example.proiectbd.model.Piesa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller
public class DevizController {

    private final ProcDeviz procDeviz;
    @Autowired
    public DevizController(ProcDeviz procDeviz) {
        this.procDeviz = procDeviz;
    }

    @GetMapping("/query1")
    public String afiseazaDevziele(Model model){
        List<Deviz> devize=procDeviz.callProdDeviz();
        model.addAttribute("devize",devize);
        return "afiseaza-devizele";
    }
}
