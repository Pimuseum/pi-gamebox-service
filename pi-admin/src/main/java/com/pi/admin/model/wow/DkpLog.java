package com.pi.admin.model.wow;

public class DkpLog {
    private Long id;

    private Long memberId;

    private String wowName;

    private Integer changeDkpValue;

    private Integer originalDkp;

    private Integer modifiedDkp;

    private String changeMsg;

    private String operator;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getWowName() {
        return wowName;
    }

    public void setWowName(String wowName) {
        this.wowName = wowName == null ? null : wowName.trim();
    }

    public Integer getChangeDkpValue() {
        return changeDkpValue;
    }

    public void setChangeDkpValue(Integer changeDkpValue) {
        this.changeDkpValue = changeDkpValue;
    }

    public Integer getOriginalDkp() {
        return originalDkp;
    }

    public void setOriginalDkp(Integer originalDkp) {
        this.originalDkp = originalDkp;
    }

    public Integer getModifiedDkp() {
        return modifiedDkp;
    }

    public void setModifiedDkp(Integer modifiedDkp) {
        this.modifiedDkp = modifiedDkp;
    }

    public String getChangeMsg() {
        return changeMsg;
    }

    public void setChangeMsg(String changeMsg) {
        this.changeMsg = changeMsg == null ? null : changeMsg.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }
}