package com.example.proiectbd.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Sel4bRowMapper implements RowMapper<Sel4b> {
    @Override
    public Sel4b mapRow(ResultSet rs, int rowNum) throws SQLException {
        Sel4b sel4b=new Sel4b();
        sel4b.setId_piesa1(rs.getInt(1));
        sel4b.setId_piesa2(rs.getInt(2));
        return sel4b;
    }
}
