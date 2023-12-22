package com.example.proiectbd.controller;

import com.example.proiectbd.dao.DevizDao;
import com.example.proiectbd.dao.PersoanaDao;
import com.example.proiectbd.dao.PiesaDao;
import com.example.proiectbd.dao.PiesaDevizDao;
import com.example.proiectbd.model.Deviz;
import com.example.proiectbd.model.Persoana;
import com.example.proiectbd.model.Piesa;
import com.example.proiectbd.model.PiesaDeviz;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class CrudControllerRead {
    private final PersoanaDao persoanaDao;
    private final DevizDao devizDao;

    private final PiesaDao piesaDao;

    private final PiesaDevizDao piesaDevizDao;

    public CrudControllerRead(PersoanaDao persoanaDao, DevizDao devizDao, PiesaDao piesaDao, PiesaDevizDao piesaDevizDao) {
        this.persoanaDao = persoanaDao;
        this.devizDao = devizDao;
        this.piesaDao = piesaDao;
        this.piesaDevizDao = piesaDevizDao;
    }

    @GetMapping("/readPersoana")
    public String readPers(@RequestParam(required = false ,defaultValue = "101")Integer id,Model model){
        model.addAttribute("id",id);
        Persoana persoana=persoanaDao.get(id);
        if(persoana!=null) {
            model.addAttribute("persoana", persoana);
            return "crud/read/read-persoana";
        }
        else return "crud/read/error-read";
    }

    @GetMapping("/readDeviz")
    public String readDeviz(@RequestParam(required = false ,defaultValue = "1")Integer id_d,Model model){
        model.addAttribute("id_d",id_d);
        Deviz deviz= (Deviz) devizDao.get(id_d);
        if(deviz!=null){
            model.addAttribute("deviz",deviz);
            return "crud/read/read-deviz";
        }
        else return "crud/read/error-read";
    }

    @GetMapping("/readPiesa")
    public String readPiesa(@RequestParam(required = false ,defaultValue = "19")Integer id_p,Model model){
        model.addAttribute("id_p",id_p);
        Piesa piesa= (Piesa) piesaDao.get(id_p);
        if(piesa!=null){
            model.addAttribute("piesa",piesa);
            return "crud/read/read-piesa";
        }
        else return "crud/read/error-read";
    }

    @GetMapping("/readPiesaDeviz")
    public String readPiesaDeviz(@RequestParam(required = false ,defaultValue = "1")Integer id_d,@RequestParam(required = false ,defaultValue = "19")Integer id_p,Model model){
        model.addAttribute("id_d",id_d);
        model.addAttribute("id_p",id_p);
        PiesaDeviz piesaDeviz= (PiesaDeviz) piesaDevizDao.get2(id_d,id_p);
        if(piesaDeviz!=null){
            model.addAttribute("piesaDeviz",piesaDeviz);
            return "crud/read/read-piesa-deviz";
        }
        else return "crud/read/error-read";
    }

}
