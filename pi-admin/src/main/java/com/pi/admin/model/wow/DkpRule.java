package com.pi.admin.model.wow;



/**
 * @author Gturn
 * @Title: DkpRule
 * @ProjectName pi-general-server
 * @Description: TODO
 * @date 2019/12/26 10:33
 */

public class DkpRule {
    private Boolean isDutyDkp;

    private Integer generalDkp;

    private Integer tankDkp;

    private Integer healerDkp;

    private Integer dpsDkp;

    public Boolean getIsDutyDkp() {
        return isDutyDkp;
    }

    public void setIsDutyDkp(Boolean dutyDkp) {
        isDutyDkp = dutyDkp;
    }

    public Integer getGeneralDkp() {
        return generalDkp;
    }

    public void setGeneralDkp(Integer generalDkp) {
        this.generalDkp = generalDkp;
    }

    public Integer getTankDkp() {
        return tankDkp;
    }

    public void setTankDkp(Integer tankDkp) {
        this.tankDkp = tankDkp;
    }

    public Integer getHealerDkp() {
        return healerDkp;
    }

    public void setHealerDkp(Integer healerDkp) {
        this.healerDkp = healerDkp;
    }

    public Integer getDpsDkp() {
        return dpsDkp;
    }

    public void setDpsDkp(Integer dpsDkp) {
        this.dpsDkp = dpsDkp;
    }
}
