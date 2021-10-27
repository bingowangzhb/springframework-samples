package com.wangzhb.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author ambow
 * @since 2021/10/14 15:01
 */
public class JdbcTransactionSample {


    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&useSSL=false&useServerPrepStmts=true&cachePrepStmts=true";
        String username = "root";
        String password = "root";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            String sql = "select * from res where id in (?, ?)";
            try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
              preparedStatement.setInt(1, 1);
              preparedStatement.setInt(2, 2);

              ResultSet resultSet = preparedStatement.executeQuery();
              while (resultSet.next()) {
                  System.out.println("resultSet = " + resultSet.getInt(2));
              }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
            try {
                if (conn != null) {
                    conn.rollback();
                }
            }
            catch (SQLException ex2) {
                ex2.printStackTrace();
            }
        }
        finally {
            if (conn != null) {
                try {
                    conn.close();
                }
                catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }

    }
}
