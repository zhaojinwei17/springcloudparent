package com.zjw.springcloud.springcloudredis;

import com.zjw.springcloud.springcloudredis.jedis.JedisClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringcloudRedisApplicationTests {

//    @Resource
//    JedisClient jedisClientCluster;

    @Test
    public void contextLoads() {
//        String users = jedisClientCluster.get("users");
//        System.out.println(users);
    }

}
