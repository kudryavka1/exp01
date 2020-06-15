package dao;

import until.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyDAO {

    public static void main(String[] args) {

        System.out.println(login("123456", "123456"));
    }


    public static boolean register(String username, String password) {
        String sql = "INSERT INTO user VALUES(null,?,?) ";
        String sql2 = "select 1 from user where username= ?  LIMIT 1";
        Connection conn = null;
        PreparedStatement pstmt = null;
        PreparedStatement pstmt2 = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();

            pstmt2 = conn.prepareStatement(sql2);
            pstmt2.setString(1, username);
            rs = pstmt2.executeQuery();
            if (rs.next()) {
                System.out.println("该用户已注册！！！");
                return false;
            } else {
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, username);
                pstmt.setString(2, password);
                pstmt.executeUpdate();

                System.out.println("注册成功");
                return true;
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            JDBCUtils.close(pstmt, conn);
        }
        System.out.println("注册失败");
        return false;
    }

    public static boolean login(String username, String password) {
        String sql = "select 1 from user where username= ? and password = ? LIMIT 1";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            conn.setAutoCommit(false);
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            rs = pstmt.executeQuery();
            conn.commit();
            if (rs.next()) {
                System.out.println("登陆成功");
                return true;
            }
            System.out.println("登陆失败");
            return false;


        } catch (SQLException e) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();

        } finally {
            JDBCUtils.close(pstmt, conn);
        }
        System.out.println("登陆失败");
        return false;

    }
    public static boolean updatePassword (String username,String password){
        //TODO
        return false;
    }


}
