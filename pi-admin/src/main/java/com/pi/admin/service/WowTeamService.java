package com.pi.admin.service;

import com.pi.admin.model.dto.WowTeamParam;
import com.pi.admin.model.wow.WowTeam;

/**
 * @author Gturn
 * @Title: WowTeamService
 * @ProjectName pi-general-server
 * @Description: TODO
 * @date 2019/11/21 16:07
 */

public interface WowTeamService {
    Integer creatTeam(WowTeam wowTeam);

    Integer updateTeam(WowTeam wowTeam);

    WowTeamParam teamInfo(String note);
}
