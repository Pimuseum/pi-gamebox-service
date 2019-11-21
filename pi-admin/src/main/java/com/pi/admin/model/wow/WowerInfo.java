package com.pi.admin.model.wow;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

public class WowerInfo {
    private Long id;
    @ApiModelProperty(value = "角色名", required = true)
    @NotEmpty(message = "角色名不能为空")
    private String wowerName;
    @ApiModelProperty(value = "绑定微信号", required = true)
    private String wxUserId;
    @ApiModelProperty(value = "角色职业", required = true)
    @NotEmpty(message = "角色职业不能为空")
    private String wowerProfessionType;
    @ApiModelProperty(value = "角色装等", required = true)
    private Integer wowerEquipmentLevel;
    @ApiModelProperty(value = "角色头像", required = true)
    private String wowerHeadPic;
    @ApiModelProperty(value = "角色描述", required = true)
    private String desc;
    @ApiModelProperty(value = "是否删除", required = true)
    private Boolean del;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWowerName() {
        return wowerName;
    }

    public void setWowerName(String wowerName) {
        this.wowerName = wowerName == null ? null : wowerName.trim();
    }

    public String getWxUserId() {
        return wxUserId;
    }

    public void setWxUserId(String wxUserId) {
        this.wxUserId = wxUserId == null ? null : wxUserId.trim();
    }

    public String getWowerProfessionType() {
        return wowerProfessionType;
    }

    public void setWowerProfessionType(String wowerProfessionType) {
        this.wowerProfessionType = wowerProfessionType == null ? null : wowerProfessionType.trim();
    }

    public Integer getWowerEquipmentLevel() {
        return wowerEquipmentLevel;
    }

    public void setWowerEquipmentLevel(Integer wowerEquipmentLevel) {
        this.wowerEquipmentLevel = wowerEquipmentLevel;
    }

    public String getWowerHeadPic() {
        return wowerHeadPic;
    }

    public void setWowerHeadPic(String wowerHeadPic) {
        this.wowerHeadPic = wowerHeadPic == null ? null : wowerHeadPic.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public Boolean getDel() {
        return del;
    }

    public void setDel(Boolean del) {
        this.del = del;
    }
}