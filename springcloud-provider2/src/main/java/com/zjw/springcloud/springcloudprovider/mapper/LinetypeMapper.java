package com.zjw.springcloud.springcloudprovider.mapper;

import com.zjw.springcloud.springcloudpojo.pojo.Linetype;
import com.zjw.springcloud.springcloudpojo.pojo.LinetypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LinetypeMapper {
    long countByExample(LinetypeExample example);

    int deleteByExample(LinetypeExample example);

    int deleteByPrimaryKey(Integer linetypeid);

    int insert(Linetype record);

    int insertSelective(Linetype record);

    List<Linetype> selectByExample(LinetypeExample example);

    Linetype selectByPrimaryKey(Integer linetypeid);

    int updateByExampleSelective(@Param("record") Linetype record, @Param("example") LinetypeExample example);

    int updateByExample(@Param("record") Linetype record, @Param("example") LinetypeExample example);

    int updateByPrimaryKeySelective(Linetype record);

    int updateByPrimaryKey(Linetype record);
}