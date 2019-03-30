package com.lss.service;

import com.lss.mapper.UserMapper;
import com.lss.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Auther: lss
 * @Date: 2019/3/30 09:24
 * @Description:
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryById(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public void insertUser(User user){
        userMapper.insert(user);
    }



}
