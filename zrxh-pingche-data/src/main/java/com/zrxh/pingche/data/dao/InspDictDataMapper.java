package com.zrxh.pingche.data.dao;

import com.zrxh.pingche.data.entity.InspDictData;
import com.zrxh.pingche.data.entity.InspDictDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspDictDataMapper {
    int countByExample(InspDictDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InspDictData record);

    int insertSelective(InspDictData record);

    List<InspDictData> selectByExample(InspDictDataExample example);

    InspDictData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InspDictData record, @Param("example") InspDictDataExample example);

    int updateByExample(@Param("record") InspDictData record, @Param("example") InspDictDataExample example);

    int updateByPrimaryKeySelective(InspDictData record);

    int updateByPrimaryKey(InspDictData record);
}