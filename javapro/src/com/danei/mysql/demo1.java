package com.danei.mysql;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zjq
 * \* Date: 2022/8/26
 * \* Time: 9:05
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class demo1 {
    public static void main(String[] args) throws Exception {
      String url = "jdbc:mysql:///shool?useSSL=false";
      String username = "root";
      String password = "Root123!";
      Connection conn = DriverManager.getConnection(url, username, password);
      String sql = "select * from student";
      PreparedStatement ps = conn.prepareStatement(sql);
      ResultSet rs = ps.executeQuery();
        List<Account> acc = new ArrayList<Account>();
      while(rs.next()){
         acc.add(new Account(rs.getString("student_id"),rs.getString("student_name"),rs.getInt("age"),rs.getString("sex"),rs.getString("class"),rs.getInt("fraction")));
      }
      System.out.println(acc.get(1).getName());
      ps.close();
      rs.close();
      conn.close();

    }
}
