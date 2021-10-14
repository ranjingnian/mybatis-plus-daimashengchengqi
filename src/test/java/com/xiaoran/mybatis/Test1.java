package com.xiaoran.mybatis;


import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.LikeTable;
import com.baomidou.mybatisplus.generator.config.querys.MySqlQuery;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.junit.Test;

import java.io.InputStream;
import java.sql.Connection;

public class Test1 {
    public static  String url="jdbc:mysql://localhost:3306/use1";
    @Test
    public void test1() {

        FastAutoGenerator.create(
                new DataSourceConfig.Builder(url, "root", "mysql123456")
                .dbQuery(new MySqlQuery())
                .schema("xiaoran-mysql")
                                )
                //全局配置
                .globalConfig(builder -> {
                    builder.author("xiaoran")//作者
                            .outputDir("D:\\mybataisplus\\Testdemo2\\src\\main\\java")//文件生成路径
                            .fileOverride()//文件覆盖
                            .enableSwagger(); // 开启 swagger 模式,自动带上注释
                })
                //策略配置
                .strategyConfig(builder -> {
                    builder.enableCapitalMode()//开启全局大小写命名
                            .addTablePrefix("tbl")
                            .addInclude("tbl_employee");//生成的表
                })
                //包配置
                .packageConfig(builder -> {
                    builder.parent("com.xiaoran.mybatis") // 设置父包名
                            .mapper("mapper")
                            .service("service")
                            .controller("controller")
                            .entity("beans")
                            .xml("mapper");
                })
                //执行
                .execute();
    }
}
