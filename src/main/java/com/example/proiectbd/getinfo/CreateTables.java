package com.example.proiectbd.getinfo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.simple.SimpleJdbcCallOperations;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class CreateTables {
    private final JdbcTemplate jdbcTemplate;

    public CreateTables(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void createPers(){
        SimpleJdbcCallOperations simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("CreatePersoanaTable");

        Map<String, Object> result = simpleJdbcCall.execute();

    }
}
