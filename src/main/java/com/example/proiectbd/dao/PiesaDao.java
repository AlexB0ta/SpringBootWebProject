package com.example.proiectbd.dao;

import com.example.proiectbd.model.PeisaRowMapper;
import com.example.proiectbd.model.Piesa;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PiesaDao implements Dao<Piesa> {

    private final JdbcTemplate jdbcTemplate;

    public PiesaDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Piesa> list() {
        String sql="select * from piesa";
        return jdbcTemplate.query(sql,new PeisaRowMapper());
    }

    public void create(int id_p,String decsirere,String fabricant,int cantitate_stoc,int pret_c){
        String sql="{call InsertIntoPiesa(?,?,?,?,?)}";
        jdbcTemplate.update(sql,id_p,decsirere,fabricant,cantitate_stoc,pret_c);
    }

    @Override
    public Object get(int id) {
        String sql="select * from Piesa where id_p=?";
        List<Piesa> piesaList=jdbcTemplate.query(sql,new Object[]{id},new PeisaRowMapper());
        return piesaList.isEmpty() ? null : piesaList.get(0);
    }

    public void update(int id_p,String decsirere,String fabricant,int cantitate_stoc,int pret_c) {
        String sql="{call UpdatePiesa(?,?,?,?,?)}";
        jdbcTemplate.update(sql,id_p,decsirere,fabricant,cantitate_stoc,pret_c);
    }

    @Override
    public void delete(int id) {
        String sql="{call DeletePiesa(?)}";
        jdbcTemplate.update(sql,id);
    }
}
