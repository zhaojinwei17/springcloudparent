package com.zjw.springcloud.springcloudprovider.mapper;

import com.zjw.springcloud.springcloudpojo.pojo.M12Example;
import com.zjw.springcloud.springcloudpojo.pojo.M12Key;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface M12Mapper {
    long countByExample(M12Example example);

    int deleteByExample(M12Example example);

    int deleteByPrimaryKey(M12Key key);

    int insert(M12Key record);

    int insertSelective(M12Key record);

    List<M12Key> selectByExample(M12Example example);

    int updateByExampleSelective(@Param("record") M12Key record, @Param("example") M12Example example);

    int updateByExample(@Param("record") M12Key record, @Param("example") M12Example example);
}