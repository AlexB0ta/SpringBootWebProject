package com.example.proiectbd.dao;

import com.example.proiectbd.model.PeisaRowMapper;
import com.example.proiectbd.model.Piesa;
import com.example.proiectbd.model.PiesaDeviz;
import com.example.proiectbd.model.PiesaDevizRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PiesaDevizDao implements Dao<PiesaDeviz> {

    private final JdbcTemplate jdbcTemplate;

    public PiesaDevizDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<PiesaDeviz> list() {
        String sql="select * from piesa_deviz";
        return jdbcTemplate.query(sql,new PiesaDevizRowMapper());
    }

    @Override
    public Object get(int id) {
        return null;
    }

    public void create(int id_d,int id_p,int cantitate,float pret_r){
        String sql="{call InsertIntoPiesaDeviz(?,?,?,?)}";
        jdbcTemplate.update(sql,id_d,id_p,cantitate,pret_r);
    }

    public Object get2(int id_d,int id_p) {
        String sql="select * from Piesa_Deviz where id_d=? and id_p=?";
        List<PiesaDeviz>piesaDevizList=jdbcTemplate.query(sql,new Object[]{id_d,id_p},new PiesaDevizRowMapper());
        return piesaDevizList.isEmpty() ? null : piesaDevizList.get(0);
    }

    public void update(int id_d,int id_p,int cantitate,float pret_r){
        String sql="{call UpdatePiesaDeviz(?,?,?,?)}";
        jdbcTemplate.update(sql,id_d,id_p,cantitate,pret_r);
    }

    @Override
    public void delete(int id) {
    }

    public void delete2(int id_d,int id_p) {
        String sql="{call DeletePiesaDeviz(?,?)}";
        jdbcTemplate.update(sql,id_d,id_p);
    }
}
