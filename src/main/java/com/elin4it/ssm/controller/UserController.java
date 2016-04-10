package com.elin4it.ssm.controller;

import com.elin4it.springmvcMaven.pojo.User;
import com.elin4it.ssm.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 控制器类
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    public UserService userService;

    @RequestMapping("/createUser")
    public  void  createUser(HttpServletRequest request, HttpServletResponse response)throws Exception{
        String userName = request.getParameter("userName");
        User  user = new User();
        user.setName(userName);
        int result = userService.insertSelective(user);
        Map map=new HashMap();
        map.put("result", result);
        ObjectMapper  objectMapper = new ObjectMapper();
        String json =  objectMapper.writeValueAsString(map);
        response.getWriter().write(json);
    }



}
