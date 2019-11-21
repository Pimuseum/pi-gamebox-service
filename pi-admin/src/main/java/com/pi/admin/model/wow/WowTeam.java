package com.pi.admin.model.wow;

import java.util.Date;

public class WowTeam {
    private Long id;

    private String teamName;

    private String teamDesc;

    private String teamNotice;

    private String teamPic;

    private String teamCreator;

    private Date teamCreateTime;

    private Boolean del;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName == null ? null : teamName.trim();
    }

    public String getTeamDesc() {
        return teamDesc;
    }

    public void setTeamDesc(String teamDesc) {
        this.teamDesc = teamDesc == null ? null : teamDesc.trim();
    }

    public String getTeamNotice() {
        return teamNotice;
    }

    public void setTeamNotice(String teamNotice) {
        this.teamNotice = teamNotice == null ? null : teamNotice.trim();
    }

    public String getTeamPic() {
        return teamPic;
    }

    public void setTeamPic(String teamPic) {
        this.teamPic = teamPic == null ? null : teamPic.trim();
    }

    public String getTeamCreator() {
        return teamCreator;
    }

    public void setTeamCreator(String teamCreator) {
        this.teamCreator = teamCreator == null ? null : teamCreator.trim();
    }

    public Date getTeamCreateTime() {
        return teamCreateTime;
    }

    public void setTeamCreateTime(Date teamCreateTime) {
        this.teamCreateTime = teamCreateTime;
    }

    public Boolean getDel() {
        return del;
    }

    public void setDel(Boolean del) {
        this.del = del;
    }
}