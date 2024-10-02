package ICET.repositery.impl;

import ICET.repositery.NativeStudentRepositery;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collections;


@Repository
@RequiredArgsConstructor
public class NativeStudentRepositeryImpl implements NativeStudentRepositery {

    final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    final JdbcTemplate jdbcTemplate;

public Long getRecordCount() {

    return jdbcTemplate.queryForObject("SELECT COUNT(*) FROM studentmgt", Long.class);
}

    public Long getRecordCount(String name){


    return namedParameterJdbcTemplate.queryForObject("SELECT COUNT(*) FROM studentmgt WHERE age > :age", Collections.singletonMap("age",name), Long.class);
    }

}
