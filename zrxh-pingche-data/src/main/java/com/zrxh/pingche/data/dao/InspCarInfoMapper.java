package com.zrxh.pingche.data.dao;

import com.zrxh.pingche.data.entity.InspCarInfo;
import com.zrxh.pingche.data.entity.InspCarInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspCarInfoMapper {
    int countByExample(InspCarInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(InspCarInfo record);

    int insertSelective(InspCarInfo record);

    List<InspCarInfo> selectByExample(InspCarInfoExample example);

    InspCarInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") InspCarInfo record, @Param("example") InspCarInfoExample example);

    int updateByExample(@Param("record") InspCarInfo record, @Param("example") InspCarInfoExample example);

    int updateByPrimaryKeySelective(InspCarInfo record);

    int updateByPrimaryKey(InspCarInfo record);
}