package com.zjw.springcloud.springcloudprovider.mapper;

import com.zjw.springcloud.springcloudpojo.pojo.OlDetail;
import com.zjw.springcloud.springcloudpojo.pojo.OlDetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OlDetailMapper {
    long countByExample(OlDetailExample example);

    int deleteByExample(OlDetailExample example);

    int insert(OlDetail record);

    int insertSelective(OlDetail record);

    List<OlDetail> selectByExample(OlDetailExample example);

    int updateByExampleSelective(@Param("record") OlDetail record, @Param("example") OlDetailExample example);

    int updateByExample(@Param("record") OlDetail record, @Param("example") OlDetailExample example);
}