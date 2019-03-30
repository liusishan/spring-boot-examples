package com.lss.web;

import com.lss.pojo.User;
import com.lss.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: lss
 * @Date: 2019/3/29 16:27
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class HelloController {

    @Autowired
    private UserService userService;


    @RequestMapping("/{id}")
    public User hello(@PathVariable Integer id){
        return userService.queryById(id);
    }

}
