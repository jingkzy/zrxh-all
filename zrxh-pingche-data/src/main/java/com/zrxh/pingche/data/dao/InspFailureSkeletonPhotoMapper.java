package com.zrxh.pingche.data.dao;

import com.zrxh.pingche.data.entity.InspFailureSkeletonPhoto;
import com.zrxh.pingche.data.entity.InspFailureSkeletonPhotoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspFailureSkeletonPhotoMapper {
    int countByExample(InspFailureSkeletonPhotoExample example);

    int deleteByPrimaryKey(String id);

    int insert(InspFailureSkeletonPhoto record);

    int insertSelective(InspFailureSkeletonPhoto record);

    List<InspFailureSkeletonPhoto> selectByExample(InspFailureSkeletonPhotoExample example);

    InspFailureSkeletonPhoto selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") InspFailureSkeletonPhoto record, @Param("example") InspFailureSkeletonPhotoExample example);

    int updateByExample(@Param("record") InspFailureSkeletonPhoto record, @Param("example") InspFailureSkeletonPhotoExample example);

    int updateByPrimaryKeySelective(InspFailureSkeletonPhoto record);

    int updateByPrimaryKey(InspFailureSkeletonPhoto record);
}