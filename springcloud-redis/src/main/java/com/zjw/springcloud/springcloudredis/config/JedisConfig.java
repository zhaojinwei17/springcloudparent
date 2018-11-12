package com.zjw.springcloud.springcloudredis.config;

import com.zjw.springcloud.springcloudredis.jedis.JedisClient;
import com.zjw.springcloud.springcloudredis.jedis.JedisClientCluster;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

@Configuration
public class JedisConfig {

    @Value("${spring.redis.cluster.nodes}")
    private String nodes;

    @Bean
    public JedisClient jedisClientCluster(){
        String[] split = nodes.split(",");
        Set<HostAndPort> hostAndPorts=new HashSet<>();
        for (String node : split) {
            String[] strs = node.split(":");
            HostAndPort hostAndPort=new HostAndPort(strs[0],Integer.valueOf(strs[1]));
            hostAndPorts.add(hostAndPort);
        }
        JedisCluster jedisCluster=new JedisCluster(hostAndPorts);
        JedisClientCluster jedisClient=new JedisClientCluster();
        jedisClient.setJedisCluster(jedisCluster);
        return jedisClient;
    }
}
