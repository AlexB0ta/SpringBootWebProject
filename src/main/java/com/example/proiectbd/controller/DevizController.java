package com.example.proiectbd.controller;

import com.example.proiectbd.getinfo.ExecSel;
import com.example.proiectbd.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class DevizController {

    private final ExecSel execSel;
    @Autowired
    public DevizController(ExecSel execSel) {
        this.execSel = execSel;
    }

    @GetMapping("/query1")
    public String afiseazaDevziele(Model model){
        List<Deviz> devize=execSel.firstSelProc();
        model.addAttribute("devize",devize);
        return "afiseaza-devizele";
    }

    @GetMapping("/query2")
    public String afiseazaPiesele(@RequestParam(required = false, defaultValue = "5")int cantitate,Model model){
        model.addAttribute("cantitate",cantitate);
        List<Piesa> piese=execSel.secondSel(cantitate);
        model.addAttribute("piese",piese);
        return "afiseaza-piesele";
    }

    @GetMapping("/query3")
    public String afiseazaSel4a(Model model){
        List<Sel4a> sel4aList=execSel.thirdSel();
        model.addAttribute("sel4aList",sel4aList);
        return "afiseaza-sel4a";
    }

    @GetMapping("/query4")
    public String afiseazaSel4b(Model model){
        List<Sel4b> sel4bList=execSel.fourthSel();
        model.addAttribute("sel4bList",sel4bList);
        return "afiseaza-sel4b";
    }

    @GetMapping("/query5")
    public String afiseazaSel5a(@RequestParam(required = false, defaultValue = "șurub")String piesaDescriere, Model model){
        model.addAttribute("piesaDescriere",piesaDescriere);
        List<Deviz> devizList= execSel.fifthSelWithParam(piesaDescriere);
        model.addAttribute("devizList",devizList);
        return "afiseaza-sel5a";
    }

    @GetMapping("/query6")
    public String afiseazaSel5b(Model model){
        List<Piesa> piesaList=execSel.sixthSelProc();
        model.addAttribute("piesaList",piesaList);
        return "afiseaza-sel5b";
    }

    @GetMapping("/query7")
    public String afiseazaSel6a(Model model){
        List<Sel6a> sel6aList=execSel.seventhSelProc();
        model.addAttribute("sel6aList",sel6aList);
        return "afiseaza-sel6a";
    }

    @GetMapping("/query8")
    public String afiseazaSel6b(Model model){
        List<Sel6b> sel6bList=execSel.eightSelProc();
        model.addAttribute("sel6bList",sel6bList);
        return "afiseaza-sel6b";
    }

}
