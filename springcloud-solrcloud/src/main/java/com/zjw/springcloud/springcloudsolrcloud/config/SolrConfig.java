package com.zjw.springcloud.springcloudsolrcloud.config;

import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SolrConfig {

    @Value("${spring.data.solr.zk-host}")
    private String skHost;

    @Bean
    public CloudSolrClient cloudSolrClient(){
        CloudSolrClient cloudSolrClient=new CloudSolrClient(skHost);
        cloudSolrClient.setDefaultCollection("collection");
        return cloudSolrClient;
    }
}
