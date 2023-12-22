package com.example.proiectbd.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PiesaDevizRowMapper implements RowMapper<PiesaDeviz> {

    @Override
    public PiesaDeviz mapRow(ResultSet rs, int rowNum) throws SQLException {
        PiesaDeviz piesaDeviz=new PiesaDeviz();
        piesaDeviz.setId_d(rs.getInt(1));
        piesaDeviz.setId_p(rs.getInt(2));
        piesaDeviz.setCantiate(rs.getInt(3));
        piesaDeviz.setPret_r(rs.getFloat(4));
        return piesaDeviz;
    }
}
