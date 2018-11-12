package com.zjw.springcloud.springcloudprovider.controller;

import com.zjw.springcloud.springcloudpojo.pojo.Users;
import com.zjw.springcloud.springcloudpojo.pojo.UsersExample;
import com.zjw.springcloud.springcloudprovider.mapper.UsersMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private UsersMapper usersMapper;

    @GetMapping("/user/{id}")
    public Users getUser(@PathVariable Integer id){
        Users users = usersMapper.selectByPrimaryKey(id);
        users.setUsername("赵进伟");
        return users;
    }
    @RequestMapping("/user")
    public Users getUser(@RequestBody Users users){
        UsersExample example=new UsersExample();
        UsersExample.Criteria criteria = example.createCriteria();
        String username = users.getUsername();
        if (username!=null){
            criteria.andUsernameEqualTo(username);
        }
        String tel = users.getTel();
        if (tel!=null){
            criteria.andTelEqualTo(tel);
        }
        List<Users> usersList = usersMapper.selectByExample(example);
        if (usersList!=null && usersList.size()==1){
            users=usersList.get(0);
            users.setUsername(username+"1");
            return users;
        }
        return null;
    }
}
