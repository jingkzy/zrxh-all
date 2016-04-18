package com.zrxh.pingche.data.dao;

import com.zrxh.pingche.data.entity.InspIllegal;
import com.zrxh.pingche.data.entity.InspIllegalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspIllegalMapper {
    int countByExample(InspIllegalExample example);

    int deleteByPrimaryKey(String id);

    int insert(InspIllegal record);

    int insertSelective(InspIllegal record);

    List<InspIllegal> selectByExample(InspIllegalExample example);

    InspIllegal selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") InspIllegal record, @Param("example") InspIllegalExample example);

    int updateByExample(@Param("record") InspIllegal record, @Param("example") InspIllegalExample example);

    int updateByPrimaryKeySelective(InspIllegal record);

    int updateByPrimaryKey(InspIllegal record);
}