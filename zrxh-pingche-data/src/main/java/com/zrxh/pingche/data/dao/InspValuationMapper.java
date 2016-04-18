package com.zrxh.pingche.data.dao;

import com.zrxh.pingche.data.entity.InspValuation;
import com.zrxh.pingche.data.entity.InspValuationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspValuationMapper {
    int countByExample(InspValuationExample example);

    int deleteByPrimaryKey(String id);

    int insert(InspValuation record);

    int insertSelective(InspValuation record);

    List<InspValuation> selectByExample(InspValuationExample example);

    InspValuation selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") InspValuation record, @Param("example") InspValuationExample example);

    int updateByExample(@Param("record") InspValuation record, @Param("example") InspValuationExample example);

    int updateByPrimaryKeySelective(InspValuation record);

    int updateByPrimaryKey(InspValuation record);
}