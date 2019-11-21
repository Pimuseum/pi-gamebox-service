package com.pi.admin.mapper;

import com.pi.admin.model.wow.WowGroupMember;
import com.pi.admin.model.wow.WowGroupMemberExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WowGroupMemberMapper {
    int countByExample(WowGroupMemberExample example);

    int deleteByExample(WowGroupMemberExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WowGroupMember record);

    int insertSelective(WowGroupMember record);

    List<WowGroupMember> selectByExample(WowGroupMemberExample example);

    WowGroupMember selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WowGroupMember record, @Param("example") WowGroupMemberExample example);

    int updateByExample(@Param("record") WowGroupMember record, @Param("example") WowGroupMemberExample example);

    int updateByPrimaryKeySelective(WowGroupMember record);

    int updateByPrimaryKey(WowGroupMember record);
}