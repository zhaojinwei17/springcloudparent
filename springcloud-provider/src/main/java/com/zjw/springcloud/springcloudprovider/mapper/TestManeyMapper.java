package com.zjw.springcloud.springcloudprovider.mapper;

import com.zjw.springcloud.springcloudpojo.pojo.TestManey;
import com.zjw.springcloud.springcloudpojo.pojo.TestManeyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestManeyMapper {
    long countByExample(TestManeyExample example);

    int deleteByExample(TestManeyExample example);

    int deleteByPrimaryKey(Long maneyId);

    int insert(TestManey record);

    int insertSelective(TestManey record);

    List<TestManey> selectByExample(TestManeyExample example);

    TestManey selectByPrimaryKey(Long maneyId);

    int updateByExampleSelective(@Param("record") TestManey record, @Param("example") TestManeyExample example);

    int updateByExample(@Param("record") TestManey record, @Param("example") TestManeyExample example);

    int updateByPrimaryKeySelective(TestManey record);

    int updateByPrimaryKey(TestManey record);
}