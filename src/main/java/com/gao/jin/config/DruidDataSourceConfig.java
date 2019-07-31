package com.gao.jin.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.gao.jin.dataSouece.MyDataSource;
import com.gao.jin.dataSouece.MyJdbcDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


@Configuration
public class DruidDataSourceConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druidDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        return druidDataSource;
    }

//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DataSource dataSource() throws ClassNotFoundException {
//        MyJdbcDataSource myJdbcDataSource = new MyJdbcDataSource();
//        myJdbcDataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        return myJdbcDataSource;
//    }

}
