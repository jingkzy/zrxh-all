package com.zrxh.pingche.data.dao;

import com.zrxh.pingche.data.entity.InspDictionary;
import com.zrxh.pingche.data.entity.InspDictionaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspDictionaryMapper {
    int countByExample(InspDictionaryExample example);

    int deleteByPrimaryKey(String id);

    int insert(InspDictionary record);

    int insertSelective(InspDictionary record);

    List<InspDictionary> selectByExample(InspDictionaryExample example);

    InspDictionary selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") InspDictionary record, @Param("example") InspDictionaryExample example);

    int updateByExample(@Param("record") InspDictionary record, @Param("example") InspDictionaryExample example);

    int updateByPrimaryKeySelective(InspDictionary record);

    int updateByPrimaryKey(InspDictionary record);
}