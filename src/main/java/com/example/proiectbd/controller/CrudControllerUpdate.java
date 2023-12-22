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
public class CrudControllerUpdate {
    private final PersoanaDao persoanaDao;

    private final DevizDao devizDao;
    private final PiesaDao piesaDao;

    private final PiesaDevizDao piesaDevizDao;

    public CrudControllerUpdate(PersoanaDao persoanaDao, DevizDao devizDao, PiesaDao piesaDao, PiesaDevizDao piesaDevizDao) {
        this.persoanaDao = persoanaDao;
        this.devizDao = devizDao;
        this.piesaDao = piesaDao;
        this.piesaDevizDao = piesaDevizDao;
    }
    @GetMapping("/updatePersoana")
    public String insertPers(Model model){
        List<Persoana> persoanaList=persoanaDao.list();
        model.addAttribute("persoanaList",persoanaList);

        return "crud/update/update-persoana";
    }

    @GetMapping("/updatePersoana2")
    public String afterInsertPers(@RequestParam(required = false)Integer id, @RequestParam(required = false)String nume, @RequestParam(required = false)String email, @RequestParam(required = false)String adresa, Model model){
        model.addAttribute("id",id);
        model.addAttribute("nume",nume);
        model.addAttribute("email",email);
        model.addAttribute("adresa",adresa);
        persoanaDao.update(id,nume,email,adresa);
        return "redirect:crud/update/updatePersoana";
    }

    @GetMapping("/updateDeviz")
    public String insertDeviz(Model model){
        List<Deviz> devizList=devizDao.list();
        model.addAttribute("devizList",devizList);
        return "crud/update/update-deviz";
    }

    @GetMapping("/updateDeviz2")
    public String afterInsertDeviz(@RequestParam(required = false)Integer id_d, @RequestParam(required = false)String data_introducere, @RequestParam(required = false)String aparat,
                                   @RequestParam(required = false)String simptome, @RequestParam(required = false)String defect, @RequestParam(required = false)String data_constatare,
                                   @RequestParam(required = false)String data_finalizare, @RequestParam(required = false)Integer durata, @RequestParam(required = false)Integer manopera_ora,
                                   @RequestParam(required = false)Double total, @RequestParam(required = false)Integer id_client,@RequestParam(required = false)Integer id_depanator,Model model) {
        model.addAttribute("id_d", id_d);
        model.addAttribute("data_introducere", data_introducere);
        model.addAttribute("aparat", aparat);
        model.addAttribute("simptome", simptome);
        model.addAttribute("defect", defect);
        model.addAttribute("data_constatare", data_constatare);
        model.addAttribute("data_finalizare", data_finalizare);
        model.addAttribute("duarata", durata);
        model.addAttribute("manopera_ora", manopera_ora);
        model.addAttribute("total", total);
        model.addAttribute("id_client", id_client);
        model.addAttribute("id_depanator", id_depanator);
        devizDao.update(id_d, data_introducere, aparat, simptome, defect, data_constatare, data_finalizare, durata, manopera_ora, total, id_client, id_depanator);
        return "redirect:/updateDeviz";
    }

    @GetMapping("/updatePiesa")
    public String insertPiesa(Model model){
        List<Piesa> piesaList=piesaDao.list();
        model.addAttribute("piesaList",piesaList);
        return "crud/update/update-piesa";
    }

    @GetMapping("/updatePiesa2")
    public String afterInsertPiesa(@RequestParam(required = false)Integer id_p, @RequestParam(required = false)String descriere, @RequestParam(required = false)String fabricant,
                                  @RequestParam(required = false)Integer cantitate_stoc,@RequestParam(required = false)Integer pret_c,Model model) {
        model.addAttribute("id_p", id_p);
        model.addAttribute("descriere", descriere);
        model.addAttribute("fabricant", fabricant);
        model.addAttribute("cantitate_stoc", cantitate_stoc);
        model.addAttribute("pret_c", pret_c);
        piesaDao.update(id_p,descriere,fabricant,cantitate_stoc,pret_c);
        return "redirect:/updatePiesa";
    }

    @GetMapping("/updatePiesaDeviz")
    public String insertPiesaDeviz(Model model){
        List<PiesaDeviz> piesaDevizList=piesaDevizDao.list();
        model.addAttribute("piesaDevizList",piesaDevizList);
        return "crud/update/update-piesa-deviz";
    }

    @GetMapping("/updatePiesaDeviz2")
    public String afterInsertPiesaDeviz(@RequestParam(required = false)Integer id_d,@RequestParam(required = false)Integer id_p,@RequestParam(required = false)Integer cantitate,
                                        @RequestParam(required = false)Float pret_r,Model model) {
        model.addAttribute("id_d", id_d);
        model.addAttribute("id_p", id_p);
        model.addAttribute("cantitate", cantitate);
        model.addAttribute("pret_r", pret_r);
        piesaDevizDao.update(id_d,id_p,cantitate,pret_r);
        return "redirect:/updatePiesaDeviz";
    }

}
