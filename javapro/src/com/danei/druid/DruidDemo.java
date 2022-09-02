package com.danei.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zjq
 * \* Date: 2022/8/29
 * \* Time: 10:55
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class DruidDemo {
    public static void main(String[] args) throws Exception {
        // 加载配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("./src/druid.properties"));// 导入配置文件

        //获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        //获取conn对象
        Connection conn = dataSource.getConnection();

        String sql = "select * from student";

        PreparedStatement ps = conn.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        while(rs.next()) System.out.println(rs.getString("student_name"));

        conn.close();
        ps.close();
        rs.close();

    }
}
