package com.pi.admin.service;

import com.pi.admin.model.dto.MemberQuery;
import com.pi.admin.model.dto.WowTeamParam;
import com.pi.admin.model.wow.MemberDkpInfo;
import com.pi.admin.model.wow.WowGroupMember;
import com.pi.admin.model.wow.WowMemberInfo;
import com.pi.admin.model.wow.WowTeam;

import java.util.List;

/**
 * @author Gturn
 * @Title: WowTeamService
 * @ProjectName pi-general-server
 * @Description: TODO
 * @date 2019/11/21 16:07
 */

public interface WowTeamService {
    Integer createTeam(WowTeam wowTeam);

    Integer updateTeam(WowTeam wowTeam);

    WowTeamParam teamInfo(String note);

    List<WowMemberInfo> queryTeamMembers(MemberQuery memberQuery);

    void updateTeamMemberDKP(Long id, Integer dkp, String reasonMsg);

    Integer updateTeamMember(WowMemberInfo wowMemberInfo);

    Integer delTeamMember(Long id);

    WowTeamParam queryTeamInfoById(Long id);

    Integer createWowMemberInfo(WowMemberInfo memberInfo);

    void updateWowMemberInfo(WowMemberInfo memberInfo);

    Integer addGroupMember(WowGroupMember wowGroupMember);

    void updateGroupMember(WowGroupMember wowGroupMember);

    MemberDkpInfo myGroupDkpInfo(Long memberId);
}
