package com.pi.admin.mapper;

import com.pi.admin.model.wow.WowTeam;
import com.pi.admin.model.wow.WowTeamExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WowTeamMapper {
    int countByExample(WowTeamExample example);

    int deleteByExample(WowTeamExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WowTeam record);

    int insertSelective(WowTeam record);

    List<WowTeam> selectByExample(WowTeamExample example);

    WowTeam selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WowTeam record, @Param("example") WowTeamExample example);

    int updateByExample(@Param("record") WowTeam record, @Param("example") WowTeamExample example);

    int updateByPrimaryKeySelective(WowTeam record);

    int updateByPrimaryKey(WowTeam record);
}