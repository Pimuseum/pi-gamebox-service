package com.pi.admin.service.impl;

import com.alibaba.fastjson.JSON;
import com.pi.admin.mapper.DkpLogMapper;
import com.pi.admin.mapper.WowGroupMapper;
import com.pi.admin.mapper.WowGroupMemberMapper;
import com.pi.admin.mapper.WowMemberInfoMapper;
import com.pi.admin.model.wow.*;
import com.pi.admin.service.WowGroupDkpService;
import com.pi.common.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Gturn
 * @Title: WowGroupDkpServiceImpl
 * @ProjectName pi-general-server
 * @Description: TODO
 * @date 2019/11/21 16:11
 */
@Service
public class WowGroupDkpServiceImpl implements WowGroupDkpService {

    @Autowired
    private WowGroupMapper wowGroupMapper;
    @Autowired
    private WowGroupMemberMapper wowGroupMemberMapper;
    @Autowired
    private DkpLogMapper dkpLogMapper;
    @Autowired
    private WowMemberInfoMapper wowMemberInfoMapper;

    @Override
    public Integer openDkpGroup(WowGroup wowGroup) {
        return wowGroupMapper.insert(wowGroup);
    }

    @Override
    public Integer updateDkpGroup(WowGroup wowGroup) {
        return wowGroupMapper.updateByPrimaryKeySelective(wowGroup);
    }

    @Override
    public Integer cancelDkpGroup(Long groupId, Boolean flag) {
        WowGroup group = wowGroupMapper.selectByPrimaryKey(groupId);
        if (group == null || new Date().after(group.getGroupBeginTime())) {
            return 0;
        }
        WowGroup groupCancel = new WowGroup();
        groupCancel.setId(groupId);
        groupCancel.setEffect(flag);
        return wowGroupMapper.updateByPrimaryKeySelective(groupCancel);
    }

    @Override
    public Integer delDkpGroup(Long groupId, Boolean flag) {
        WowGroup group = wowGroupMapper.selectByPrimaryKey(groupId);
        if (group == null || (new Date().after(group.getGroupBeginTime()) && new Date().before(group.getGroupEndTime()))) {
            return 0;
        }
        WowGroup groupDel = new WowGroup();
        groupDel.setId(groupId);
        groupDel.setDel(flag);
        return wowGroupMapper.updateByPrimaryKeySelective(groupDel);
    }

    @Override
    public List<WowGroup> QueryDkpGroup(String note) {
        WowGroupExample selectByExample = new WowGroupExample();
        WowGroupExample.Criteria criteria = selectByExample.createCriteria();
        criteria.andCreaterEqualTo(note);
        criteria.andDelEqualTo(false);
        wowGroupMapper.selectByExample(selectByExample);
        return wowGroupMapper.selectByExample(selectByExample);
    }

    @Override
    public WowGroup getDkpGroupDetail(Long gourpId) {
        WowGroup group = wowGroupMapper.selectByPrimaryKey(gourpId);
        WowGroupMemberExample selectByExample = new WowGroupMemberExample();
        WowGroupMemberExample.Criteria criteria = selectByExample.createCriteria();
        criteria.andDelEqualTo(false);
        criteria.andGroupIdEqualTo(gourpId);
        List<WowGroupMember> wowGroupMembers = wowGroupMemberMapper.selectByExample(selectByExample);
        group.setMembers(wowGroupMembers);
        return group;
    }

    @Override
    public List<DkpLog> settlementGroupDkpPreview(Long gourpId) {
        WowGroup group = wowGroupMapper.selectByPrimaryKey(gourpId);
        WowGroupMemberExample selectByExample = new WowGroupMemberExample();
        WowGroupMemberExample.Criteria criteria = selectByExample.createCriteria();
        criteria.andDelEqualTo(false);
        criteria.andGroupIdEqualTo(gourpId);
        List<WowGroupMember> wowGroupMembers = wowGroupMemberMapper.selectByExample(selectByExample);
        DkpRule dkpRule = JSON.parseObject(group.getGroupDkpRule(), DkpRule.class);
        List<DkpLog> dkpLogs = new ArrayList<>();
        for (WowGroupMember wowGroupMember : wowGroupMembers) {
            WowMemberInfo wowMemberInfo = wowMemberInfoMapper.selectByPrimaryKey(wowGroupMember.getWowerId());
            DkpLog dkpLog = new DkpLog();
            //dkpLog.setOperator(Constant.SYS_OPERATE_CODE);
            dkpLog.setMemberId(wowGroupMember.getWowerId());
            dkpLog.setWowName(wowMemberInfo.getWowName());
            dkpLog.setOriginalDkp(wowMemberInfo.getDkp());
            if (dkpRule.getIsDutyDkp()) {
                if (wowGroupMember.getGroupDutyType().equals(WowDuty.PI_WOW_TANK.getType())) {
                    dkpLog.setChangeDkpValue(dkpRule.getTankDkp());
                }
                if (wowGroupMember.getGroupDutyType().equals(WowDuty.PI_WOW_HEALER.getType())) {
                    dkpLog.setChangeDkpValue(dkpRule.getHealerDkp());
                }
                if (wowGroupMember.getGroupDutyType().equals(WowDuty.PI_WOW_DPS.getType())) {
                    dkpLog.setChangeDkpValue(dkpRule.getDpsDkp());
                }
            } else {
                dkpLog.setChangeDkpValue(dkpRule.getGeneralDkp());
            }
            dkpLog.setModifiedDkp(wowMemberInfo.getDkp() + dkpLog.getChangeDkpValue());
            dkpLog.setChangeMsg(group.getGroupName() + "出勤活动系统计算");
            dkpLogs.add(dkpLog);
        }

        return dkpLogs;
    }

    @Override
    public void settlementGroupDkp(List<DkpLog> dkpLogs, String note, Long gourpId) {
        for (DkpLog dkpLog : dkpLogs) {
            WowMemberInfo wowMemberInfo = wowMemberInfoMapper.selectByPrimaryKey(dkpLog.getMemberId());
            dkpLog.setModifiedDkp(wowMemberInfo.getDkp() + dkpLog.getChangeDkpValue());
            dkpLog.setOperator(Constant.TEAM_LEADER_OPERATE_CODE+note);
            wowMemberInfo.setDkp(dkpLog.getModifiedDkp());
            wowMemberInfoMapper.updateByPrimaryKey(wowMemberInfo);
            dkpLogMapper.insertSelective(dkpLog);
        }
    }
}
