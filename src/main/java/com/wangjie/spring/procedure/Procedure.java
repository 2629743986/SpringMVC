package com.wangjie.spring.procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import oracle.jdbc.OracleTypes;

/**
 * Created by 26297 on 2017/6/7.
 */
public class Procedure {
    private Connection conn;
    private CallableStatement stat;
    private ResultSet rs;

    String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
    String driverName = "oracle.jdbc.driver.OracleDriver";
    String username = "scott";
    String password = "tiger";
    String sql = "call queryempinfo(?,?,?,?)";

    // 调用存储过程
    public void callProcedure() {
        try {
            Class.forName(driverName);
            conn = DriverManager.getConnection(url, username, password);
            stat = conn.prepareCall(sql);

            // 一个输入参数和三个输出参数
            stat.setInt(1, 7566);
            stat.registerOutParameter(2, OracleTypes.VARCHAR);
            stat.registerOutParameter(3, OracleTypes.NUMBER);
            stat.registerOutParameter(4, OracleTypes.VARCHAR);
            stat.execute();

            String name = stat.getString(2);
            int sal = stat.getInt(3);
            String job = stat.getString(4);

            System.out.println("name: " + name + ", sal: " + sal + ", job: " + job);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(conn, stat, rs);
        }
    }

    // 关闭连接
    public void close(Connection conn, CallableStatement stat, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                rs = null;
            }
        }
        if (stat != null) {
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                stat = null;
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                conn = null;
            }
        }
    }

    public static void main(String[] args) {
        new Procedure().callProcedure();
    }
}
