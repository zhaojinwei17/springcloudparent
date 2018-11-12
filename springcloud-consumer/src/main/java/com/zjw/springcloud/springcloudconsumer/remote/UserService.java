package com.zjw.springcloud.springcloudconsumer.remote;

import com.zjw.springcloud.springcloudpojo.pojo.Users;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(name= "springcloud-provider")
public interface UserService {

    @RequestMapping("/user/{id}")
    Users getUser(@RequestParam("id") Integer id);
    @RequestMapping("/user")
    Users getUsers(Users users);
}
