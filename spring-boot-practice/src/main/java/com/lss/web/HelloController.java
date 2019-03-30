package com.lss.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: lss
 * @Date: 2019/3/29 16:27
 * @Description:
 */
@Slf4j
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        log.debug("hello method is running");
        return "hello boot";
    }

}
