package com.example.proiectbd.getinfo;

import com.example.proiectbd.model.Deviz;
import com.example.proiectbd.model.DevizRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;
import java.sql.Types;
import java.util.List;
import java.util.Map;

@Service
public class ProcDeviz {
    private final JdbcTemplate jdbcTemplate;

    public ProcDeviz(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Deviz> callProdDeviz(){
        SimpleJdbcCall jdbcCall=new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("select_from_deviz")
                .returningResultSet("deviz_cur", new DevizRowMapper())
                .declareParameters(
                        new SqlOutParameter("deviz_cur", Types.REF_CURSOR)
                );
        Map<String, Object> result = jdbcCall.execute();
        return (List<Deviz>) result.get("deviz_cur");
    }
}
