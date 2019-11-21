package com.pi.admin.mapper;

import com.pi.admin.model.wow.ProfessionGeniusInfo;
import com.pi.admin.model.wow.ProfessionGeniusInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProfessionGeniusInfoMapper {
    int countByExample(ProfessionGeniusInfoExample example);

    int deleteByExample(ProfessionGeniusInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProfessionGeniusInfo record);

    int insertSelective(ProfessionGeniusInfo record);

    List<ProfessionGeniusInfo> selectByExample(ProfessionGeniusInfoExample example);

    ProfessionGeniusInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProfessionGeniusInfo record, @Param("example") ProfessionGeniusInfoExample example);

    int updateByExample(@Param("record") ProfessionGeniusInfo record, @Param("example") ProfessionGeniusInfoExample example);

    int updateByPrimaryKeySelective(ProfessionGeniusInfo record);

    int updateByPrimaryKey(ProfessionGeniusInfo record);
}