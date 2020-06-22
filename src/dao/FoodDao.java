package dao;

import domain.Food;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import util.JDBCUtils;

public class FoodDao {
    //声明JDBCTemplate对象公用
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    public Food getFood (Food LGfood){

        try {
            String sql = "select * from food where foodname = ?";
            Food food = template.queryForObject(sql,
                    new BeanPropertyRowMapper<Food>(Food.class),
                    LGfood.getFoodname(),LGfood.getPrice());

            return food;
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
    }
}
