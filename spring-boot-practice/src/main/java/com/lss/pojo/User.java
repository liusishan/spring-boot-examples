package com.lss.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: lss
 * @Date: 2019/3/29 16:24
 * @Description:
 */
@Data
public class User implements Serializable {

    // id
    private Integer id;
    // 用户名
    private String username;
    // 密码
    private String password;
    // 年龄
    private Integer age;
    // 性别
    private String sex;
    // email
    private String email;



}
