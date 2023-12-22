package com.example.proiectbd.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersoanaRowMapper implements RowMapper<Persoana> {


    @Override
    public Persoana mapRow(ResultSet rs, int rowNum) throws SQLException {
        Persoana persoana=new Persoana();
        persoana.setId(rs.getInt("id"));
        persoana.setNume(rs.getString("nume"));
        persoana.setEmail(rs.getString("email"));
        persoana.setAdresa(rs.getString("adresa"));
        return persoana;
    }
}
