package com.lss.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @Auther: lss
 * @Date: 2019/3/29 14:02
 * @Description:
 */
@RestController
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("/hello")
    public String hello(){
        return "Hello Boot";
    }
}
