package com.lss.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: lss
 * @Date: 2019/3/29 16:27
 * @Description:
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello boot";
    }

}
