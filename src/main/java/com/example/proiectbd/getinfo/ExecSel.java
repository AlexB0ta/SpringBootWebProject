package com.example.proiectbd.getinfo;

import com.example.proiectbd.model.*;
import org.springframework.jdbc.core.*;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;

import java.sql.Types;
import java.util.List;
import java.util.Map;

@Service
public class ExecSel {
    private final JdbcTemplate jdbcTemplate;

    public ExecSel(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Deviz> firstSelProc(){
        SimpleJdbcCall jdbcCall=new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("select_from_deviz")
                .returningResultSet("deviz_cur", new DevizRowMapper())
                .declareParameters(
                        new SqlOutParameter("deviz_cur", Types.REF_CURSOR)
                );
        Map<String, Object> result = jdbcCall.execute();
        return (List<Deviz>) result.get("deviz_cur");
    }

    public List<Piesa> secondSel(int cantitate){
        String sql="SELECT * FROM Piesa WHERE cantitate_stoc < ? ORDER BY cantitate_stoc, descriere DESC";
        List<Piesa> piesaList = jdbcTemplate.query(sql,new Object[]{cantitate}, new PeisaRowMapper());
        return piesaList;
    }

    public List<Sel4a> thirdSel(){
        String sql="SELECT pd.id_d, p.descriere, p.fabricant, p.pret_c, pd.pret_r FROM Piesa_Deviz pd JOIN Piesa p ON pd.id_p = p.id_p WHERE p.pret_c > pd.pret_r";
        List<Sel4a> sel4aList=jdbcTemplate.query(sql,new Sel4aRowMapper());
        return  sel4aList;
    }

    public List<Sel4b> fourthSel()
    {
        String sql="SELECT pd1.id_p AS id_p1, pd2.id_p AS id_p2 FROM Piesa_Deviz pd1 JOIN Piesa_Deviz pd2 ON pd1.id_d = pd2.id_d AND pd1.id_p < pd2.id_p WHERE pd1.cantitate = pd2.cantitate";
        List<Sel4b> sel4bList=jdbcTemplate.query(sql,new Sel4bRowMapper());
        return sel4bList;
    }

    public List<Deviz> fifthSelWithParam(String piesaDescriere){
        String sql="SELECT * FROM Deviz WHERE id_d IN (SELECT id_d FROM Piesa_Deviz pd JOIN Piesa p ON pd.id_p = p.id_p WHERE p.descriere = ?)";
        return jdbcTemplate.query(sql, new Object[]{piesaDescriere}, new DevizRowMapper());
    }

    public List<Piesa> sixthSelProc(){
        SimpleJdbcCall jdbcCall=new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("GetMaxPretPiesaFabricant")
                .returningResultSet("piesaCursor",new Sel5bRowMapper())
                .declareParameters(
                        new SqlOutParameter("piesaCursor",Types.REF_CURSOR)
                );
        Map<String,Object> result=jdbcCall.execute();
        return (List<Piesa>) result.get("piesaCursor");
    }

    public List<Sel6a> seventhSelProc() {
        SimpleJdbcCall jdbcCall=new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("GetDepanatorDevizeCount")
                .returningResultSet("depanatorCursor",new Sel6aRowMapper())
                .declareParameters(
                        new SqlOutParameter("depanatorCursor",Types.REF_CURSOR)
                );
        Map<String ,Object> result=jdbcCall.execute();
        return (List<Sel6a>) result.get("depanatorCursor");
    }

    public List<Sel6b> eightSelProc(){
        SimpleJdbcCall jdbcCall=new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("SumCantitatePiesaDeviz")
                .returningResultSet("cantitateCursor",new Sel6bRowMapper())
                .declareParameters(
                        new SqlOutParameter("cantitateCursor",Types.REF_CURSOR)
                );
        Map<String ,Object>result=jdbcCall.execute();
        return (List<Sel6b>) result.get("cantitateCursor");
    }

}
