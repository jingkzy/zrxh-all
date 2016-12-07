package com.zrxh.pingche.data.dao;

import com.zrxh.pingche.data.entity.InspIllegalCategory;
import com.zrxh.pingche.data.entity.InspIllegalCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspIllegalCategoryMapper {
    int countByExample(InspIllegalCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InspIllegalCategory record);

    int insertSelective(InspIllegalCategory record);

    List<InspIllegalCategory> selectByExample(InspIllegalCategoryExample example);

    InspIllegalCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InspIllegalCategory record, @Param("example") InspIllegalCategoryExample example);

    int updateByExample(@Param("record") InspIllegalCategory record, @Param("example") InspIllegalCategoryExample example);

    int updateByPrimaryKeySelective(InspIllegalCategory record);

    int updateByPrimaryKey(InspIllegalCategory record);
}