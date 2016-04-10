package com.elin4it.ssm.service;

import com.elin4it.springmvcMaven.mapper.UserMapper;
import com.elin4it.springmvcMaven.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by 烽 on 2015/7/11.
 */
@Service
public class UserServiceImpl implements UserService {

    //User接口
    @Autowired
    public UserMapper userMapper;

    public int insertSelective(User record) {

       return  userMapper.insertSelective(record);

    }
}
