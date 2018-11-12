package com.zjw.springcloud.springcloudsolrcloud;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringcloudSolrcloudApplicationTests {

//    @Autowired
//    public CloudSolrClient cloudSolrClient;

    @Test
    public void contextLoads() {
//        SolrQuery query=new SolrQuery();
//        query.setQuery("三星");
//        query.set("df","item_keywords");
//        try {
//            QueryResponse response = cloudSolrClient.query(query);
//            SolrDocumentList results = response.getResults();
//            for (SolrDocument solrDocument:results) {
//                System.out.println(solrDocument);
//            }
//        } catch (SolrServerException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

}
