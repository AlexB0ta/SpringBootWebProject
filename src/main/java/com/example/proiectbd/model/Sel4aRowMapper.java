package com.example.proiectbd.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Sel4aRowMapper  implements RowMapper<Sel4a> {

    @Override
    public Sel4a mapRow(ResultSet rs, int rowNum) throws SQLException {
        Sel4a sel4a=new Sel4a();
        sel4a.setId_d(rs.getInt(1));
        sel4a.setDescriere(rs.getString(2));
        sel4a.setFabricant(rs.getString(3));
        sel4a.setPret_c(rs.getDouble(4));
        sel4a.setPret_r(rs.getDouble(5));
        return sel4a;
    }
}
