package com.zjw.springcloud.springcloudprovider.mapper;

import com.zjw.springcloud.springcloudpojo.pojo.VPriceUserid;
import com.zjw.springcloud.springcloudpojo.pojo.VPriceUseridExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VPriceUseridMapper {
    long countByExample(VPriceUseridExample example);

    int deleteByExample(VPriceUseridExample example);

    int insert(VPriceUserid record);

    int insertSelective(VPriceUserid record);

    List<VPriceUserid> selectByExample(VPriceUseridExample example);

    int updateByExampleSelective(@Param("record") VPriceUserid record, @Param("example") VPriceUseridExample example);

    int updateByExample(@Param("record") VPriceUserid record, @Param("example") VPriceUseridExample example);
}