package com.zrxh.pingche.data.dao;

import com.zrxh.pingche.data.entity.InspPhotoresult;
import com.zrxh.pingche.data.entity.InspPhotoresultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspPhotoresultMapper {
    int countByExample(InspPhotoresultExample example);

    int deleteByPrimaryKey(String id);

    int insert(InspPhotoresult record);

    int insertSelective(InspPhotoresult record);

    List<InspPhotoresult> selectByExample(InspPhotoresultExample example);

    InspPhotoresult selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") InspPhotoresult record, @Param("example") InspPhotoresultExample example);

    int updateByExample(@Param("record") InspPhotoresult record, @Param("example") InspPhotoresultExample example);

    int updateByPrimaryKeySelective(InspPhotoresult record);

    int updateByPrimaryKey(InspPhotoresult record);
}