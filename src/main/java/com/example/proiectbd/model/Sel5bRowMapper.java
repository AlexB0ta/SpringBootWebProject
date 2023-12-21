package com.example.proiectbd.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Sel5bRowMapper implements RowMapper<Sel5b> {

    @Override
    public Sel5b mapRow(ResultSet rs, int rowNum) throws SQLException {
        Sel5b sel5b=new Sel5b();
        sel5b.setDescriere(rs.getString(1));
        sel5b.setFabricant(rs.getString(2));
        return sel5b;
    }
}
