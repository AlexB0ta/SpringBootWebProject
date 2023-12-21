package com.example.proiectbd.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Sel6bRowMapper implements RowMapper<Sel6b> {
    @Override
    public Sel6b mapRow(ResultSet rs, int rowNum) throws SQLException {
        Sel6b sel6b=new Sel6b();
        sel6b.setDescriere(rs.getString(1));
        sel6b.setFabricant(rs.getString(2));
        sel6b.setCantitate_totala(rs.getInt(3));
        return sel6b;
    }
}
