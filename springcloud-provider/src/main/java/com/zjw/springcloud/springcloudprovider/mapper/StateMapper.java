package com.zjw.springcloud.springcloudprovider.mapper;

import com.zjw.springcloud.springcloudpojo.pojo.State;
import com.zjw.springcloud.springcloudpojo.pojo.StateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StateMapper {
    long countByExample(StateExample example);

    int deleteByExample(StateExample example);

    int deleteByPrimaryKey(Integer stateid);

    int insert(State record);

    int insertSelective(State record);

    List<State> selectByExample(StateExample example);

    State selectByPrimaryKey(Integer stateid);

    int updateByExampleSelective(@Param("record") State record, @Param("example") StateExample example);

    int updateByExample(@Param("record") State record, @Param("example") StateExample example);

    int updateByPrimaryKeySelective(State record);

    int updateByPrimaryKey(State record);
}