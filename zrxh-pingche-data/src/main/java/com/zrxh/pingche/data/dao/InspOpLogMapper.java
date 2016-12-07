package com.zrxh.pingche.data.dao;

import com.zrxh.pingche.data.entity.InspOpLog;
import com.zrxh.pingche.data.entity.InspOpLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspOpLogMapper {
    int countByExample(InspOpLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InspOpLog record);

    int insertSelective(InspOpLog record);

    List<InspOpLog> selectByExampleWithBLOBs(InspOpLogExample example);

    List<InspOpLog> selectByExample(InspOpLogExample example);

    InspOpLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InspOpLog record, @Param("example") InspOpLogExample example);

    int updateByExampleWithBLOBs(@Param("record") InspOpLog record, @Param("example") InspOpLogExample example);

    int updateByExample(@Param("record") InspOpLog record, @Param("example") InspOpLogExample example);

    int updateByPrimaryKeySelective(InspOpLog record);

    int updateByPrimaryKeyWithBLOBs(InspOpLog record);

    int updateByPrimaryKey(InspOpLog record);
}