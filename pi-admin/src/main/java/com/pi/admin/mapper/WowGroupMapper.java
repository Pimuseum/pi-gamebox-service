package com.pi.admin.mapper;

import com.pi.admin.model.wow.WowGroup;
import com.pi.admin.model.wow.WowGroupExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WowGroupMapper {
    int countByExample(WowGroupExample example);

    int deleteByExample(WowGroupExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WowGroup record);

    int insertSelective(WowGroup record);

    List<WowGroup> selectByExample(WowGroupExample example);

    WowGroup selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WowGroup record, @Param("example") WowGroupExample example);

    int updateByExample(@Param("record") WowGroup record, @Param("example") WowGroupExample example);

    int updateByPrimaryKeySelective(WowGroup record);

    int updateByPrimaryKey(WowGroup record);
}