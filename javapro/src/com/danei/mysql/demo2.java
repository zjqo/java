package com.danei.mysql;

import java.sql.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zjq
 * \* Date: 2022/8/26
 * \* Time: 19:45
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class demo2 {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql:///test?usrSSL=false&useServerPrepStmts=true";
        String username = "root";
        String password = "Root123!";

        Connection conn = DriverManager.getConnection(url, username, password);
        String name = "zhangsan";
        String psd = "123";

        String sql = "select * from user where username = ? and password = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,name);
        ps.setString(2,psd);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            System.out.println("登录成功");

        }else{
            System.out.println(sql);
            System.out.println("失败");
        }

    }
}
