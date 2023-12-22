package com.example.proiectbd.dao;

import com.example.proiectbd.model.Persoana;
import com.example.proiectbd.model.PersoanaRowMapper;
import org.springframework.dao.DataAccessException;
import org.springframework.data.relational.core.sql.In;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PersoanaDao implements Dao<Persoana>{

    private final JdbcTemplate jdbcTemplate;

    public PersoanaDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Persoana> list() {
        String sql="select * from persoana";
        return jdbcTemplate.query(sql,new PersoanaRowMapper());
    }

    public void create(Integer id, String nume, String email, String adresa) {
        String sql="{call insert_into_persoana(?,?,?,?)}";
        jdbcTemplate.update(sql,id,nume,email,adresa);
    }

    @Override
    public Persoana get(int id) {
        String sql="select * from persoana where id=?";
        List<Persoana> persoanaList=jdbcTemplate.query(sql,new Object[]{id},new PersoanaRowMapper());
        return persoanaList.isEmpty() ? null : persoanaList.get(0);
    }

    public void update(int id,String nume, String email, String adresa) {
        String sql="{call update_persoana(?,?,?,?)}";
        jdbcTemplate.update(sql,id,nume,email,adresa);
    }

    @Override
    public void delete(int id) {
        String sql="{call delete_persoana(?)}";
        jdbcTemplate.update(sql,id);
    }
}
