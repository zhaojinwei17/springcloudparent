package com.zjw.springcloud.springcloudprovider.mapper;

import com.zjw.springcloud.springcloudpojo.pojo.TestMany1;
import com.zjw.springcloud.springcloudpojo.pojo.TestMany1Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestMany1Mapper {
    long countByExample(TestMany1Example example);

    int deleteByExample(TestMany1Example example);

    int deleteByPrimaryKey(Long m1Id);

    int insert(TestMany1 record);

    int insertSelective(TestMany1 record);

    List<TestMany1> selectByExample(TestMany1Example example);

    TestMany1 selectByPrimaryKey(Long m1Id);

    int updateByExampleSelective(@Param("record") TestMany1 record, @Param("example") TestMany1Example example);

    int updateByExample(@Param("record") TestMany1 record, @Param("example") TestMany1Example example);

    int updateByPrimaryKeySelective(TestMany1 record);

    int updateByPrimaryKey(TestMany1 record);
}