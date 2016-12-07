package com.zrxh.pingche.data.dao;

import com.zrxh.pingche.data.entity.InspCarModel;
import com.zrxh.pingche.data.entity.InspCarModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspCarModelMapper {
    int countByExample(InspCarModelExample example);

    int deleteByPrimaryKey(String id);

    int insert(InspCarModel record);

    int insertSelective(InspCarModel record);

    List<InspCarModel> selectByExample(InspCarModelExample example);

    InspCarModel selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") InspCarModel record, @Param("example") InspCarModelExample example);

    int updateByExample(@Param("record") InspCarModel record, @Param("example") InspCarModelExample example);

    int updateByPrimaryKeySelective(InspCarModel record);

    int updateByPrimaryKey(InspCarModel record);
}