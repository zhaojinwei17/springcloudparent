package com.zjw.springcloud.springcloudprovider.mapper;

import com.zjw.springcloud.springcloudpojo.pojo.TestOne;
import com.zjw.springcloud.springcloudpojo.pojo.TestOneExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestOneMapper {
    long countByExample(TestOneExample example);

    int deleteByExample(TestOneExample example);

    int deleteByPrimaryKey(Long oneId);

    int insert(TestOne record);

    int insertSelective(TestOne record);

    List<TestOne> selectByExample(TestOneExample example);

    TestOne selectByPrimaryKey(Long oneId);

    int updateByExampleSelective(@Param("record") TestOne record, @Param("example") TestOneExample example);

    int updateByExample(@Param("record") TestOne record, @Param("example") TestOneExample example);

    int updateByPrimaryKeySelective(TestOne record);

    int updateByPrimaryKey(TestOne record);
}