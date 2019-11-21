package com.pi.admin.mapper;

import com.pi.admin.model.wow.WowerInfo;
import com.pi.admin.model.wow.WowerInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WowerInfoMapper {
    int countByExample(WowerInfoExample example);

    int deleteByExample(WowerInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WowerInfo record);

    int insertSelective(WowerInfo record);

    List<WowerInfo> selectByExample(WowerInfoExample example);

    WowerInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WowerInfo record, @Param("example") WowerInfoExample example);

    int updateByExample(@Param("record") WowerInfo record, @Param("example") WowerInfoExample example);

    int updateByPrimaryKeySelective(WowerInfo record);

    int updateByPrimaryKey(WowerInfo record);
}