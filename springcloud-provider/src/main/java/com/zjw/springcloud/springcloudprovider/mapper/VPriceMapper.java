package com.zjw.springcloud.springcloudprovider.mapper;

import com.zjw.springcloud.springcloudpojo.pojo.VPrice;
import com.zjw.springcloud.springcloudpojo.pojo.VPriceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VPriceMapper {
    long countByExample(VPriceExample example);

    int deleteByExample(VPriceExample example);

    int insert(VPrice record);

    int insertSelective(VPrice record);

    List<VPrice> selectByExample(VPriceExample example);

    int updateByExampleSelective(@Param("record") VPrice record, @Param("example") VPriceExample example);

    int updateByExample(@Param("record") VPrice record, @Param("example") VPriceExample example);
}