package com.pi.admin.model.dto;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Gturn
 * @Title: MemberQuery
 * @ProjectName pi-general-server
 * @Description: TODO
 * @date 2019/11/22 11:26
 */

public class MemberQuery {
    @ApiModelProperty(value = "玩家名", required = true)
    private String wowName;
    @ApiModelProperty(value = "所属团队", required = true)
    @NotEmpty(message = "所属团队不能为空")
    private Integer teamId;
    @ApiModelProperty(value = "职责类型", required = true)
    private String teamDuty;

    public String getWowName() {
        return wowName;
    }

    public void setWowName(String wowName) {
        this.wowName = wowName;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getTeamDuty() {
        return teamDuty;
    }

    public void setTeamDuty(String teamDuty) {
        this.teamDuty = teamDuty;
    }
}
