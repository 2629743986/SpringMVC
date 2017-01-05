package com.wangjie.spring.service.impl;

import com.wangjie.spring.dao.UserMapper;
import com.wangjie.spring.model.User;
import com.wangjie.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * Created by wangjie on 2016/4/19 0019.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public User getUserById(int userId) {
        return this.userMapper.selectByPrimaryKey(userId);
    }

}
