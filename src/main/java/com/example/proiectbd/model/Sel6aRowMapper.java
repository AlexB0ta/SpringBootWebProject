package com.example.proiectbd.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Sel6aRowMapper implements RowMapper<Sel6a> {
    @Override
    public Sel6a mapRow(ResultSet rs, int rowNum) throws SQLException {
        Sel6a sel6a=new Sel6a();
        sel6a.setNume_depanator(rs.getString(1));
        sel6a.setCate_devize(rs.getInt(2));
        return sel6a;
    }
}
