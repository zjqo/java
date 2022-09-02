package com.danei.example;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.danei.druid.Brand;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zjq
 * \* Date: 2022/8/31
 * \* Time: 19:15
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class BrandTest {
    public static void main(String[] args) throws Exception {
        Properties prop = new Properties();
        prop.load(new FileInputStream("./src/druid.properties"));// 导入配置文件

        //获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        //获取conn对象
        Connection conn = dataSource.getConnection();
        Scanner sc = new Scanner(System.in);
        //System.out.println("请输入要修改品牌的ID");
        //String id = sc.nextLine();
        System.out.println("请输入要添加的品牌名");
        String brand_name = sc.nextLine();
        System.out.println("请输入企业名");
        String company_name = sc.nextLine();
        System.out.println("请输入宣传花费（万）");
        String ordered = sc.nextLine();
        System.out.println("请输入宣传标语");
        String description = sc.nextLine();
        System.out.println("是否上架（1上架，0下架）");
        String status = sc.nextLine();
        String sql = "update tb_brand set brand_name = ?,company_name = ?,description = ? where id = ? ";

        String sql2 = "insert into tb_brand (brand_name,company_name,ordered,description,status) value(?, ?,?, ?,?)";

        PreparedStatement pstm = conn.prepareStatement(sql2);
        //pstm.setInt(1,Integer.parseInt(null));
        pstm.setString(1,brand_name);
        pstm.setString(2,company_name);
        pstm.setInt(3,Integer.parseInt(ordered));
        pstm.setString(4,description);
        pstm.setInt(5,Integer.parseInt(status));
        int i = pstm.executeUpdate();
        System.out.println(i);
        /*ResultSet rs = pstm.executeQuery();
        Brand brand = null;
        ArrayList<Brand> brands= new ArrayList<>();
        while(rs.next()){
            brand = new Brand();
            brand.setId(rs.getInt("id"));
            brand.setBrandName(rs.getString("brand_name"));
            brand.setCompanyName(rs.getString("company_name"));
            brand.setOrdered(rs.getInt("ordered"));
            brand.setDescription(rs.getString("description"));
            brand.setStatus(rs.getInt("status"));
            brands.add(brand);
        }
        System.out.println(brands);*/
        conn.close();
        pstm.close();
        // rs.close();
    }
}
