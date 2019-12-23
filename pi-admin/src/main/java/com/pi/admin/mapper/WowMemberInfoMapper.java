package com.pi.admin.mapper;

import com.pi.admin.model.dto.MemberQuery;
import com.pi.admin.model.wow.WowMemberInfo;
import com.pi.admin.model.wow.WowMemberInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WowMemberInfoMapper {
    int countByExample(WowMemberInfoExample example);

    int deleteByExample(WowMemberInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WowMemberInfo record);

    int insertSelective(WowMemberInfo record);

    List<WowMemberInfo> selectByExample(WowMemberInfoExample example);

    WowMemberInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WowMemberInfo record, @Param("example") WowMemberInfoExample example);

    int updateByExample(@Param("record") WowMemberInfo record, @Param("example") WowMemberInfoExample example);

    int updateByPrimaryKeySelective(WowMemberInfo record);

    int updateByPrimaryKey(WowMemberInfo record);

    WowMemberInfo selectByWxId(String note);

    List<WowMemberInfo> queryTeamMembers(@Param("memberQuery") MemberQuery memberQuery);
}