package com.pi.admin.service.impl;

import com.pi.admin.mapper.WowGroupMapper;
import com.pi.admin.mapper.WowMemberInfoMapper;
import com.pi.admin.mapper.WowTeamMapper;
import com.pi.admin.model.dto.WowTeamParam;
import com.pi.admin.model.wow.*;
import com.pi.admin.service.WowTeamService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Gturn
 * @Title: WowTeamService
 * @ProjectName pi-general-server
 * @Description: TODO
 * @date 2019/11/21 16:11
 */
@Service
public class WowTeamServiceImpl implements WowTeamService {

    @Autowired
    private WowTeamMapper wowTeamMapper;
    @Autowired
    private WowMemberInfoMapper wowMemberInfoMapper;
    @Autowired
    private WowGroupMapper wowGroupMapper;
    @Override
    public Integer creatTeam(WowTeam wowTeam) {
        WowTeamExample wowTeamExample = new WowTeamExample();
        WowTeamExample.Criteria criteria = wowTeamExample.createCriteria();
        criteria.andTeamCreatorEqualTo(wowTeam.getTeamCreator());
        criteria.andDelEqualTo(false);
        List<WowTeam> wowTeams = wowTeamMapper.selectByExample(wowTeamExample);
        if (wowTeam==null||wowTeams.isEmpty()){
            int i = wowTeamMapper.insertSelective(wowTeam);
            return i;
        }else {
            return 0;
        }
    }

    @Override
    public Integer updateTeam(WowTeam wowTeam) {
        int i = wowTeamMapper.updateByPrimaryKeySelective(wowTeam);
        return i;
    }

    @Override
    public WowTeamParam teamInfo(String note) {
        WowTeamExample wowTeamExample = new WowTeamExample();
        WowTeamExample.Criteria criteria = wowTeamExample.createCriteria();
        criteria.andTeamCreatorEqualTo(note);
        criteria.andDelEqualTo(false);
        List<WowTeam> wowTeams = wowTeamMapper.selectByExample(wowTeamExample);
        if (wowTeams!=null&&wowTeams.isEmpty()){
            WowTeam wowTeam = wowTeams.get(0);
            WowMemberInfoExample wowMemberExample = new WowMemberInfoExample();
            WowMemberInfoExample.Criteria wowMemberExampleCriteria = wowMemberExample.createCriteria();
            wowMemberExampleCriteria.andTeamIdEqualTo(wowTeam.getId().intValue());
            wowMemberExampleCriteria.andDelEqualTo(false);
            int memberCount = wowMemberInfoMapper.countByExample(wowMemberExample);
            WowMemberInfo wowMemberInf=wowMemberInfoMapper.selectByWxId(note);
            WowGroupExample wowGroupExample = new WowGroupExample();
            WowGroupExample.Criteria wowGroupExampleCriteria = wowGroupExample.createCriteria();
            wowGroupExampleCriteria.andCreaterEqualTo(note);
            wowGroupExampleCriteria.andDelEqualTo(false);
            int groupCount = wowGroupMapper.countByExample(wowGroupExample);
            WowTeamParam wowTeamParam = new WowTeamParam();
            BeanUtils.copyProperties(wowTeam,wowTeamParam);
            wowTeamParam.setTeamGroupNum(groupCount);
            wowTeamParam.setTeamMemberNum(memberCount);
            wowTeamParam.setLeaderMemberInfo(wowMemberInf);
            return wowTeamParam;
        }else {
            return null;
        }
    }
}
