//package com.elin4it.ssm.controller;
//
//import com.elin4it.ssm.service.UserService;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * Created by 烽 on 2015/7/11.
// */
//@Controller
//@RequestMapping("/user")
//public class UserController2 {
//
//    //service类
//    @Autowired
//    public UserService userService;
//
//    /**
//     * 查找所用用户控制器方法
//     * @return
//     * @throws Exception
//     */
//    @RequestMapping("/findUser")
//    public ModelAndView findUser()throws Exception{
//        ModelAndView modelAndView = new ModelAndView();
//
//        //调用service方法得到用户列表
////        List<String> users = userService.findUser();
//        //将得到的用户列表内容添加到ModelAndView中
////        modelAndView.addObject("users",users);
//        //设置响应的jsp视图
//        modelAndView.setViewName("findUser");
//
//        return modelAndView;
//    }
//
//    @RequestMapping("/findUser2")
//    public  ModelAndView findUser2()throws Exception{
//        Map map=new HashMap();
//        map.put("result", "袁文飞");
//        return new ModelAndView(new MappingJackson2JsonView(), map);
//    }
//
//    @RequestMapping("/findUser3")
//    public  void  findUser3(HttpServletRequest request, HttpServletResponse response)throws Exception{
//        Map map=new HashMap();
//        map.put("result", "success");
//        ObjectMapper  objectMapper = new ObjectMapper();
//        String json =  objectMapper.writeValueAsString(map);
//        response.getWriter().write(json);
//    }
//
////----------------------  表单提交数据  服务器接收数据-----------------------------//
//    @RequestMapping("/createUser")
//    public  void  createUser(@RequestParam(value = "userName") String userName)throws Exception{
//
//    }
//
////    @RequestMapping("/createUser1")
////    public  void  createUser1(@RequestBody User user)throws Exception{
////
////    }
//
//    @RequestMapping("/createUser2")
//    public  void  createUser2(@PathVariable int id, @PathVariable String name)throws Exception{
//
//    }
//
//
//    @RequestMapping("/createUser3")
//    public  void  createUser3(HttpServletRequest request, HttpServletResponse response)throws Exception{
//
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//
//
//    }
//
//}
