package com.elin4it.ssm.service;


import com.elin4it.springmvcMaven.pojo.User;

import java.util.List;

/**
 * Created by 烽 on 2015/7/11.
 */
public interface UserService {
    //添加一条用户信息
    int insertSelective(User record);

}
