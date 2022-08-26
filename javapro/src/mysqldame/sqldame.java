package mysqldame;
import java.sql.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zjq
 * \* Date: 2022/8/24
 * \* Time: 20:45
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public final class sqldame {
        public static void main(String[] args) throws Exception {
            //1. 注册驱动
            // Class.forName("com.mysql.jdbc.Driver");//mysql 5.0 后可以不用注册驱动

            //2. 获取连接
            String url = "jdbc:mysql://127.0.0.1:3306/shool?useSSL=false";// 连接本机mysql可以省略IP和端口号
            String username = "root";
            String password = "Root123!";
            Connection conn = DriverManager.getConnection(url, username, password);
            //3. 定义sql
            //String sql = "update student set student_name = \"曾金强\" where student_id = \"123456121\"";

            String sql = "create database book";

            //String sql2 = "select * from student";
            Statement statement = conn.createStatement();
            // PreparedStatement ps = conn.prepareStatement(sql);

            int i = statement.executeUpdate(sql);
            System.out.println(i);

           /* ResultSet rs = ps.executeQuery(); //对查询结果集进行封装
            while(rs.next()){
                System.out.println("id"+rs.getString(1)+"name"+rs.getString(2)+"age"+rs.getInt(3)+"sex"+rs.getString(4)+"class"+rs.getString(5)+"fs"+rs.getInt(6));
            }*/
            //4. 获取执行sql的对象 Statement
            // Statement stmt = conn.createStatement();
            //5. 执行sql
            //int count = stmt.executeUpdate(sql2);//受影响的行数
            //6. 处理结果
            //System.out.println(count);
            //7. 释放资源
            statement.close();
            conn.close();
        }

}



