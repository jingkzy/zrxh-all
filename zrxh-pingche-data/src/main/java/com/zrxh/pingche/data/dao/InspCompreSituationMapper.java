package com.zrxh.pingche.data.dao;

import com.zrxh.pingche.data.entity.InspCompreSituation;
import com.zrxh.pingche.data.entity.InspCompreSituationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspCompreSituationMapper {
    int countByExample(InspCompreSituationExample example);

    int deleteByPrimaryKey(String id);

    int insert(InspCompreSituation record);

    int insertSelective(InspCompreSituation record);

    List<InspCompreSituation> selectByExample(InspCompreSituationExample example);

    InspCompreSituation selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") InspCompreSituation record, @Param("example") InspCompreSituationExample example);

    int updateByExample(@Param("record") InspCompreSituation record, @Param("example") InspCompreSituationExample example);

    int updateByPrimaryKeySelective(InspCompreSituation record);

    int updateByPrimaryKey(InspCompreSituation record);
}