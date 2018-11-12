package com.zjw.springcloud.springcloudprovider.mapper;

import com.zjw.springcloud.springcloudpojo.pojo.OcDetail;
import com.zjw.springcloud.springcloudpojo.pojo.OcDetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OcDetailMapper {
    long countByExample(OcDetailExample example);

    int deleteByExample(OcDetailExample example);

    int insert(OcDetail record);

    int insertSelective(OcDetail record);

    List<OcDetail> selectByExample(OcDetailExample example);

    int updateByExampleSelective(@Param("record") OcDetail record, @Param("example") OcDetailExample example);

    int updateByExample(@Param("record") OcDetail record, @Param("example") OcDetailExample example);
}