package com.danei.mysql;

import java.sql.*;

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
        String url = "jdbc:mysql://127.0.0.1:3306/shool?useSSL=false";
        String username = "root";
        String password = "Root123!";
        Connection conn = DriverManager.getConnection(url,username,password);
        String sql = "select student_name,teacher from student,course where course_id = 1 && student_id in (select stu_id from cou_stu where cou_id = 1)";
        PreparedStatement st = conn.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        while(rs.next()){
            System.out.println("name:"+ rs.getString("student_name") + "老师："+ rs.getString("teacher"));
        }
        rs.close();
        conn.close();
    }
}
