package com.zrxh.pingche.data.dao;

import com.zrxh.pingche.data.entity.InspFailureBurningcar;
import com.zrxh.pingche.data.entity.InspFailureBurningcarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspFailureBurningcarMapper {
    int countByExample(InspFailureBurningcarExample example);

    int deleteByPrimaryKey(String id);

    int insert(InspFailureBurningcar record);

    int insertSelective(InspFailureBurningcar record);

    List<InspFailureBurningcar> selectByExample(InspFailureBurningcarExample example);

    InspFailureBurningcar selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") InspFailureBurningcar record, @Param("example") InspFailureBurningcarExample example);

    int updateByExample(@Param("record") InspFailureBurningcar record, @Param("example") InspFailureBurningcarExample example);

    int updateByPrimaryKeySelective(InspFailureBurningcar record);

    int updateByPrimaryKey(InspFailureBurningcar record);
}