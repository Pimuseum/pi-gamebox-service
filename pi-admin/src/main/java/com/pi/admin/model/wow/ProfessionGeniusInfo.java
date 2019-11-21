package com.pi.admin.model.wow;

public class ProfessionGeniusInfo {
    private Integer id;

    private Integer parentId;

    private String professionGeniusName;

    private String dutyTypes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getProfessionGeniusName() {
        return professionGeniusName;
    }

    public void setProfessionGeniusName(String professionGeniusName) {
        this.professionGeniusName = professionGeniusName == null ? null : professionGeniusName.trim();
    }

    public String getDutyTypes() {
        return dutyTypes;
    }

    public void setDutyTypes(String dutyTypes) {
        this.dutyTypes = dutyTypes == null ? null : dutyTypes.trim();
    }
}