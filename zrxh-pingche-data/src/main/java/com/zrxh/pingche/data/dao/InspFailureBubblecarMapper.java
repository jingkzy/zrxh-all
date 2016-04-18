package com.zrxh.pingche.data.dao;

import com.zrxh.pingche.data.entity.InspFailureBubblecar;
import com.zrxh.pingche.data.entity.InspFailureBubblecarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspFailureBubblecarMapper {
    int countByExample(InspFailureBubblecarExample example);

    int deleteByPrimaryKey(String id);

    int insert(InspFailureBubblecar record);

    int insertSelective(InspFailureBubblecar record);

    List<InspFailureBubblecar> selectByExample(InspFailureBubblecarExample example);

    InspFailureBubblecar selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") InspFailureBubblecar record, @Param("example") InspFailureBubblecarExample example);

    int updateByExample(@Param("record") InspFailureBubblecar record, @Param("example") InspFailureBubblecarExample example);

    int updateByPrimaryKeySelective(InspFailureBubblecar record);

    int updateByPrimaryKey(InspFailureBubblecar record);
}