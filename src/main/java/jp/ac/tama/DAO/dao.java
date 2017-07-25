package jp.ac.tama.DAO;

import com.sun.org.apache.regexp.internal.RE;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
/**
 * Created by Administrator on 2017/07/25.
 */
public class dao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

public void insertUser(Integer cost){
    jdbcTemplate.update(
            "INSERT INTO simple_cost(cost)VALUES (?)",cost);

}
}

