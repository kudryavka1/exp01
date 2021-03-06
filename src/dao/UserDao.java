package dao;


import domain.User;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import util.JDBCUtils;

import java.util.List;

/**
 * 操作数据库中User表的类
 */
public class UserDao {

    //声明JDBCTemplate对象公用
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    //登陆方法

    public User login (User loginUser){
        try {
            String sql = "select * from user where username=? and password=?";
            //调用query方法
            User user = template.queryForObject(sql,
                    new BeanPropertyRowMapper<User>(User.class),
                    loginUser.getUsername(), loginUser.getPassword());

            return user;
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean register (User loginUser){
        String sql1 = "select * from user where username= ?";
        String sql = "INSERT INTO user VALUES(null,?,?)";
        List<User> list= template.query(sql1,new BeanPropertyRowMapper<User>(User.class),loginUser.getUsername());
        if(list.isEmpty()){
            template.update(sql,loginUser.getUsername(),loginUser.getPassword());
            return true;
        }else {

            return false;
        }

    }

/*
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("1233");
        user.setPassword("123");
        UserDao dao = new UserDao();
        System.out.println(dao.register(user));


    }
*/

}
