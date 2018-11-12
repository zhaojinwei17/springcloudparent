package com.zjw.springcloud.springcloudsolrcloud.controller;

import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SolrController {
    @Resource
    CloudSolrClient cloudSolrClient;

    @RequestMapping("solrData")
    public String solrData() {
        System.out.println(cloudSolrClient);
        return "hello solrcloud!";
    }
}
