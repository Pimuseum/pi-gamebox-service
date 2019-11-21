package com.pi.admin.model.wow;

import java.util.Date;

public class WowMemberInfo {
    private Long id;

    private String wxUserId;

    private String wowName;

    private String desc;

    private Integer teamId;

    private String teamDuty;

    private Integer dkp;

    private Long recentlyGroupId;

    private Date createTime;

    private Long inviterId;

    private Integer groupNum;

    private Boolean del;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWxUserId() {
        return wxUserId;
    }

    public void setWxUserId(String wxUserId) {
        this.wxUserId = wxUserId == null ? null : wxUserId.trim();
    }

    public String getWowName() {
        return wowName;
    }

    public void setWowName(String wowName) {
        this.wowName = wowName == null ? null : wowName.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
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
        this.teamDuty = teamDuty == null ? null : teamDuty.trim();
    }

    public Integer getDkp() {
        return dkp;
    }

    public void setDkp(Integer dkp) {
        this.dkp = dkp;
    }

    public Long getRecentlyGroupId() {
        return recentlyGroupId;
    }

    public void setRecentlyGroupId(Long recentlyGroupId) {
        this.recentlyGroupId = recentlyGroupId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getInviterId() {
        return inviterId;
    }

    public void setInviterId(Long inviterId) {
        this.inviterId = inviterId;
    }

    public Integer getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(Integer groupNum) {
        this.groupNum = groupNum;
    }

    public Boolean getDel() {
        return del;
    }

    public void setDel(Boolean del) {
        this.del = del;
    }
}