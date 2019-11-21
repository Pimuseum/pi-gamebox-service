package com.pi.admin.model.wow;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.Date;

public class WowGroupMember {
    private Long id;
    @ApiModelProperty(value = "参团角色id", required = true)
    @NotEmpty(message = "参团角色id不能为空")
    private Long wowerId;
    @ApiModelProperty(value = "团id", required = true)
    @NotEmpty(message = "团id不能为空")
    private Long groupId;
    @ApiModelProperty(value = "活动团职责", required = true)
    private Integer groupDutyType = WowDuty.PI_WOW_DPS.getType();
    @ApiModelProperty(value = "计划上线时间", required = true)
    @NotEmpty(message = "计划上线时间不能为空")
    private Date planBeginPlaytime;
    @ApiModelProperty(value = "计划下线时间", required = true)
    @NotEmpty(message = "计划下线时间不能为空")
    private Date planEndPlaytime;
    @ApiModelProperty(value = "团员备注", required = true)
    private String desc;
    @ApiModelProperty(value = "参团天赋", required = true)
    @NotEmpty(message = "参团天赋不能为空")
    private String groupGenius;
    @ApiModelProperty(value = "是否删除", required = true)
    private Boolean del;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWowerId() {
        return wowerId;
    }

    public void setWowerId(Long wowerId) {
        this.wowerId = wowerId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Integer getGroupDutyType() {
        return groupDutyType;
    }

    public void setGroupDutyType(Integer groupDutyType) {
        this.groupDutyType = groupDutyType;
    }

    public Date getPlanBeginPlaytime() {
        return planBeginPlaytime;
    }

    public void setPlanBeginPlaytime(Date planBeginPlaytime) {
        this.planBeginPlaytime = planBeginPlaytime;
    }

    public Date getPlanEndPlaytime() {
        return planEndPlaytime;
    }

    public void setPlanEndPlaytime(Date planEndPlaytime) {
        this.planEndPlaytime = planEndPlaytime;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public String getGroupGenius() {
        return groupGenius;
    }

    public void setGroupGenius(String groupGenius) {
        this.groupGenius = groupGenius == null ? null : groupGenius.trim();
    }

    public Boolean getDel() {
        return del;
    }

    public void setDel(Boolean del) {
        this.del = del;
    }
}