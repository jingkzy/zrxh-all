package com.zrxh.pingche.data.dao;

import com.zrxh.pingche.data.entity.InspFailureSkeleton;
import com.zrxh.pingche.data.entity.InspFailureSkeletonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspFailureSkeletonMapper {
    int countByExample(InspFailureSkeletonExample example);

    int deleteByPrimaryKey(String id);

    int insert(InspFailureSkeleton record);

    int insertSelective(InspFailureSkeleton record);

    List<InspFailureSkeleton> selectByExample(InspFailureSkeletonExample example);

    InspFailureSkeleton selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") InspFailureSkeleton record, @Param("example") InspFailureSkeletonExample example);

    int updateByExample(@Param("record") InspFailureSkeleton record, @Param("example") InspFailureSkeletonExample example);

    int updateByPrimaryKeySelective(InspFailureSkeleton record);

    int updateByPrimaryKey(InspFailureSkeleton record);
}