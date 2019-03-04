package com.lss.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: lss
 * @Date: 2019/3/4 09:56
 * @Description:
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld(){
        return "Hello world!";
    }
}
