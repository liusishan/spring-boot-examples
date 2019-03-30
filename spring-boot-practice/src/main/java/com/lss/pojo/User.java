package com.lss.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * @Auther: lss
 * @Date: 2019/3/29 16:24
 * @Description:
 */
@Data
@Table(name="user")
public class User implements Serializable {

    // id
    @Id
    @KeySql(useGeneratedKeys = true)
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
    // 备注
    @Transient
    private String note;



}
