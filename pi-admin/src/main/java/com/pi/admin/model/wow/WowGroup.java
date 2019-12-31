package com.pi.admin.model.wow;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.Date;
import java.util.List;

public class WowGroup {
    private Long id;
    @ApiModelProperty(value = "团名称")
    @NotEmpty(message = "团名称不能为空")
    private String groupName;
    @ApiModelProperty(value = "团描述")
    private String groupDesc;
    @ApiModelProperty(value = "成团数")
    @NotEmpty(message = "成团数不能为空")
    private Integer groupNum;
    @ApiModelProperty(value = "已报名人数")
    private Integer groupJoinNum;
    @ApiModelProperty(value = "团DKP规则")
    private String groupDkpRule;
    @ApiModelProperty(value = "活动团开始时间")
    @NotEmpty(message = "活动团开始时间不能为空")
    private Date groupBeginTime;
    @ApiModelProperty(value = "活动团结束时间")
    @NotEmpty(message = "活动团结束时间不能为空")
    private Date groupEndTime;
    @ApiModelProperty(value = "创建者")
    @NotEmpty(message = "创建者不能为空")
    private String creater;
    @ApiModelProperty(value = "创建时间")
    private Date createTime;
    @ApiModelProperty(value = "修改时间")
    private Date updateTime;
    @ApiModelProperty(value = "是否有效")
    private Boolean effect = true;
    @ApiModelProperty(value = "是否结算")
    private Boolean settlement = false;
    @ApiModelProperty(value = "团长自定义Dkp")
    private String leaderCustom;
    @ApiModelProperty(value = "是否删除")
    private Boolean del;

    private List<WowGroupMember> members;

    public List<WowGroupMember> getMembers() {
        return members;
    }

    public void setMembers(List<WowGroupMember> members) {
        this.members = members;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getGroupDesc() {
        return groupDesc;
    }

    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc == null ? null : groupDesc.trim();
    }

    public Integer getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(Integer groupNum) {
        this.groupNum = groupNum;
    }

    public Integer getGroupJoinNum() {
        return groupJoinNum;
    }

    public void setGroupJoinNum(Integer groupJoinNum) {
        this.groupJoinNum = groupJoinNum;
    }

    public String getGroupDkpRule() {
        return groupDkpRule;
    }

    public void setGroupDkpRule(String groupDkpRule) {
        this.groupDkpRule = groupDkpRule == null ? null : groupDkpRule.trim();
    }

    public Date getGroupBeginTime() {
        return groupBeginTime;
    }

    public void setGroupBeginTime(Date groupBeginTime) {
        this.groupBeginTime = groupBeginTime;
    }

    public Date getGroupEndTime() {
        return groupEndTime;
    }

    public void setGroupEndTime(Date groupEndTime) {
        this.groupEndTime = groupEndTime;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getEffect() {
        return effect;
    }

    public void setEffect(Boolean effect) {
        this.effect = effect;
    }

    public Boolean getSettlement() {
        return settlement;
    }

    public void setSettlement(Boolean settlement) {
        this.settlement = settlement;
    }

    public String getLeaderCustom() {
        return leaderCustom;
    }

    public void setLeaderCustom(String leaderCustom) {
        this.leaderCustom = leaderCustom == null ? null : leaderCustom.trim();
    }

    public Boolean getDel() {
        return del;
    }

    public void setDel(Boolean del) {
        this.del = del;
    }
}