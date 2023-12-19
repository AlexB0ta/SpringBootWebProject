package com.example.proiectbd.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PeisaRowMapper implements RowMapper<Piesa> {


    @Override
    public Piesa mapRow(ResultSet rs, int rowNum) throws SQLException {
        Piesa piesa=new Piesa();
        piesa.setId_p(rs.getInt("id_p"));
        piesa.setDescriere(rs.getString("descriere"));
        piesa.setFabricant(rs.getString("fabricant"));
        piesa.setCantitate_stoc(rs.getInt("cantitate_stoc"));
        piesa.setPret_c(rs.getInt("pret_c"));
        return piesa;
    }
}
