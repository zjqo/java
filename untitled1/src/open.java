

import java.sql.*;
/**
 * 测试连接数据库是否成功
 * @author 明
 *
 */
public class open{
    public static void main(String args[]) {
        String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";//这是要连接的数据库加载器
        String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=std";//这是要连接的端口号以及数据库名称
        String userName="sa";//用户名
        String userpwd="123456";//用户密码
        try {
            Class.forName(driverName);
            System.out.println("加载驱动成功");
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            System.out.println("加载驱动失败");
        }
        try {
            Connection dbConn=DriverManager.getConnection(dbURL,userName,userpwd);
            System.out.println("连接数据库成功");
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            System.out.println("数据库连接失败");
        }
    }
}
