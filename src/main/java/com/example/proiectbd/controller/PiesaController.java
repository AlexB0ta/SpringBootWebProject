package com.example.proiectbd.controller;

import com.example.proiectbd.getinfo.FirstSel;
import com.example.proiectbd.model.Piesa;
import com.example.proiectbd.model.Sel4a;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class PiesaController {
    private final FirstSel firstSel;

    public PiesaController(FirstSel firstSel) {
        this.firstSel = firstSel;
    }

    @GetMapping("/query2")
    public String afiseazaPiesele(Model model){
        List<Piesa> piese=firstSel.secondSel();
        model.addAttribute("piese",piese);
        return "afiseaza-piesele";
    }

    @GetMapping("/query3")
    public String afiseazaSel4a(Model model){
        List<Sel4a> sel4aList=firstSel.thirdSel();
        model.addAttribute("sel4aList",sel4aList);
        return "afiseaza-sel4a";
    }

}
