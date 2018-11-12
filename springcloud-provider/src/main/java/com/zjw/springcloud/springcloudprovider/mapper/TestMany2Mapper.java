package com.zjw.springcloud.springcloudprovider.mapper;

import com.zjw.springcloud.springcloudpojo.pojo.TestMany2;
import com.zjw.springcloud.springcloudpojo.pojo.TestMany2Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestMany2Mapper {
    long countByExample(TestMany2Example example);

    int deleteByExample(TestMany2Example example);

    int deleteByPrimaryKey(Long m2Id);

    int insert(TestMany2 record);

    int insertSelective(TestMany2 record);

    List<TestMany2> selectByExample(TestMany2Example example);

    TestMany2 selectByPrimaryKey(Long m2Id);

    int updateByExampleSelective(@Param("record") TestMany2 record, @Param("example") TestMany2Example example);

    int updateByExample(@Param("record") TestMany2 record, @Param("example") TestMany2Example example);

    int updateByPrimaryKeySelective(TestMany2 record);

    int updateByPrimaryKey(TestMany2 record);
}