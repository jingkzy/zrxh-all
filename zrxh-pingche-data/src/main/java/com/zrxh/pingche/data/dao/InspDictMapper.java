package com.zrxh.pingche.data.dao;

import com.zrxh.pingche.data.entity.InspDict;
import com.zrxh.pingche.data.entity.InspDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspDictMapper {
    int countByExample(InspDictExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InspDict record);

    int insertSelective(InspDict record);

    List<InspDict> selectByExample(InspDictExample example);

    InspDict selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InspDict record, @Param("example") InspDictExample example);

    int updateByExample(@Param("record") InspDict record, @Param("example") InspDictExample example);

    int updateByPrimaryKeySelective(InspDict record);

    int updateByPrimaryKey(InspDict record);
}