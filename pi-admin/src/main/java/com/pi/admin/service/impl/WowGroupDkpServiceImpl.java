package com.pi.admin.service.impl;

import com.pi.admin.model.wow.DkpLog;
import com.pi.admin.model.wow.WowGroup;
import com.pi.admin.service.WowGroupDkpService;
import org.springframework.stereotype.Service;

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
    @Override
    public Integer openDkpGroup(WowGroup wowGroup) {
        return null;
    }

    @Override
    public Integer updateDkpGroup(WowGroup wowGroup) {
        return null;
    }

    @Override
    public Integer cancelDkpGroup(Long groupId, Boolean flag) {
        return null;
    }

    @Override
    public Integer delDkpGroup(Long groupId, Boolean flag) {
        return null;
    }

    @Override
    public List<WowGroup> QueryDkpGroup(String note) {
        return null;
    }

    @Override
    public WowGroup getDkpGroupDetail(Long gourpId) {
        return null;
    }

    @Override
    public List<DkpLog> settlementGroupDkpPreview(Long gourpId) {
        return null;
    }

    @Override
    public void settlementGroupDkp(List<DkpLog> dkpLogs, String note) {

    }
}
