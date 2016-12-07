package com.zrxh.pingche.data.dao;

import com.zrxh.pingche.data.entity.InspCarConfigure;
import com.zrxh.pingche.data.entity.InspCarConfigureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspCarConfigureMapper {
    int countByExample(InspCarConfigureExample example);

    int deleteByPrimaryKey(String id);

    int insert(InspCarConfigure record);

    int insertSelective(InspCarConfigure record);

    List<InspCarConfigure> selectByExample(InspCarConfigureExample example);

    InspCarConfigure selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") InspCarConfigure record, @Param("example") InspCarConfigureExample example);

    int updateByExample(@Param("record") InspCarConfigure record, @Param("example") InspCarConfigureExample example);

    int updateByPrimaryKeySelective(InspCarConfigure record);

    int updateByPrimaryKey(InspCarConfigure record);
}