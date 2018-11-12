package com.zjw.springcloud.springcloudconsumer.controller;

import com.netflix.discovery.EurekaClient;
import com.zjw.springcloud.springcloudconsumer.remote.UserService;
import com.zjw.springcloud.springcloudpojo.pojo.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    private EurekaClient eurekaClient;
    @Resource
    UserService userService;

    @GetMapping("/user/{id}")
    public Users getUser(@PathVariable Integer id){
        Users user = userService.getUser( id);
        return user;
    }
    @RequestMapping("/user")
    public Users getUsers(){
        Users users=new Users();
//        users.setUsername("傅明远");
        users.setTel("13578983521");
        users=userService.getUsers(users);
        return users;
    }
    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
}
