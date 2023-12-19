package com.example.proiectbd.getinfo;

import com.example.proiectbd.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.security.DigestException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
@Service
public class FirstSel {
    private final JdbcTemplate jdbcTemplate;

    public FirstSel(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Piesa> secondSel(){
        String sql="SELECT * FROM Piesa WHERE cantitate_stoc < 5 ORDER BY cantitate_stoc, descriere DESC";
        List<Piesa> piesaList = jdbcTemplate.query(sql, new PeisaRowMapper());
        return piesaList;
    }

    public List<Sel4a> thirdSel(){
        String sql="SELECT pd.id_d, p.descriere, p.fabricant, p.pret_c, pd.pret_r FROM Piesa_Deviz pd JOIN Piesa p ON pd.id_p = p.id_p WHERE p.pret_c > pd.pret_r";
        List<Sel4a> sel4aList=jdbcTemplate.query(sql,new Sel4aRowMapper());
        return  sel4aList;
    }
}
