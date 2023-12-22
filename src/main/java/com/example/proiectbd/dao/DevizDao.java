package com.example.proiectbd.dao;

import com.example.proiectbd.model.Deviz;
import com.example.proiectbd.model.DevizRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DevizDao implements Dao<Deviz>{

    private final JdbcTemplate jdbcTemplate;

    public DevizDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Deviz> list() {
        String sql="select * from deviz";
        return jdbcTemplate.query(sql,new DevizRowMapper());
    }

    public void create(int id_d,String data_introducere,String aparat,String simptome,String defect,String data_constatare,String data_finalizare,int durata,double manopera_ora,double total,int id_client,int id_depanator){
        String sql="{call InsertIntoDeviz(?,?,?,?,?,?,?,?,?,?,?,?)}";
        jdbcTemplate.update(sql,id_d,data_introducere,aparat,simptome,defect,data_constatare,data_finalizare,durata,manopera_ora,total,id_client,id_depanator);
    }

    @Override
    public Object get(int id) {
        String sql="select * from deviz where id_d=?";
        List<Deviz> devizList=jdbcTemplate.query(sql,new Object[]{id},new DevizRowMapper());
        return devizList.isEmpty() ? null : devizList.get(0);
    }

    public void update(int id_d,String data_introducere,String aparat,String simptome,String defect,String data_constatare,String data_finalizare,int durata,double manopera_ora,double total,int id_client,int id_depanator){
        String sql="{call UpdateDeviz(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
        jdbcTemplate.update(sql, id_d, data_introducere, aparat, simptome, defect, data_constatare, data_finalizare, durata, manopera_ora, total, id_client, id_depanator);
    }

    @Override
    public void delete(int id) {
        String sql="{call DeleteDeviz(?)}";
        jdbcTemplate.update(sql,id);
    }
}
