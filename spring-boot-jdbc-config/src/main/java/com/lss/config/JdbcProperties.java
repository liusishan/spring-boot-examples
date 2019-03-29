package com.lss.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Auther: lss
 * @Date: 2019/3/29 14:33
 * @Description:
 */
@ConfigurationProperties(prefix = "jdbc")
@Data
public class JdbcProperties {
    String url;
    String driverClassName;
    String username;
    String password;

}
