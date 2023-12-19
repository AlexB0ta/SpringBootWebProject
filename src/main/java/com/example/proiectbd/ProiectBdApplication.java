package com.example.proiectbd;

import com.example.proiectbd.getinfo.FirstSel;
import com.example.proiectbd.model.Deviz;
import com.example.proiectbd.model.Piesa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@SpringBootApplication
public class ProiectBdApplication {

    private static FirstSel firstSel;

    public ProiectBdApplication(FirstSel firstSel) {
        this.firstSel = firstSel;
    }

    public static void main(String[] args) {
        SpringApplication.run(ProiectBdApplication.class, args);
    }

}
