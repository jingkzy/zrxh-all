package com.zrxh.pingche.data.dao;

import com.zrxh.pingche.data.entity.InspPaint;
import com.zrxh.pingche.data.entity.InspPaintExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspPaintMapper {
    int countByExample(InspPaintExample example);

    int deleteByPrimaryKey(String id);

    int insert(InspPaint record);

    int insertSelective(InspPaint record);

    List<InspPaint> selectByExample(InspPaintExample example);

    InspPaint selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") InspPaint record, @Param("example") InspPaintExample example);

    int updateByExample(@Param("record") InspPaint record, @Param("example") InspPaintExample example);

    int updateByPrimaryKeySelective(InspPaint record);

    int updateByPrimaryKey(InspPaint record);
}