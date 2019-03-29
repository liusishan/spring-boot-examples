package com.lss.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @Auther: lss
 * @Date: 2019/3/29 14:01
 * @Description: jdbc配置
 */
@Configuration
//@PropertySource("classpath:jdbc.properties")
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {

//    @Value("${jdbc.url}")
//    String url;
//    @Value("${jdbc.driverClassName}")
//    String driverClassName;
//    @Value("${jdbc.username}")
//    String username;
//    @Value("${jdbc.password}")
//    String password;

//    @Bean
//    public DataSource dataSource(JdbcProperties properties) {
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName(properties.driverClassName);
//        dataSource.setUrl(properties.url);
//        dataSource.setUsername(properties.username);
//        dataSource.setPassword(properties.password);
//
//        return dataSource;
//    }

    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource() {
        return new DruidDataSource();
    }


}
