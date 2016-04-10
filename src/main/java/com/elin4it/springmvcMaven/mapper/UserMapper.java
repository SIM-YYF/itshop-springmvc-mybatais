package com.elin4it.springmvcMaven.mapper;

import com.elin4it.springmvcMaven.pojo.User;

import java.util.List;

public interface UserMapper {

    //根据用户id，删除用户
    int deleteUserById(String id);

    //添加一条用户信息
    int insertSelective(User record);

    //根据用户id，查询用户信息
    User queryUserById(String id);

    //查询所有用户
    List<User> queryAllUser();

    //更改用户信息
    int updateByUserSelective(User record);


}