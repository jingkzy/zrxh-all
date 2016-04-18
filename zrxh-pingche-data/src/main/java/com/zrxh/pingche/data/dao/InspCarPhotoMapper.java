package com.zrxh.pingche.data.dao;

import com.zrxh.pingche.data.entity.InspCarPhoto;
import com.zrxh.pingche.data.entity.InspCarPhotoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspCarPhotoMapper {
    int countByExample(InspCarPhotoExample example);

    int deleteByPrimaryKey(String id);

    int insert(InspCarPhoto record);

    int insertSelective(InspCarPhoto record);

    List<InspCarPhoto> selectByExample(InspCarPhotoExample example);

    InspCarPhoto selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") InspCarPhoto record, @Param("example") InspCarPhotoExample example);

    int updateByExample(@Param("record") InspCarPhoto record, @Param("example") InspCarPhotoExample example);

    int updateByPrimaryKeySelective(InspCarPhoto record);

    int updateByPrimaryKey(InspCarPhoto record);
}