package com.zrxh.pingche.data.dao;

import com.zrxh.pingche.data.entity.InspCompreExteriorinterior;
import com.zrxh.pingche.data.entity.InspCompreExteriorinteriorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspCompreExteriorinteriorMapper {
    int countByExample(InspCompreExteriorinteriorExample example);

    int deleteByPrimaryKey(String id);

    int insert(InspCompreExteriorinterior record);

    int insertSelective(InspCompreExteriorinterior record);

    List<InspCompreExteriorinterior> selectByExample(InspCompreExteriorinteriorExample example);

    InspCompreExteriorinterior selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") InspCompreExteriorinterior record, @Param("example") InspCompreExteriorinteriorExample example);

    int updateByExample(@Param("record") InspCompreExteriorinterior record, @Param("example") InspCompreExteriorinteriorExample example);

    int updateByPrimaryKeySelective(InspCompreExteriorinterior record);

    int updateByPrimaryKey(InspCompreExteriorinterior record);
}