package com.pi.admin.service;

import com.pi.admin.model.wow.DkpLog;
import com.pi.admin.model.wow.WowGroup;

import java.util.List;

/**
 * @author Gturn
 * @Title: WowGroupDkpService
 * @ProjectName pi-general-server
 * @Description: TODO
 * @date 2019/11/21 16:08
 */

public interface WowGroupDkpService {
    Integer openDkpGroup(WowGroup wowGroup);

    Integer updateDkpGroup(WowGroup wowGroup);

    Integer cancelDkpGroup(Long groupId, Boolean flag);

    Integer delDkpGroup(Long groupId, Boolean flag);

    List<WowGroup> QueryDkpGroup(String note);

    WowGroup getDkpGroupDetail(Long gourpId);

    List<DkpLog> settlementGroupDkpPreview(Long gourpId);

    void settlementGroupDkp(List<DkpLog> dkpLogs, String note);
}
