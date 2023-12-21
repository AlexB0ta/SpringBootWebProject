package com.example.proiectbd.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class DevizRowMapper implements RowMapper<Deviz> {

    public Deviz mapRow(ResultSet resultSet,int RowNum) throws SQLException {
        Deviz deviz=new Deviz();
        deviz.setId_d(resultSet.getInt("id_d"));
        String aux=resultSet.getString("data_introducere").substring(0,10);
        deviz.setData_introducere(aux);
        deviz.setAparat(resultSet.getString("aparat"));
        deviz.setSimptome(resultSet.getString("simptome"));
        deviz.setDefect(resultSet.getString("defect"));
        aux=resultSet.getString("data_constatare").substring(0,10);
        deviz.setData_constatare(aux);
        aux=resultSet.getString("data_finalizare").substring(0,10);
        deviz.setData_finalizare(aux);
        deviz.setDurata(resultSet.getInt("durata"));
        deviz.setManopera_ora(resultSet.getDouble("manopera_ora"));
        deviz.setTotal(resultSet.getDouble("total"));
        deviz.setId_client(resultSet.getInt("id_client"));
        deviz.setId_depanator(resultSet.getInt("id_depanator"));
        return deviz;
    }
}
