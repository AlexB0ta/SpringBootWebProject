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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CrudControllerDelete {

    private final PersoanaDao persoanaDao;

    private final DevizDao devizDao;

    private final PiesaDao piesaDao;

    private final PiesaDevizDao piesaDevizDao;

    public CrudControllerDelete(PersoanaDao persoanaDao, DevizDao devizDao, PiesaDao piesaDao, PiesaDevizDao piesaDevizDao) {
        this.persoanaDao = persoanaDao;
        this.devizDao = devizDao;
        this.piesaDao = piesaDao;
        this.piesaDevizDao = piesaDevizDao;
    }

    @GetMapping("/deletePersoana")
    public String delPers(Model model){
        List<Persoana> persoanaList=persoanaDao.list();
        model.addAttribute("persoanaList",persoanaList);

        return "crud/delete/delete-persoana";
    }

    @GetMapping("/deletePersoana2")
    public String afterDelPers(@RequestParam(required = false)Integer id, Model model){
        model.addAttribute("id",id);
        persoanaDao.delete(id);
        return "redirect:/deletePersoana";
    }

    @GetMapping("/deleteDeviz")
    public String delDeviz(Model model){
        List<Deviz> devizList=devizDao.list();
        model.addAttribute("devizList",devizList);
        return "crud/delete/delete-deviz";
    }

    @GetMapping("/deleteDeviz2")
    public String afterDelDeviz(@RequestParam(required = false)Integer id_d,Model model){
        model.addAttribute("id_d",id_d);
        devizDao.delete(id_d);
        return "redirect:/deleteDeviz";
    }

    @GetMapping("/deletePiesa")
    public String delPiesa(Model model){
        List<Piesa> piesaList=piesaDao.list();
        model.addAttribute("piesaList",piesaList);
        return "crud/delete/delete-piesa";
    }

    @GetMapping("/deletePiesa2")
    public String afterDelPiesa(@RequestParam(required = false)Integer id_p,Model model){
        model.addAttribute("id_p",id_p);
        piesaDao.delete(id_p);
        return "redirect:/deletePiesa";
    }

    @GetMapping("/deletePiesaDeviz")
    public String delPiesaDeviz(Model model){
        List<PiesaDeviz> piesaDevizList=piesaDevizDao.list();
        model.addAttribute("piesaDevizList",piesaDevizList);
        return "crud/delete/delete-piesa-deviz";
    }

    @GetMapping("/deletePiesaDeviz2")
    public String afterDelPiesaDeviz(@RequestParam(required = false)Integer id_d,@RequestParam(required = false)Integer id_p,Model model){
        model.addAttribute("id_d",id_d);
        model.addAttribute("id_p",id_p);
        piesaDevizDao.delete2(id_d,id_p);
        return "redirect:/deletePiesaDeviz";
    }

}
