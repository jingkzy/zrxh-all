package com.zrxh.pingche.data.dao;

import com.zrxh.pingche.data.entity.InspVersion;
import com.zrxh.pingche.data.entity.InspVersionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspVersionMapper {
    int countByExample(InspVersionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InspVersion record);

    int insertSelective(InspVersion record);

    List<InspVersion> selectByExample(InspVersionExample example);

    InspVersion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InspVersion record, @Param("example") InspVersionExample example);

    int updateByExample(@Param("record") InspVersion record, @Param("example") InspVersionExample example);

    int updateByPrimaryKeySelective(InspVersion record);

    int updateByPrimaryKey(InspVersion record);
}